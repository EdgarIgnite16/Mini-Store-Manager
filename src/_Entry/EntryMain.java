package _Entry;

import GUI.LoginGUI;

import javax.swing.*;

public class EntryMain {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new LoginGUI(new JFrame(), true).setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
