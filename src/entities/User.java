package entities;

import java.util.Date;

public class User extends Entity<String> {
    private String name;
    private String surname;
    private Date birthday;
    private String password;

    public User(String login, String name, String surname, Date birthday, String password) {
        this.setPrimaryKey(login);
        this.setName(name);
        this.setSurname(surname);
        this.setBirthday(birthday);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
