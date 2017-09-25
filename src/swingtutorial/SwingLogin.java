/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author ueda
 */
public class SwingLogin extends JFrame {

    private JLabel account;
    private JTextField txtAccount;
    private JLabel password;
    private JPasswordField txtPassword;
    private JLabel email;
    private JTextField txtEmail;
    private JLabel birthday;
    private JFormattedTextField txtBirthday;
    private JLabel phone;
    private JFormattedTextField txtPhone;
    private JPanel panel;
    private JButton btnRegister;
    private JButton btnReset;

    public SwingLogin() {
        super("My login form");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ClockLabel clock = new ClockLabel();

        getContentPane().add(clock, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setBounds(100, 100, 600, 300);
        panel.setBackground(Color.CYAN);
        panel.setLayout(null);

        account = new JLabel("Account");
        account.setBounds(150, 50, 100, 40);

        txtAccount = new JTextField();
        txtAccount.setBounds(270, 50, 300, 40);

        password = new JLabel("Password");
        password.setBounds(150, 95, 100, 40);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(270, 95, 300, 40);

        email = new JLabel("Email");
        email.setBounds(150, 140, 100, 40);

        txtEmail = new JTextField();
        txtEmail.setBounds(270, 140, 300, 40);

        birthday = new JLabel("Birthday");
        birthday.setBounds(150, 185, 100, 40);
        try {
            MaskFormatter fmBirthday = new MaskFormatter("##/##/####");
            txtBirthday = new JFormattedTextField(fmBirthday);
            txtBirthday.setBounds(270, 185, 300, 40);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }

        phone = new JLabel("Phone");
        phone.setBounds(150, 230, 100, 40);
        try {
            MaskFormatter fmPhone = new MaskFormatter("+84(####)-###-###");
            txtPhone = new JFormattedTextField(fmPhone);
            txtPhone.setBounds(270, 230, 300, 40);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }

        btnRegister = new JButton("Register");
        btnRegister.setBounds(270, 315, 140, 40);
        btnRegister.addActionListener(new ButtonHandle());
        btnRegister.setBackground(Color.orange);

        btnReset = new JButton("Reset");
        btnReset.setBounds(430, 315, 140, 40);
        btnReset.addActionListener(new ResetHandle());
        btnReset.setBackground(Color.orange);

        panel.add(account);
        panel.add(txtAccount);
        panel.add(password);
        panel.add(txtPassword);
        panel.add(email);
        panel.add(txtEmail);
        panel.add(birthday);
        panel.add(txtBirthday);
        panel.add(phone);
        panel.add(txtPhone);
        panel.add(btnRegister);
        panel.add(btnReset);

        this.add(panel);

        this.setVisible(true);
        

    }

    public static void main(String[] args) {
        SwingLogin swingLogin = new SwingLogin();

    }

    class ButtonHandle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showConfirmDialog(null, "Are you sure?\n"
                    + "Account: " + account.getText() + "\n"
                    + "Email: " + txtEmail.getText() + "\n"
                    + "Phone: " + txtPhone.getText() + "\n"
                    + "Birthday: " + txtBirthday.getText() + "."
            );
            JOptionPane.showMessageDialog(null, "Register success!\n- Welcome to my world -");

        }

    }

    class ResetHandle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }

}

class ClockLabel extends JLabel implements ActionListener {

    public ClockLabel() {
        super("" + new Date());
        Timer t = new Timer(1000, this);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        setText(dateFormat.format(date).toString());
    }
}
