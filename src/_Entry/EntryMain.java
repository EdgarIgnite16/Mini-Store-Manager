package _Entry;

import GUI.DialogLoginGUI;

import javax.swing.*;

public class EntryMain {
    // hàm main chạy chương trình
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new DialogLoginGUI(new JFrame(), true).setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
