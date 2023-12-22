package src;

import javax.swing.SwingUtilities;

import Forms.LoginForm;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm();
        });
    }

}
