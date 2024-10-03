package entities;

public class Hall extends Entity<Integer> {
    private String name;

    public Hall(int id, String name) {
        this.setPrimaryKey(id);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
