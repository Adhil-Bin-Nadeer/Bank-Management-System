package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry  extends JFrame implements ActionListener {

    String pin;
    TextField textField;
    JButton back, balanceEnquiry;
    JLabel label2;
    BalanceEnquiry(String pin){

        super("ATM Machine");
        this.pin = pin;


        ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("YOUR CURRENT BALANCE IS RS. ");
        label1.setFont(new Font("System",Font.BOLD  ,16));
        label1.setBounds(430,180,400,35);
        label1.setForeground(Color.white);
        image.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font("System",Font.BOLD  ,16));
        label2.setBounds(430,230,400,35);
        label2.setForeground(Color.white);
        image.add(label2);

//        textField = new TextField();
//        textField.setBounds(470,260,320,25);
//        textField.setBackground(new Color(65,125,128));
//        textField.setForeground(Color.white);
//        textField.setFont(new Font("System", Font.BOLD,18));
//        image.add(textField);

//        balanceEnquiry = new JButton("CASH WITHDRAW");
//        balanceEnquiry.setBounds(700,362,150,35);
//        balanceEnquiry.setBackground(new Color(65,125,128));
//        balanceEnquiry.setForeground(Color.white);
//        balanceEnquiry.addActionListener(this);
//        image.add(balanceEnquiry);

        back = new JButton("BACK");
        back.setBounds(700,406,150,35);
        back.setBackground(new Color(65,125,128));
        back.setForeground(Color.white);
        back.addActionListener(this);
        image.add(back);

        int balance = 0;
        try{

            Connection con = new Connection();
            ResultSet resultset = con.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while(resultset.next()){
                if(resultset.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultset.getString("amount"));
                }else{
                    balance -= Integer.parseInt(resultset.getString("amount"));
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        label2.setText(""+balance);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == back){
            setVisible(false);
            new main_Class(pin);
        }

    }

    public static void main (String[] args){

        new BalanceEnquiry(" ");
    }

}
