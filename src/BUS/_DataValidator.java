package BUS;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _DataValidator {

    // hàm xử lí validate của text field nhập xuất có trống hay không
    public static void validateEmpty(JTextField field, StringBuilder sb, String errorMessage) {
        if (field.getText().equals("")) {
            sb.append(String.format("%s\n", errorMessage));
            field.setBackground(Color.red);
            field.requestFocus();
        } else {
            field.setBackground(Color.WHITE);
        }
    }

    // hàm xử lí validate của text area nhập xuất có trống hay không
    public static void validateEmpty(JTextArea field, StringBuilder sb, String errorMessage) {
        if (field.getText().equals("")) {
            sb.append(String.format("%s\n", errorMessage));
            field.setBackground(Color.red);
            field.requestFocus();
        } else {
            field.setBackground(Color.WHITE);
        }
    }

    // hàm xử lí validate của group button nhập xuất có trống hay không
    public static void validateEmpty(ButtonGroup field, StringBuilder sb, String errorMessage) {
        if (field.getSelection() == null) {
            sb.append(String.format("%s\n", errorMessage));
        }
    }

    // hàm xử lí validate Số điện thoại bằng Regex
    public static void valitdatePhoneNumber(JTextField field, StringBuilder sb, String errorMessage) {
        String regex = "^0[0-9]{9}$";
        Pattern checkRegex = Pattern.compile(regex);
        Matcher status = checkRegex.matcher(field.getText());

        if(!status.find()) {
            sb.append(String.format("%s\n", errorMessage));
        }
    }

    // hàm xử lí validate Số điện thoại bằng Regex
    public static void valitdateCMND(JTextField field, StringBuilder sb, String errorMessage) {
        String regex = "^0[0-9]{11}$";
        Pattern checkRegex = Pattern.compile(regex);
        Matcher status = checkRegex.matcher(field.getText());

        if(!status.find()) {
            sb.append(String.format("%s\n", errorMessage));
        }
    }
}
