/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ueda
 */
public class LoginForm extends JFrame {

    private JLabel lblAccount;
    private JLabel lblPassword;
    private JTextField txtAccount;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnReset;

    public LoginForm() {
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);

        this.lblAccount = new JLabel("Account");
        this.lblPassword = new JLabel("Password");
        this.txtAccount = new JTextField();
        this.txtPassword = new JPasswordField();
        this.btnLogin = new JButton("Login");
        this.btnReset = new JButton("Reset");

        this.lblAccount.setBounds(100, 100, 150, 40);
        this.lblPassword.setBounds(100, 145, 150, 40);
        this.txtAccount.setBounds(255, 100, 150, 40);
        this.txtPassword.setBounds(255, 145, 150, 40);
        this.btnLogin.setBounds(255, 190, 70, 40);
        this.btnReset.setBounds(330, 190, 70, 40);
        
        this.btnLogin.addActionListener(new LoginHandle());
        this.btnReset.addActionListener(new ResetHandle());

        this.add(this.btnLogin);
        this.add(this.btnReset);
        this.add(this.lblAccount);
        this.add(this.lblPassword);
        this.add(this.txtAccount);
        this.add(this.txtPassword);

        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class LoginHandle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Login success! with account: "+txtAccount.getText());
        }

    }
    
    class ResetHandle implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
        
    }

}
