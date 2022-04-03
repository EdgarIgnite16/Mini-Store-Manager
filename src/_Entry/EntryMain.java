package _Entry;

import javax.swing.*;

public class EntryMain {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
