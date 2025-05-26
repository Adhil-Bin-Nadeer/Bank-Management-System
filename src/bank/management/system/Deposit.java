package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton back,deposit;

    Deposit(String pin){

        super("ATM Machine");

        this.pin = pin;

        ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT ");
        label1.setFont(new Font("System",Font.BOLD  ,16));
        label1.setBounds(460,180,400,35);
        label1.setForeground(Color.white);
        image.add(label1);

        textField = new TextField();
        textField.setBounds(470,230,320,25);
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setFont(new Font("System", Font.BOLD,22));
        image.add(textField);

        deposit = new JButton("DEPOSIT");
        deposit.setBounds(700,362,150,35);
        deposit.setBackground(new Color(65,125,128));
        deposit.setForeground(Color.white);
        deposit.addActionListener(this);
        image.add(deposit);

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

    @Override
    public void actionPerformed(ActionEvent e) {

        try{

            String amount = textField.getText();
            Date date = new Date();
            if(e.getSource() == deposit){
                if(textField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter the amount you want to deposit");
                }
                else {
                    Connection con = new Connection();
                    con.statement.executeUpdate("INSERT INTO bank(pin,date,type,amount)VAlUES('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposit Successfully");
                    new main_Class(pin);
                    setVisible(false);

                }
            }else if (e.getSource() == back){
                setVisible(false);
                new main_Class(pin);
            }

        }catch(Exception E){

            E.printStackTrace();
        }


    }


    public static void main(String[] args){

        new Deposit(" ");
    }


}
