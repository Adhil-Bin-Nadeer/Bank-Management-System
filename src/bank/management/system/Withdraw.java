package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.management.relation.RelationSupport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdraw extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton back,Withdraw;

    Withdraw(String pin){

        super("ATM Machine");

        this.pin = pin;

        ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS RS. 10,000");
        label1.setFont(new Font("System",Font.BOLD  ,16));
        label1.setBounds(470,180,400,35);
        label1.setForeground(Color.white);
        image.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER THE AMOUNT :");
        label2.setFont(new Font("System",Font.BOLD  ,16));
        label2.setBounds(470,230,400,35);
        label2.setForeground(Color.white);
        image.add(label2);

        textField = new TextField();
        textField.setBounds(470,260,320,25);
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setFont(new Font("System", Font.BOLD,18));
        image.add(textField);

        Withdraw = new JButton("CASH WITHDRAW");
        Withdraw.setBounds(700,362,150,35);
        Withdraw.setBackground(new Color(65,125,128));
        Withdraw.setForeground(Color.white);
        Withdraw.addActionListener(this);
        image.add(Withdraw);

        back = new JButton("BACK");
        back.setBounds(700,406,150,35);
        back.setBackground(new Color(65,125,128));
        back.setForeground(Color.white);
        back.addActionListener(this);
        image.add(back);





        setLayout(null);
        setSize(1920,1080);
        setLocation(0,0);
        setVisible(true);



    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == Withdraw ){

            try{

                String amount = textField.getText();
                Date date = new Date();
                if(amount.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                }else{
                    Connection con = new Connection();
                    ResultSet resultset = con.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
                    int balance = 0;
                    while(resultset.next()){
                        if(resultset.getString("type").equals("Deposit")){
                            balance += Integer.parseInt(resultset.getString("amount"));
                        }else{
                            balance -= Integer.parseInt(resultset.getString("amount"));
                        }

                    }

                    if(balance < Integer.parseInt(amount)){
                        JOptionPane.showMessageDialog(null,"Insufficient Balance");
                        return;
                    }

                    con.statement.executeUpdate("Insert into bank values ('"+pin+"','"+date +"','Withdraw', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs."+amount+" Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }

            }catch(Exception E){


            }


        }else if(e.getSource() == back){
            setVisible(false);
            new main_Class(pin);
        }


    }

    public static void main(String[] args){

        new Withdraw(" ");

    }



}
