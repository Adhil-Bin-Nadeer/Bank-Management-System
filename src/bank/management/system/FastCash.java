package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.naming.CompositeName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {


    JButton cash100, cash500, cash1000, cash2000, cash5000, cash10000, exit;

    String pin;

    FastCash(String pin){
        
        super ("ATM Machine");
        this.pin = pin;

        ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label = new JLabel("SELECT THE WITHDRAWAL AMOUNT");
        label.setFont(new Font("System",Font.BOLD,19));
        label.setBounds(450,180,700,35);
        label.setForeground(Color.white);
        image.add(label);

        cash100 = new JButton("RS.100");
        cash100.setFont(new Font("System",Font.BOLD,12));
        cash100.setForeground(Color.white);
        cash100.setBackground(new Color(64,125,128));
        cash100.setBounds(410,270,150,35);
        cash100.addActionListener(this);
        image.add(cash100);

        cash500 = new JButton("RS.500");
        cash500.setFont(new Font("System",Font.BOLD,12));
        cash500.setForeground(Color.white);
        cash500.setBackground(new Color(64,125,128));
        cash500.setBounds(700,270,150,35);
        cash500.addActionListener(this);
        image.add(cash500);

        cash1000 = new JButton("RS.1000");
        cash1000.setFont(new Font("System",Font.BOLD,12));
        cash1000.setForeground(Color.white);
        cash1000.setBackground(new Color(64,125,128));
        cash1000.setBounds(410,318,150,35);
        cash1000.addActionListener(this);
        image.add(cash1000);


        cash2000 = new JButton("RS.2000");
        cash2000.setFont(new Font("System",Font.BOLD,12));
        cash2000.setForeground(Color.white);
        cash2000.setBackground(new Color(64,125,128));
        cash2000.setBounds(700,318,150,35);
        cash2000.addActionListener(this);
        image.add(cash2000);

        cash5000 = new JButton("RS.5000");
        cash5000.setFont(new Font("System",Font.BOLD,12));
        cash5000.setForeground(Color.white);
        cash5000.setBackground(new Color(64,125,128));
        cash5000.setBounds(410,362,150,35);
        cash5000.addActionListener(this);
        image.add(cash5000);

        cash10000 = new JButton("RS.10,000");
        cash10000.setFont(new Font("System",Font.BOLD,12));
        cash10000.setForeground(Color.white);
        cash10000.setBackground(new Color(64,125,128));
        cash10000.setBounds(700,362,150,35);
        cash10000.addActionListener(this);
        image.add(cash10000);

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

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource() == exit){

            setVisible(false);
            new main_Class(pin);

        }else {
            String amount = ((JButton)e.getSource()).getText().substring(3);

            Connection con = new Connection();
            Date date = new Date();
            try{

                ResultSet resultSet = con.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
                int balance = 0;

                while(resultSet.next()){

                    if(resultSet.getString("type").equals("Deposit")){
                            balance += Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }

                }

                if(e.getSource() != exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }

                con.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrwal','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfully");


            }catch(Exception E){

                E.printStackTrace();
            }


            setVisible(false);
            new main_Class(pin);

        }

    }

    public static void main(String[] args){

        new FastCash("");

    }


}
