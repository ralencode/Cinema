package components;

import components.factory.ComponentFactory;

public class StartPage extends Component {
    public StartPage(ComponentFactory factory, Component parent) {
        super("Start page", factory, parent, false);
    }

    @Override
    public void display() {
        ui.displayMessage("Welcome to the Cinema application!");
        super.display();
    }
}
