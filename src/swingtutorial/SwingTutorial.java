/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ueda
 */
public class SwingTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame login = new JFrame("Hello");
        login.setSize(700, 500);
        login.setLocationRelativeTo(null);
        login.setLayout(null);

        JPanel pLogin = new JPanel();
//        pLogin.setSize(1000, 720);
        pLogin.setBackground(Color.PINK);
        pLogin.setLayout(null);
        pLogin.setBounds(100, 0, 500, 500);

        JLabel id=new JLabel("ID");
        id.setBounds(100, 100, 100, 40);
        
        JLabel name=new JLabel("Name");
        name.setBounds(100, 140, 100, 40);
        
        JLabel email=new JLabel("Email");
        email.setBounds(100, 180, 100, 40);
        
        JLabel phone=new JLabel("Phone");
        phone.setBounds(100, 220, 100, 40);
        
        JLabel rollNumber=new JLabel("Roll Number");
        rollNumber.setBounds(100, 260, 100, 40);
        
        JLabel className=new JLabel("Class Name");
        className.setBounds(100, 300, 100, 40);
        
        JTextField txtId=new JTextField();
        txtId.setBounds(200, 100, 200, 40);
        
        JTextField txtName=new JTextField();
        txtName.setBounds(200, 140, 200, 40);
        
        JTextField txtEmail=new JTextField();
        txtEmail.setBounds(200, 180, 200, 40);
        
        JTextField txtPhone=new JTextField();
        txtPhone.setBounds(200, 220, 200, 40);
        
        JTextField txtRollNumber=new JTextField();
        txtRollNumber.setBounds(200, 260, 200, 40);
        
        JTextField txtClassName=new JTextField();
        txtClassName.setBounds(200, 300, 200, 40);
        
        JButton btn=new JButton("Accept");;
        btn.setBounds(200, 340, 200, 40);
        
        
        
        
        pLogin.add(id);
        pLogin.add(name);
        pLogin.add(email);
        pLogin.add(phone);
        pLogin.add(rollNumber);
        pLogin.add(className);
        pLogin.add(txtId);
        pLogin.add(txtName);
        pLogin.add(txtEmail);
        pLogin.add(txtPhone);
        pLogin.add(txtRollNumber);
        pLogin.add(txtClassName);
        pLogin.add(btn);
        
        login.add(pLogin);
        
        
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
