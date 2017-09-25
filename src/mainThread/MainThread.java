package mainThread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.DesktopManager;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import swingtutorial.SwingLogin;

public class MainThread extends JFrame {

    public MainThread() {
        super("Timer Demo");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ClockLabel clock = new ClockLabel();
        getContentPane().add(clock, BorderLayout.NORTH);
    }

    public static void main(String args[]) {

        JLabel account;
        JTextField txtAccount;
        JLabel password;
        JPasswordField txtPassword;
        JLabel email;
        JTextField txtEmail;
        JLabel birthday;
        JFormattedTextField txtBirthday;
        JLabel phone;
        JFormattedTextField txtPhone;
        JPanel panel;
        JButton btnRegister;
        JButton btnReset;
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ClockLabel clock = new ClockLabel();
        frame.getContentPane().add(clock, BorderLayout.NORTH);
        
        JDesktopPane desktop = new JDesktopPane();

        JInternalFrame internalFrame = new JInternalFrame("Screen Register", true, true, true, true);
        desktop.add(internalFrame);
        internalFrame.setBounds(50, 0, 600, 400);
        JLabel label = new JLabel(internalFrame.getTitle(), JLabel.CENTER);
        internalFrame.add(label, BorderLayout.CENTER);
        internalFrame.setLayout(null);
        
        account = new JLabel("Account");
        account.setBounds(100, 50, 100, 40);

        txtAccount = new JTextField();
        txtAccount.setBounds(220, 50, 300, 40);

        password = new JLabel("Password");
        password.setBounds(100, 95, 100, 40);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(220, 95, 300, 40);
        
        JLabel gender=new JLabel("Gender");
        gender.setBounds(100, 140, 100, 40);
        
        JRadioButton male=new JRadioButton("Male");
        male.setBounds(220, 140, 140, 40);
        
        
        JRadioButton female=new JRadioButton("Female");
        female.setBounds(380, 140, 140, 40);
        
        ButtonGroup btnGroup=new ButtonGroup();
        btnGroup.add(male);
        btnGroup.add(female);
        
        btnRegister = new JButton("Register");
        btnRegister.setBounds(220, 240, 140, 40);

        btnRegister.setBackground(Color.orange);

        btnReset = new JButton("Reset");
        btnReset.setBounds(380, 240, 140, 40);
        
        btnReset.setBackground(Color.orange);
        
        internalFrame.add(account);
        internalFrame.add(txtAccount);
        internalFrame.add(password);
        internalFrame.add(txtPassword);
        internalFrame.add(btnRegister);
        internalFrame.add(btnReset);
        internalFrame.add(gender);
        internalFrame.add(male);
        internalFrame.add(female);
        
        internalFrame.setVisible(true);
        frame.add(desktop, BorderLayout.CENTER);
        frame.setSize(800, 600);
        frame.setVisible(true);

    }
}

class ClockLabel extends JLabel implements ActionListener {

    public ClockLabel() {
        super(" " + new Date());
        Timer t = new Timer(1000, this);
        t.start();
    }

    public void actionPerformed(ActionEvent ae) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        setText(dateFormat.format(date).toString());
    }
}
