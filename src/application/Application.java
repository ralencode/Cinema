package application;

import components.factory.ComponentFactory;
import entities.Occupation;
import entities.User;
import ui.CommandLineInterface;
import ui.UserInterface;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Application {
    private Map<String, Table<?>> tables = new HashMap<>();
    private State state = new State();
    private ComponentFactory factory;

    private UserInterface userInterface = new CommandLineInterface();

    public Application() {
        factory = new ComponentFactory(this);
    }

    public static void main(String[] args) {
        Application application = new Application();
        Table<User> userTable = new Table<>();
        application.tables.put("user", userTable);
        Table<User> occupationTable = new Table<>();
        application.tables.put("occupation", occupationTable);
        userTable.add(new User("ralen", "Ralen", "Oreti", new Date(), "1"));
        application.factory.displayCurrent();
    }

    @SuppressWarnings("unchecked")
    public boolean setUser(String login, String password) {
        Table<User> userTable = (Table<User>) tables.get("user");

        if (!userTable.exists(login)) {
            return false;
        }

        User user = userTable.getByPrimaryKey(login);

        if (!user.getPassword().equals(password)) {
            return false;
        }

        state.user = user;

        state.occupations = ((Table<Occupation>) tables.get("occupation")).findByField("userLogin", user.getPrimaryKey());
        state.isAdmin = false;
        for (Occupation occupation : state.occupations) {
            if (occupation.isAdmin()) {
                state.isAdmin = true;
                break;
            }
        }
        return true;
    }

    public UserInterface getUserInterface() {
        return userInterface;
    }

    public State getState() {
        return state;
    }
}
