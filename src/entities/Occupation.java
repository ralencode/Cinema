package entities;

public class Occupation extends Entity<Integer> {
    private String userLogin;
    private float salary;
    private boolean isAdmin;

    public Occupation(int id, String userLogin, float salary, boolean isAdmin) {
        this.setPrimaryKey(id);
        this.setUserLogin(userLogin);
        this.setSalary(salary);
        this.setAdmin(isAdmin);
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
