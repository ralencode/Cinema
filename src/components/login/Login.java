package components.login;

import components.Component;
import components.factory.ComponentFactory;

public class Login extends Component {
    private String login;
    private String password;
    

    public Login(ComponentFactory factory, Component parent) {
        super("Login page", factory, parent, false);
    }

    @Override
    public void display() {
        login = ui.getInput("Login: ");
        password = ui.getInput("Password: ");

        factory.setUser(login, password);
        factory.getTree().moveTo(0);
    }
}
