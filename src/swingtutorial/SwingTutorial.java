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
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author ueda
 */
public class SwingTutorial extends JFrame{

    private JFrame login;
    private JPanel pLogin;
    private JLabel id;
    private JLabel name;
    private JLabel email;
    private JLabel phone;
    private JLabel birthday;
    private JLabel rollNumber;
    private JLabel className;
    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtEmail;
    private JFormattedTextField txtPhone;
    private JFormattedTextField txtBirthday;
    private JTextField txtRollNumber;
    private JTextField txtClassName;
    
    public SwingTutorial(){
         Clock clock=new Clock();
           getContentPane().add(clock, BorderLayout.NORTH);
    }
    
    public void prepareGUI() {
        login = new JFrame("Register");
        login.setSize(700, 500);
        login.setLocationRelativeTo(null);
        login.setLayout(null);

        pLogin = new JPanel();
//        pLogin.setSize(1000, 720);
        pLogin.setBackground(Color.PINK);
        pLogin.setLayout(null);
        pLogin.setBounds(100, 0, 500, 500);
        
        

        id = new JLabel("ID");
        id.setBounds(100, 100, 100, 40);

        name = new JLabel("Name");
        name.setBounds(100, 140, 100, 40);

        email = new JLabel("Email");
        email.setBounds(100, 180, 100, 40);

        phone = new JLabel("Phone");
        phone.setBounds(100, 220, 100, 40);
        
        birthday=new JLabel("Birthday");
        birthday.setBounds(100, 260, 100, 40);

        rollNumber = new JLabel("Roll Number");
        rollNumber.setBounds(100, 300, 100, 40);

        className = new JLabel("Class Name");
        className.setBounds(100, 340, 100, 40);

        txtId = new JTextField();
        txtId.setBounds(200, 100, 200, 40);

        txtName = new JTextField();
        txtName.setBounds(200, 140, 200, 40);

        txtEmail = new JTextField();
        txtEmail.setBounds(200, 180, 200, 40);

        try {
            MaskFormatter fmPhone = new MaskFormatter("+84(####)-###-###");
            txtPhone = new JFormattedTextField(fmPhone);
            txtPhone.setBounds(200, 220, 200, 40);
            pLogin.add(txtPhone);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }

        try {
            MaskFormatter fmBirthday = new MaskFormatter("##/##/####");
            txtBirthday = new JFormattedTextField(fmBirthday);
            txtBirthday.setBounds(200, 260, 200, 40);
            pLogin.add(txtBirthday);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }

        txtRollNumber = new JTextField();
        txtRollNumber.setBounds(200, 300, 200, 40);

        txtClassName = new JTextField();
        txtClassName.setBounds(200, 340, 200, 40);

        JButton btn = new JButton("Register");;
        btn.setBounds(200, 380, 200, 40);
        ButtonHandle btnHandle = new ButtonHandle();
        btn.addActionListener(btnHandle);

        pLogin.add(id);
        pLogin.add(name);
        pLogin.add(email);
        pLogin.add(phone);
        pLogin.add(rollNumber);
        pLogin.add(className);
        pLogin.add(txtId);
        pLogin.add(txtName);
        pLogin.add(txtEmail);
        pLogin.add(birthday);
        pLogin.add(txtRollNumber);
        pLogin.add(txtClassName);
        pLogin.add(btn);

        login.add(pLogin);

        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }

    public static void main(String[] args) {
//        LoginForm loginForm=new LoginForm();
//        loginForm.setVisible(true);
        SwingTutorial swingTutorial = new SwingTutorial();
        swingTutorial.prepareGUI();

    }

    class ButtonHandle implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            JOptionPane.showConfirmDialog(null, "Are you sure?\n"
                    + "ID: "+txtId.getText()+"\n"
                    + "Name: "+txtName.getText()+"\n"
                    + "Email: "+txtEmail.getText()+"\n"
                    + "Phone: "+txtPhone.getText()+"\n"
                    + "Birthday: "+txtBirthday.getText()+"\n"
                    + "Roll number: "+txtRollNumber.getText()+"\n"
                    + "Class name: "+txtClassName.getText()+"."
            );
            JOptionPane.showMessageDialog(null, "Register success!\n- Welcome to this program -");
            
        }

    }
    
    class Clock extends JLabel implements ActionListener{
        
        public Clock(){
            super(""+new Date());
            Timer time=new Timer(1000, this);
            time.start();
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            setText(dateFormat.format(date).toString());
            
        
        }
        
    }
    
    

}
