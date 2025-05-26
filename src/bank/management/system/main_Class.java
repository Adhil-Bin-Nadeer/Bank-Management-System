package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton deposit, cashWithdraw, fastCash, miniStatement, pinChange, balanceEnquiry, exit;

    String pin;

    main_Class(String pin){


        super("ATM Machine");
        this.pin = pin;

        ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label = new JLabel("PLEASE SELECT YOUR TRANSACTION");
        label.setFont(new Font("System",Font.BOLD,19));
        label.setBounds(450,180,700,35);
        label.setForeground(Color.white);
        image.add(label);

        deposit = new JButton("DEPOSIT");
        deposit.setFont(new Font("System",Font.BOLD,12));
        deposit.setForeground(Color.white);
        deposit.setBackground(new Color(64,125,128));
        deposit.setBounds(410,270,150,35);
        deposit.addActionListener(this);
        image.add(deposit);

        cashWithdraw = new JButton("CASH WITHDRAW");
        cashWithdraw.setFont(new Font("System",Font.BOLD,12));
        cashWithdraw.setForeground(Color.white);
        cashWithdraw.setBackground(new Color(64,125,128));
        cashWithdraw.setBounds(700,270,150,35);
        cashWithdraw.addActionListener(this);
        image.add(cashWithdraw);

        fastCash = new JButton("FAST CASH");
        fastCash.setFont(new Font("System",Font.BOLD,12));
        fastCash.setForeground(Color.white);
        fastCash.setBackground(new Color(64,125,128));
        fastCash.setBounds(410,318,150,35);
        fastCash.addActionListener(this);
        image.add(fastCash);


        miniStatement = new JButton("MINI STATEMENT");
        miniStatement.setFont(new Font("System",Font.BOLD,12));
        miniStatement.setForeground(Color.white);
        miniStatement.setBackground(new Color(64,125,128));
        miniStatement.setBounds(700,318,150,35);
        miniStatement.addActionListener(this);
        image.add(miniStatement);

        pinChange = new JButton("PIN CHANGE");
        pinChange.setFont(new Font("System",Font.BOLD,12));
        pinChange.setForeground(Color.white);
        pinChange.setBackground(new Color(64,125,128));
        pinChange.setBounds(410,362,150,35);
        pinChange.addActionListener(this);
        image.add(pinChange);

        balanceEnquiry = new JButton("BALANCE ENQUIRY");
        balanceEnquiry.setFont(new Font("System",Font.BOLD,12));
        balanceEnquiry.setForeground(Color.white);
        balanceEnquiry.setBackground(new Color(64,125,128));
        balanceEnquiry.setBounds(700,362,150,35);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);

        exit = new JButton("EXIT");
        exit.setFont(new Font("System",Font.BOLD,12));
        exit.setForeground(Color.white);
        exit.setBackground(new Color(64,125,128));
        exit.setBounds(700,406,150,35);
        exit.addActionListener(this);
        image.add(exit);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==deposit){
            new Deposit(pin);
            setVisible(false);
        }else if(e.getSource() == exit){
            System.exit(0);
        }else if (e.getSource() == cashWithdraw){
            new Withdraw(pin);
            setVisible(false);
        }else if(e.getSource() == balanceEnquiry){
            new BalanceEnquiry(pin);
            setVisible(false);
        }else if(e.getSource() == fastCash){
            new FastCash(pin);
            setVisible(false);
        }else if(e.getSource() == pinChange){
            new ChangePin(pin);
            setVisible(false);
        }else if(e.getSource() == miniStatement){
            new MiniStatement(pin);
            setVisible(false);
        }



    }

    public static void main(String[] args){

        new main_Class(" ");
    }

}
