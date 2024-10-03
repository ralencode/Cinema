package ui;

import java.util.List;

public interface UserInterface {
    String getInput(String question);
    int option(List<String> options);
    void displayMessage(String message);
}
