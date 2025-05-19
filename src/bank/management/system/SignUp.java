package bank.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    JDateChooser dateChooser;
    JRadioButton r1,r2,r3,r4;
    JTextField textName, textFName, textEmail;
    JTextField textAddress, textCity, textPincode, textState;

    Random  random = new Random();
   // long first4 = (random.nextLong()  % 9000L) + 1000L;
    long first4 = (random.nextLong()  % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

   SignUp(){

        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(25,10,100,100);
        add(image1);


        JLabel label1 = new JLabel("Application Form No : " + first);
        label1.setBounds(150,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);


        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(350,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Perosnal Information");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,110,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

       JLabel labelFName = new JLabel("Father's Name : ");
       labelFName.setFont(new Font("Raleway",Font.BOLD,20));
       labelFName.setBounds(100,240,200,30);
       add(labelFName);

       textFName = new JTextField();
       textFName.setFont(new Font("Raleway",Font.BOLD,14));
       textFName.setBounds(300,240,400,30);
       add(textFName);

       JLabel DOB = new JLabel("Date Of Birth: ");
       DOB.setFont(new Font("Raleway",Font.BOLD,20));
       DOB.setBounds(100,290,200,30);
       add(DOB);

       dateChooser = new JDateChooser();
       dateChooser.setForeground(new Color(105,105,105));
       dateChooser.setBounds(300,290,400,30);
       add(dateChooser);

       JLabel labelG = new JLabel("Gender :");
       labelG.setFont(new Font("Raleway",Font.BOLD,20));
       labelG.setBounds(100,340,200,30);
       add(labelG);

       r1 = new JRadioButton("Male");
       r1.setFont(new Font("Raleway",Font.BOLD,14));
       r1.setBackground(new Color(98,189,209));
       r1.setBounds(300,340,100,30);
       add(r1);

       r2 = new JRadioButton("Female");
       r2.setFont(new Font("Raleway",Font.BOLD,14));
       r2.setBackground(new Color(98,189,209));
       r2.setBounds(450,340,100,30);
       add(r2);

       ButtonGroup buttonGroup = new ButtonGroup();
       buttonGroup.add(r1);
       buttonGroup.add(r2);

       JLabel labelEmail = new JLabel("Email Address : ");
       labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
       labelEmail.setBounds(100,390,200,30);
       add(labelEmail);

       textEmail = new JTextField();
       textEmail.setFont(new Font("Raleway",Font.BOLD,14));
       textEmail.setBounds(300,390,400,30);
       add(textEmail);

       JLabel labelMS = new JLabel("Martial Status : ");
       labelMS.setFont(new Font("Raleway",Font.BOLD,20));
       labelMS.setBounds(100,440,200,30);
       add(labelMS);

       r3 = new JRadioButton("Single ");
       r3.setFont(new Font("Raleway",Font.BOLD,14));
       r3.setBackground(new Color(98,189,209));
       r3.setBounds(300,440,100,30);
       add(r3);

       r4 = new JRadioButton("Married");
       r4.setFont(new Font("Raleway",Font.BOLD,14));
       r4.setBackground(new Color(98,189,209));
       r4.setBounds(450,440,100,30);
       add(r4);

       ButtonGroup buttonGroup2 = new ButtonGroup();
       buttonGroup2.add(r3);
       buttonGroup2.add(r4);


       JLabel labelAddress = new JLabel("Address : ");
       labelAddress.setBounds(100,490,200,30);
       labelAddress.setFont(new Font("Raleway",Font.BOLD,20));
       add(labelAddress);

       textAddress = new JTextField();
       textAddress.setFont(new Font("Raleway",Font.BOLD,14));
       textAddress.setBounds(300,490,400,30);
       add(textAddress);

       JLabel labelCity = new JLabel("City : ");
       labelCity.setBounds(100,540,200,30);
       labelCity.setFont(new Font("Raleway",Font.BOLD,20));
       add( labelCity);

       textCity = new JTextField();
       textCity.setFont(new Font("Raleway",Font.BOLD,14));
       textCity.setBounds(300,540,400,30);
       add(textCity);


       JLabel labelPinCode = new JLabel("Pin Code : ");
       labelPinCode.setBounds(100,590,200,30);
       labelPinCode.setFont(new Font("Raleway",Font.BOLD,20));
       add(labelPinCode);

       textPincode = new JTextField();
       textPincode.setFont(new Font("Raleway",Font.BOLD,14));
       textPincode.setBounds(300,590,400,30);
       add(textPincode);

       JLabel labelState = new JLabel("State : ");
       labelState.setBounds(100,640,200,30);
       labelState.setFont(new Font("Raleway",Font.BOLD,20));
       add( labelState);

       textState = new JTextField();
       textState.setFont(new Font("Raleway",Font.BOLD,14));
       textState.setBounds(300,640,400,30);
       add( textState);


       JButton next = new JButton("Next");
       next.setFont(new Font("Raleway",Font.BOLD,14));
       next.setBackground(Color.BLACK);
       next.setForeground(Color.white);
       next.setBounds(620,690,80,30);
       next.addActionListener(this);
       add(next);


       getContentPane().setBackground(new Color(98,189,209));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String martial = null;
        if(r3.isSelected()){
            martial = "Single";
        }else if (r4.isSelected()){
            martial = "Married";
        }
        String address =  textAddress.getText();
        String city = textCity.getText();
        String pincode = textPincode.getText();
        String state = textState.getText();

        try{

            // Check if name is empty or contains only whitespace
            if (name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name is required!");
                return; // Stop execution after showing the dialog
            }

                Connection con1 = new Connection();
            String q = "INSERT INTO signup (form_no, Name, father_name, DOB, gender, email, marriage_status, address, city, pincode, state) VALUES ('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + martial + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
            con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
        }catch(SQLException E){
            E.printStackTrace();

        }

    }

    public static void main(String[]args){
        new SignUp();
    }


}
