package components.factory;

import components.Component;
import components.login.Login;
import components.StartPage;
import components.login.Registration;
import components.login.Root;

public class ComponentTree {
    private Component root;
    private Component current;
    private ComponentFactory factory;

    public ComponentTree(ComponentFactory componentFactory) {
        factory = componentFactory;
        root = new Root(factory, null);
        root.getChildren().add(new Login(factory, root));
        root.getChildren().add(new Registration(factory, root));
        current = root;
        moveTo(0);
        StartPage startPage = new StartPage(factory, root);
        current.getChildren().add(new StartPage(factory, startPage));
        moveTo(2);
        moveTo(1);
        current.getChildren().add(new StartPage(factory, new StartPage(factory, startPage)));
    }

    public void moveTo(int index) {
        if (index >= current.getChildren().size()) {
            if (current != root) {
                current = current.getParent();
            }
        } else {
            current = current.getChildren().get(index);
        }
        factory.displayCurrent();
    }

    public Component getCurrent() {
        return current;
    }

    public Component getRoot() {
        return root;
    }
}
