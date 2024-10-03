package components.factory;

import application.Application;
import ui.UserInterface;

public class ComponentFactory {
    private final Application application;
    private final ComponentTree tree;

    public ComponentFactory(Application application) {
        this.application = application;
        this.tree = new ComponentTree(this);
    }

    @SuppressWarnings("unchecked")
    public void setUser(String login, String password) {
        if (!application.setUser(login, password)) {
            incorrectInput("Wrong login or password");
        }
    }

    private void incorrectInput(String message) {
        System.out.println(message);
        tree.getCurrent().display();
    }

    public UserInterface getUserInterface() {
        return application.getUserInterface();
    }

    public boolean isAdmin() {
        return application.getState().isAdmin;
    }

    public ComponentTree getTree() {
        return tree;
    }

    public void displayCurrent() {
        tree.getCurrent().display();
    }
}
