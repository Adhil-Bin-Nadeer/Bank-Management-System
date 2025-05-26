package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {

    String pin;
    JButton exit;

    MiniStatement(String pin){

        super("Mini Statement");
        this.pin = pin;

        getContentPane().setBackground(new Color(103, 220, 205));



        JLabel label1 = new JLabel();
        JScrollPane scrollPane = new JScrollPane(label1);
        scrollPane.setBounds(20,140,300,200);
       add(scrollPane);

        JLabel label2 = new JLabel();
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(150,20,200,20);
        add(label2);

        try{

            Connection con = new Connection();
            ResultSet resultSet = con.statement.executeQuery("select Name from signup S1 right join signupthree S3 on S1.form_no = S3.form_no");
            while(resultSet.next()){

                label2.setText(resultSet.getString("Name"));

            }

        } catch (Exception e) {

            e.printStackTrace();
        }



        JLabel label3 = new JLabel();
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setFont(new Font("System",Font.BOLD,16));
        label4.setBounds(20,400,300,20);
        add(label4);

        try{

            Connection con = new Connection();
            ResultSet resultSet = con.statement.executeQuery("Select * from login where pin = '"+pin+"'");
            while(resultSet.next()){

                label3.setText("Card Number : "+resultSet.getString("card_number").substring(0,4)+
                        "XXXXXXXX"+resultSet.getString("card_number").substring(12));
            };


        }catch(Exception e){

            e.printStackTrace();

        }


        try {

            int balance = 0;
            Connection con = new Connection();
            ResultSet resultSet = con.statement.executeQuery("Select * from bank where pin = '" + pin + "'");

            while (resultSet.next()) {

                label1.setText(label1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                        +resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><br><html>");

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }

            }

            label4.setText("Your Total Balance is Rs. "+balance);

        } catch (Exception e) {
            e.printStackTrace();
        }



        exit = new JButton("EXIT");
        exit.setBounds(100,500,100,25);
        exit.setBackground(Color.black);
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        add(exit);



        setLayout(null);
        setSize(400,600);
        setLocation(20,20);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){

        setVisible(false);
        if(e.getSource() == exit){
            setVisible(false);
            new main_Class(pin);
        }

    }

    public static void main(String[] args){

        new MiniStatement(" ");
    }
}
