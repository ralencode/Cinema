package components;

import components.factory.ComponentFactory;
import ui.UserInterface;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    protected final ComponentFactory factory;
    protected final UserInterface ui;

    protected final boolean isAdminOnly;

    protected final Component parent;
    protected final List<Component> children = new ArrayList<>();

    protected final String name;

    public Component(String name, ComponentFactory factory, Component parent, boolean isAdminOnly) {
        this.factory = factory;
        ui = factory.getUserInterface();
        this.parent = parent;
        this.isAdminOnly = isAdminOnly;
        this.name = name;
    }

    public void display() {
        factory.getTree().moveTo(factory.getUserInterface().option(children.stream().filter(component -> !component.isAdminOnly() || factory.isAdmin()).map(Component::getName).toList()));
    }

    public boolean isAdminOnly() {
        return isAdminOnly;
    }

    public Component getParent() {
        return parent;
    }

    public List<Component> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }
}
