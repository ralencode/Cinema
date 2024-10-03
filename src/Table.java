import entities.Entity;

import java.util.LinkedList;
import java.util.List;

public class Table<T extends Entity<?>> {
    private final List<T> content;

    public Table() {
        this.content = new LinkedList<>();
    }

    @SuppressWarnings("unchecked") // we are checking that classes are same
    public T getByPrimaryKey(Comparable<?> primaryKey) {
        if (content.isEmpty()) {
            return null;
        }

        Comparable<?> firstPK = content.getFirst().getPrimaryKey();
        if (!firstPK.getClass().isInstance(primaryKey)) {
            throw new IllegalArgumentException(String.format("Searched primary key's type is not the same as type of primary keys of entities of the table. Searched key of type \"%s\", table contains entities with keys with type \"%s\"", firstPK.getClass().toString(), primaryKey.getClass().toString()));
        }

        int low = 0;
        int high = content.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            T current = content.get(mid);
            Comparable<Object> currentPK = (Comparable<Object>) current.getPrimaryKey();

            int comparison = currentPK.compareTo(primaryKey);
            if (comparison == 0) {
                return current;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public void add(T entity) {
        for (int i = content.size() - 1; i >= 0; i--) {
            int comparison = content.get(i).getPrimaryKey().compareTo(entity.getPrimaryKey());
            if (comparison <= 0) {
                if (comparison == 0) content.set(i, entity);
                else content.add(i + 1, entity);
                return;
            }
        }
        content.addFirst(entity);
    }

    public List<T> getContent() {
        return List.copyOf(content);
    }
}
