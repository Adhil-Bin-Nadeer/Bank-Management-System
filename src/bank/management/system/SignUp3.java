package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener {

    String formno;
    Random random = new Random();

    JButton submit, cancel;
    JRadioButton r1, r2, r3,r4;
    JCheckBox c1;
    JCheckBox c2;
    JCheckBox c3;
    JCheckBox c4;
    JCheckBox c5;
    JCheckBox c6;
    ButtonGroup group1;

    SignUp3(String formno){

        super("Application Form");

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(150,5,100,100);
        add(image1);

        JLabel form = new JLabel("Form no :");
        form.setFont(new Font("Raleway",Font.BOLD,15));
        form.setBounds(650,10,100,40);
        add(form);

        JLabel fNumber = new JLabel(formno);
        fNumber.setFont(new Font("Raleway", Font.BOLD,15));
        fNumber.setBounds(730,10,100,40);
        add(fNumber);



        JLabel label1 = new JLabel("Page 3 :-");
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.setBounds(300,30,600,40);
        add(label1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type :");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(150,140,200,30);
        add(l3);

        r1 = new JRadioButton("Savings Account");
        r1.setBounds(330,140,160,30);
        r1.setBackground(new Color(112, 236, 213));
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        add(r1);


        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(520,140,220,30);
        r2.setBackground(new Color(112, 236, 213));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(330,170,160,30);
        r3.setBackground(new Color(112, 236, 213));
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(520,170,220,30);
        r4.setBackground(new Color(112, 236, 213));
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        add(r4);


        group1 = new ButtonGroup();
        group1.add(r1);
        group1.add(r2);
        group1.add(r3);
        group1.add(r4);

        JLabel l4 = new JLabel("Card Number :");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(150,230,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway", Font.BOLD,10));
        l5.setBounds(150,250,200,30);
        add(l5);


        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841 ");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(340,230,300,30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway", Font.BOLD,10));
        l7.setBounds(340,250,300,30);
        add(l7);


        JLabel l8 = new JLabel("PIN :");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(150,300,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX ");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(340,300,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit password)");
        l10.setFont(new Font("Raleway", Font.BOLD,10));
        l10.setBounds(150,320,200,30);
        add(l10);


        JLabel l11 = new JLabel("Service Required :");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(150,360,200,30);
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(112, 236, 213));
        c1.setFont(new Font("Raleway", Font.BOLD,16));
        c1.setBounds(335,360,150,30);
        add(c1);


        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(112, 236, 213));
        c2.setFont(new Font("Raleway", Font.BOLD,16));
        c2.setBounds(515,360,150,30);
        add(c2);


        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(112, 236, 213));
        c3.setFont(new Font("Raleway", Font.BOLD,16));
        c3.setBounds(335,400,150,30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(new Color(112, 236, 213));
        c4.setFont(new Font("Raleway", Font.BOLD,16));
        c4.setBounds(515,400,150,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(112, 236, 213));
        c5.setFont(new Font("Raleway", Font.BOLD,16));
        c5.setBounds(335,440,150,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(112, 236, 213));
        c6.setFont(new Font("Raleway", Font.BOLD,16));
        c6.setBounds(515,440,150,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declare that the above entered details are correct to the best of my knowledge");
        c7.setBackground(new Color(112, 236, 213));
        c7.setFont(new Font("Raleway", Font.BOLD,16));
        c7.setBounds(150,490,700,30);
        add(c7);

        submit = new JButton("Submit");
        submit.setForeground(Color.white);
        submit.setBackground(Color.BLACK);
        submit.setBounds(340,540,100,30);
        submit.addActionListener(this);
        add(submit);


        cancel = new JButton("Cancel");
        cancel.setForeground(Color.white);
        cancel.setBackground(Color.BLACK);
        cancel.addActionListener(this);
        cancel.setBounds(515,540,100,30);
        add(cancel);










        setLayout(null);
        setSize(1000,650);
        setLocation(450,80);
        getContentPane().setBackground(new Color(112, 236, 213));

        setVisible(true);



    }



    @Override
    public void actionPerformed(ActionEvent e) {


        String account_type = null;
        if(r1.isSelected()){
            account_type = "Saving Account";
        }else if (r2.isSelected()){

            account_type = "Fixed Deposit Account";
        }else if (r3.isSelected()){

            account_type = "Current Account";
        }else if (r4.isSelected()){

            account_type = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardNumber = " " + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = " "+Math.abs(first3);

        String facility = " ";
        if(c1.isSelected()){
            facility = facility + "ATM Card";
        }else if(c2.isSelected()){

            facility = facility + "Internet Banking";
        }else if(c3.isSelected()){

        facility = facility + "Mobile Banking";
        }else if(c4.isSelected()){

            facility = facility + "Email Alerts";
        }else if(c5.isSelected()){

            facility = facility + "Cheque Book";
        }else if(c6.isSelected()){

            facility = facility + "E-Statement";
        }


        try{

            if(e.getSource() == submit) {

                if (account_type.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                } else {

                    Connection con = new Connection();
                    String q1 = "INSERT INTO signupthree(form_no,account_type,card_number,pin,facility)VALUES" +
                            "('" + formno + "','" + account_type + "','" + cardNumber + "','" + pin + "','" + facility + "')";

                    String q2 = "INSERT INTO login(form_no,card_number,pin)VALUES('" + formno + "','" + cardNumber + "','" + pin + "')";
                    con.statement.executeUpdate(q1);
                    con.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardNumber+"\nPin"+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }else if (e.getSource()==cancel){
                System.exit(0);

            }
        }catch(Exception E){
            E.printStackTrace();
        }

}

    public static void main(String[] args){

        new SignUp3("" );
    }


}
