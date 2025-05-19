package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Exception;
import bank.management.system.Con;
import java.lang.Throwable;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textfield2;
    JPasswordField passwordfield3;
    JButton button1,button2,button3;

    Login(){

        super("Bank Management System");



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(350,10,100,100);
        add(image1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Icon/card.png"));
        Image i5 = i4.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(630,350,100,100);
        add(image2);

        label1 = new JLabel("Welcome To ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde", Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.white);
        label2.setBounds(150,190,375,30);
        add(label2);

        textfield2 = new JTextField(15);
        textfield2.setBounds(324,190,230,30);
        textfield2.setFont(new Font("Arial", Font.BOLD,28));
        add(textfield2);




        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.white);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordfield3 = new JPasswordField();
        passwordfield3.setBounds(325,250,230,30);
        passwordfield3.setFont(new Font("Arial",Font.BOLD,28));
        add(passwordfield3);


        button1 = new JButton("Sign In");
        button1.setFont(new Font("Arial", Font.BOLD,14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(325,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Clear");
        button2.setFont(new Font("Arial", Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(455,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("Sign Up");
        button3.setFont(new Font("Arial", Font.BOLD,14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(325,350,230,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("Icon/backbg.png"));
        Image i8 = i7.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon i9  = new ImageIcon(i8);
        JLabel image3 = new JLabel(i9);
        image3.setBounds(0,0,850,480);
        add(image3);




        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);

    }


    public static void main (String[] args) {
        new Login();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{

            if(e.getSource() == button1){

            }
            else if(e .getSource() == button2){
                textfield2.setText("");
                passwordfield3.setText("");
            }
            else if(e.getSource() == button3){

            }

        }catch(Exception E){

            E.printStackTrace();

        }


    }
}
