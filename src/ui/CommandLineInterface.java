package ui;

import java.util.List;
import java.util.Scanner;

public class CommandLineInterface implements UserInterface {
    @Override
    public String getInput(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int option(List<String> options) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= options.size(); i++) {
            System.out.printf("%s) %s\n", i, options.get(i - 1));
        }
        System.out.printf("%s) Back\n", options.size() + 1);
        int optionIndex = -1;
        while (0 > optionIndex || optionIndex > options.size()) {
            System.out.print("Select option: ");
            optionIndex = scanner.nextInt() - 1;
        }
        return optionIndex;
    }

    @Override
    public void displayMessage(String message) {
        System.out.printf("%s\n", message);
    }
}
