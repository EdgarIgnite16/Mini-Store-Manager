package BUS;

import DTO.LoaiMatHangDTO;

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

    // hàm xử lí validate có phải là số hay không
    public static void validateIsNumberAndInteger(JTextField field, StringBuilder sb, String errorMessage) {
        try {
            if(Integer.parseInt(field.getText()) <= 0) {
                sb.append(String.format("%s\n", errorMessage));
            }
        } catch (Exception ex) {
            sb.append(String.format("%s\n", errorMessage));
        }
    }

    // hàm xử lí validate Số điện thoại bằng Regex
    public static void valitdatePhoneNumber(JTextField field, StringBuilder sb, String errorMessage) {
        String regex = "^[0-9]{10}$";
        Pattern checkRegex = Pattern.compile(regex);
        Matcher status = checkRegex.matcher(field.getText());

        if (!status.find()) {
            sb.append(String.format("%s\n", errorMessage));
        }
    }

    // hàm xử lí validate Số điện thoại bằng Regex
    public static void valitdateCCCD(JTextField field, StringBuilder sb, String errorMessage) {
        String regex = "^[0-9]{12}$";
        Pattern checkRegex = Pattern.compile(regex);
        Matcher status = checkRegex.matcher(field.getText());

        if (!status.find()) {
            sb.append(String.format("%s\n", errorMessage));
        }
    }

    // hàm xử lí validate Mã nhân viên bằng Regex
    public static void valitdateMaNV(JTextField field, StringBuilder sb, String errorMessage) {
        String regex = "^NV[0-9]{3}$";
        Pattern checkRegex = Pattern.compile(regex);
        Matcher status = checkRegex.matcher(field.getText());

        if (!status.find()) {
            sb.append(String.format("%s\n", errorMessage));
        }
    }

    // hàm xử lí validate Mã khách hàng bằng Regex
    public static void valitdateMaKH(JTextField field, StringBuilder sb, String errorMessage) {
        String regex = "^KH[0-9]{3}$";
        Pattern checkRegex = Pattern.compile(regex);
        Matcher status = checkRegex.matcher(field.getText());

        if (!status.find()) {
            sb.append(String.format("%s\n", errorMessage));
        }
    }

    // hàm xử lí validate Mã mặt hàng bằng Regex
    public static void valitdateMaMH(JTextField field, StringBuilder sb, LoaiMatHangDTO loaiMatHangDTO) {
        String maMH = LoaiMatHangBUS.getMaMHDefault(loaiMatHangDTO.getMaLMH());
        String regex = "^" + maMH + "[0-9]{3}$";
        Pattern checkRegex = Pattern.compile(regex);
        Matcher status = checkRegex.matcher(field.getText());

        if (!status.find()) {
            String errorMessage = String.format("Vui lòng kiểm tra lại cú pháp!\nMã sản phẩm của %s là %s + (xxx)[STT]",
                    loaiMatHangDTO.getTenLMH(), maMH);
            sb.append(String.format("%s\n", errorMessage));
        }
    }
}
