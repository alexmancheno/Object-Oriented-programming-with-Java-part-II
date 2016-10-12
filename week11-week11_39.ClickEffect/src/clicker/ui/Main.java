package clicker.ui;

import javax.swing.SwingUtilities;
import clicker.applicationlogic.PersonalCalculator;

public class Main {

    public static void main(String[] args) {
        PersonalCalculator calculator = new PersonalCalculator();
        UserInterface ui = new UserInterface(calculator);
        SwingUtilities.invokeLater(ui);
    }
}
