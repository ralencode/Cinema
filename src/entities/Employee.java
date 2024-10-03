package entities;

public class Employee extends Entity<Integer> {
    private String userLogin;
    private float salary;
    private String password;
    private boolean isAdmin;

    public Employee(int id, String userLogin, float salary, String password, boolean isAdmin) {
        this.setPrimaryKey(id);
        this.setUserLogin(userLogin);
        this.setSalary(salary);
        this.setPassword(password);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
