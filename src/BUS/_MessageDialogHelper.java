package BUS;

import javax.swing.*;
import java.awt.*;

public class _MessageDialogHelper {

    // show Msg Dialog thông thường
    public static void showMessageDialog(Component parent, String content, String title) {
        JOptionPane.showMessageDialog(parent, content, title, JOptionPane.INFORMATION_MESSAGE);
    }

    // show Msg Dialog lỗi
    public static void showErrorDialog(Component parent, String content, String title) {
        JOptionPane.showMessageDialog(parent, content, title, JOptionPane.ERROR_MESSAGE);
    }

    // show Msg Dialog lựa chọn
    public static int showConfirmDialog(Component parent, String content, String title) {
        return JOptionPane.showConfirmDialog(parent, content, title,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); // yes = 1, no = 0
    }
}
