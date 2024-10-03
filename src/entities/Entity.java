package entities;

public abstract class Entity<T extends Comparable<T>> {
    protected T primaryKey;

    public void setPrimaryKey(T primaryKey) {
        this.primaryKey = primaryKey;
    }

    public T getPrimaryKey() {
        return primaryKey;
    }
}
