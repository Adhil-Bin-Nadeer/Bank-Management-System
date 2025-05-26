package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {
    String pin;
    JButton change,back;

    JPasswordField password1,password2;
    
    ChangePin(String pin){

        super("ATM Machine");
        this.pin = pin;

        ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label = new JLabel("ENTER YOUR NEW 4-DIGIT PIN");
        label.setFont(new Font("System",Font.BOLD,20));
        label.setBounds(490,180,700,35);
        label.setForeground(Color.white);
        image.add(label);

        JLabel label2 = new JLabel(" NEW PIN : ");
        label2.setFont(new Font("System",Font.BOLD,19));
        label2.setBounds(430,240,200,30);
        label2.setForeground(Color.white);
        image.add(label2);

        password1 = new JPasswordField();
        password1.setFont(new Font("System", Font.BOLD,20));
        password1.setBounds(560,240,200,30);
        password1.setBackground(new Color(65,125,128));
        password1.setForeground(Color.white);
        image.add(password1);

        JLabel label3 = new JLabel(" RE-ENTER : ");
        label3.setFont(new Font("System",Font.BOLD,19));
        label3.setBounds(430,290,200,30);
        label3.setForeground(Color.white);
        image.add(label3);

        password2 = new JPasswordField();
        password2.setFont(new Font("System", Font.BOLD,20));
        password2.setBounds(560,290,200,30);
        password2.setBackground(new Color(65,125,128));
        password2.setForeground(Color.white);
        image.add(password2);


        change = new JButton("CHANGE");
        change.setBounds(700,362,150,35);
        change.setBackground(new Color(65,125,128));
        change.setForeground(Color.white);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(700,406,150,35);
        back.setBackground(new Color(65,125,128));
        back.setForeground(Color.white);
        back.addActionListener(this);
        image.add(back);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{

            String pin1 = password1.getText();
            String pin2 = password2.getText();



            if(e.getSource() == change){


                if(password1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"ENTER NEW PIN");
                    return;

                }

                if(password2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"RE-ENTER YOUR PIN");
                    return;
                }

                if(!pin1.equals(pin2)){
                    JOptionPane.showMessageDialog(null,"ENTERED PIN DOES NOT MATCH");
                    return;
                }

                if(pin1.equals(pin2)){

                    Connection con = new Connection();
                    String q1 = "UPDATE bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                    String q2 = "UPDATE login set pin = '"+pin1+"' where pin = '"+pin+"'";
                    String q3 = "UPDATE signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";
                    con.statement.executeUpdate(q1);
                    con.statement.executeUpdate(q2);
                    con.statement.executeUpdate(q3);

                    JOptionPane.showMessageDialog(null,"PIN CHANGED SUCCESSFULLY");
                    setVisible(false);
                    new main_Class(pin);

                }


            }else if(e.getSource() == back){

                new main_Class(pin);
                setVisible(false);

            }

        }catch(Exception E){

            E.printStackTrace();

        }

    }

    public static void main(String[] args){

        new ChangePin(" ");
    }


}
