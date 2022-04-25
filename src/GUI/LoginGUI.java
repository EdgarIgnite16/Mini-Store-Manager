package GUI;

import BUS._DataValidator;
import BUS._MessageDialogHelper;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class LoginGUI extends javax.swing.JDialog {

    // Variables declaration - do not modify
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbAvatar;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JPanel pnMainForm;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JPasswordField txtPassword;

    /**
     * Creates new form LoginDialog
     */
    public LoginGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lbAvatar = new javax.swing.JLabel();
        pnMainForm = new javax.swing.JPanel();
        lbAccount = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Mini Store Manager");
        setResizable(false);

        lbAvatar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvatar.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8_online_store_64px_2.png")); // NOI18N

        pnMainForm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnMainForm.setBackground(new Color(225, 225, 225));

        lbAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbAccount.setText("Tên đăng nhập:");

        lbPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPassword.setText("Mật khẩu:");

        txtAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAccount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                txtAccountChangeUpdate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                txtAccountChangeUpdate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                txtAccountChangeUpdate(e);
            }
        });

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.setEnabled(false);
        btnLogin.setIcon(new javax.swing.ImageIcon("resource\\icon\\Login-icon-16.png"));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setText("Thoát");
        btnExit.setPreferredSize(new java.awt.Dimension(100, 26));
        btnExit.setIcon(new javax.swing.ImageIcon("resource\\icon\\Actions-edit-delete-icon-16.png"));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMainFormLayout = new javax.swing.GroupLayout(pnMainForm);
        pnMainForm.setLayout(pnMainFormLayout);
        pnMainFormLayout.setHorizontalGroup(
                pnMainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnMainFormLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(pnMainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnMainFormLayout.createSequentialGroup()
                                                .addGroup(pnMainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtPassword)
                                                        .addGroup(pnMainFormLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                                                .addComponent(btnLogin)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(12, 12, 12))
                                        .addGroup(pnMainFormLayout.createSequentialGroup()
                                                .addGroup(pnMainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lbPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbAccount))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(pnMainFormLayout.createSequentialGroup()
                                                .addComponent(txtAccount)
                                                .addContainerGap())))
        );
        pnMainFormLayout.setVerticalGroup(
                pnMainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnMainFormLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lbAccount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(pnMainFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnLogin)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnMainForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnMainForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        _DataValidator.validateEmpty(txtAccount, sb, "Vui lòng nhập tên tài khoản !");
        _DataValidator.validateEmpty(txtPassword, sb, "Vui lòng nhập mật khẩu !");

        if (sb.length() > 0) {
            _MessageDialogHelper.showErrorDialog(this, String.valueOf(sb), "Error Login");
        } else {
            try {
                String username = txtAccount.getText();
                String password = new String(txtPassword.getPassword());
                if (username.equals("ad") && password.equals("123")) {
                    this.dispose();
                    try {
                        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                        new MainFormGUI().setVisible(true);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    _MessageDialogHelper.showErrorDialog(this, "Tài khoản hoặc mật khẩu không chính xác !",
                            "Error Login");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                _MessageDialogHelper.showErrorDialog(this, ex.getMessage(), "Error Login");
            }
        }
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        if (_MessageDialogHelper.showConfirmDialog(this, "Bạn có muốn thoát khỏi chương trình không ?",
                "Xác nhận thoát") == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void txtAccountChangeUpdate(DocumentEvent e) {
        btnLogin.setEnabled(!txtAccount.getText().isEmpty());
    }
    // End of variables declaration
}
