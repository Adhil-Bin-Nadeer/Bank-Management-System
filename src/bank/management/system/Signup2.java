package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JComboBox combobox, comboBox2, comboBox3, comboBox4, comboBox5;
    String formno;
    JTextField textPAN, textAadhaar;
    JButton nextButton;
    JRadioButton r1,r2,r3,r4;

    Signup2(String first){

        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(150,5,100,100);
        add(image1);

        this.formno = formno;


        JLabel label1 = new JLabel("Page 2 :-");
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.setBounds(300,30,600,40);
        add(label1);


        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(150,150,600,40);
        add(l3);

        String[] Religion = {"Hindu", "Muslim", "Sikh", "Christian","Others"};
        combobox = new JComboBox(Religion);
        combobox.setBackground(new Color(172, 225, 225));
        combobox.setFont(new Font("Raleway",Font.BOLD,14));
        combobox.setBounds(320,150,400,30);
        add(combobox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(150,200,600,40);
        add(l4);

        String[] Category = {"General ", "OBC", "SC", "ST","Others"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(172, 225, 225));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(320,200,400,30);
        add(comboBox2);


        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(150,250,600,40);
        add(l5);

        String[] income = {"NULL ", "<1,50,000", "<2,50,000", "5,00,000","Upto 10,00,000","Above 10,00,000 "};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(172, 225, 225));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(320,250,400,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education : ");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(150,300,600,40);
        add(l6);

        String[] education = {"Non-Graduate ", "Graduate", "Post-Graduation", "Doctrate","Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(172, 225, 225));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(320,300,400,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Ocupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(150,350,600,40);
        add(l7);

        String[] occupation = {"Salaried ", "Self-Employed", "Business", "Student","Retired","Others "};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(172, 225, 225));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(320,350,400,30);
        add(comboBox5);


        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(150,400,600,40);
        add(l8);


        textPAN = new JTextField();
        textPAN.setFont(new Font("Releway",Font.BOLD,18));
        textPAN.setBounds(320,400,400,40);
        add(textPAN);

        JLabel l9 = new JLabel("Aadhaar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(150,450,600,40);
        add(l9);


        textAadhaar = new JTextField();
        textAadhaar.setFont(new Font("Releway",Font.BOLD,18));
        textAadhaar.setBounds(320,450,400,40);
        add(textAadhaar);


        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(150,500,600,40);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(196, 167, 86));
        r1.setBounds(320,510,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(196, 167, 86));
        r2.setBounds(460,510,100,30);
        add(r2);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(r1);
        group1.add(r2);


        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(150,550,600,40);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD,14));
        r3.setBackground(new Color(196, 167, 86));
        r3.setBounds(320,560,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD,14));
        r4.setBackground(new Color(196, 167, 86));
        r4.setBounds(460,560,100,30);
        add(r4);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(r3);
        group2.add(r4);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(650,10,100,40);
        add(l12);


        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(760,10,60,40);
        add(l13);

        nextButton  = new JButton("Next");
        nextButton.setBounds(570,630,100,30);
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.white);
        nextButton.setFont(new Font("Raleway",Font.BOLD,14));
        nextButton.addActionListener(this);
        add(nextButton);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(196, 167, 86));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }



    public static void main(String [] args){

        new Signup2("");
    }



}
