package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.naming.RefAddr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

   // JLabel label1;
    JTextField textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9;
    JDateChooser dateChooser;
    JRadioButton radioButton,radioButton1,maritalbtn,unmaritalbtn,dontwantto;

    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;

    String first=""+Math.abs(first4);
    SignUp(){
        setTitle("SignUp Application");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("Application Form Number"+" "+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,30));
        add(label1);


        JLabel label2=new JLabel("Page 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);


        JLabel label3=new JLabel("Personal Details");
        label3.setBounds(300,90,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);


        JLabel labelname=new JLabel("Name:");
        labelname.setFont(new Font("Raleway",Font.BOLD,20));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        textField1=new JTextField(20);
        textField1.setBounds(290,190,400,30);
        textField1.setFont(new Font("Arial",Font.BOLD,20));
        add(textField1);






        JLabel labelfathername=new JLabel("Father's Name:");
        labelfathername.setFont(new Font("Raleway",Font.BOLD,20));
        labelfathername.setBounds(100,230,200,30);
        add(labelfathername);

        textField2=new JTextField(20);
        textField2.setBounds(290,230,400,30);
        textField2.setFont(new Font("Arial",Font.BOLD,20));
        add(textField2);



        JLabel labelgender=new JLabel("Gender:");
        labelgender.setFont(new Font("Raleway",Font.BOLD,20));
        labelgender.setBounds(100,270,100,30);
        add(labelgender);

        radioButton=new JRadioButton("Male");
        radioButton.setBounds(290,270,100,20);
        radioButton.setBackground(new Color(222,255,228));
        radioButton.setFont(new Font("Arial",Font.BOLD,10));

        add(radioButton);

        radioButton1=new JRadioButton("Female");
        radioButton1.setBounds(400,270,100,20);
        radioButton1.setBackground(new Color(222,255,228));
        radioButton1.setFont(new Font("Arial",Font.BOLD,10));

        add(radioButton1);


        //if(radioButton)
        ButtonGroup group=new ButtonGroup();
        group.add(radioButton);
        group.add(radioButton1);


        JLabel labeldob=new JLabel("DOB:");
        labeldob.setFont(new Font("Raleway",Font.BOLD,20));
        labeldob.setBounds(100,310,100,30);
        add(labeldob);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(290,310,150,30);
        add(dateChooser);



        JLabel labelEmail=new JLabel("Email Address:");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,350,300,30);
        add(labelEmail);
        textField3=new JTextField(20);
        textField3.setBounds(290,350,400,30);
        textField3.setFont(new Font("Arial",Font.BOLD,20));
        add(textField3);


        //maritalstatus
        JLabel labelmarital=new JLabel("Marital Status:");
        labelmarital.setFont(new Font("Raleway",Font.BOLD,20));
        labelmarital.setBounds(100,390,300,30);
        add(labelmarital);


        maritalbtn=new JRadioButton("Married");
        maritalbtn.setBounds(290,390,100,20);
        maritalbtn.setBackground(new Color(222,255,228));
        maritalbtn.setFont(new Font("Arial",Font.BOLD,10));

        add(maritalbtn);


        unmaritalbtn=new JRadioButton("Unmarried");
        unmaritalbtn.setBounds(400,390,100,20);
        unmaritalbtn.setBackground(new Color(222,255,228));
        unmaritalbtn.setFont(new Font("Arial",Font.BOLD,10));

        add(unmaritalbtn);


        dontwantto=new JRadioButton("Don't want to disclose");
        dontwantto.setBounds(500,390,200,20);
        dontwantto.setBackground(new Color(222,255,228));
        dontwantto.setFont(new Font("Arial",Font.BOLD,10));

        add(dontwantto);


        ButtonGroup group2=new ButtonGroup();
        group2.add(maritalbtn);
        group2.add(unmaritalbtn);
        group2.add(dontwantto);




        //address

        JLabel labeladdress=new JLabel("Address:");
        labeladdress.setFont(new Font("Raleway",Font.BOLD,20));
        labeladdress.setBounds(100,430,300,30);
        add(labeladdress);
        textField5=new JTextField(20);
        textField5.setBounds(290,430,400,30);
        textField5.setFont(new Font("Arial",Font.BOLD,20));
        add(textField5);


        //city

        JLabel labelcity=new JLabel("City:");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,470,300,30);
        add(labelcity);
        textField6=new JTextField(20);
        textField6.setBounds(290,470,400,30);
        textField6.setFont(new Font("Arial",Font.BOLD,20));
        add(textField6);

        //pincode

        JLabel labelpincode=new JLabel("Pincode:");
        labelpincode.setFont(new Font("Raleway",Font.BOLD,20));
        labelpincode.setBounds(100,510,300,30);
        add(labelpincode);
        textField7=new JTextField(20);
        textField7.setBounds(290,510,400,30);
        textField7.setFont(new Font("Arial",Font.BOLD,20));
        add(textField7);


        //state

        JLabel labelstate=new JLabel("State:");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,550,300,30);
        add(labelstate);
        textField8=new JTextField(20);
        textField8.setBounds(290,550,400,30);
        textField8.setFont(new Font("Arial",Font.BOLD,20));
        add(textField8);


        Button btn=new Button("Next");
        btn.setBounds(700,700,100,30);
        btn.setFont(new Font("Arial",Font.BOLD,20));
        btn.setForeground(Color.WHITE);
        btn.setBackground(Color.BLACK);
        btn.addActionListener(this);
        add(btn);











        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent a){
        String formno=first;
        String name=textField1.getText();
        String fname=textField2.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(radioButton.isSelected()){
            gender="Male";
        }else if(radioButton1.isSelected()) {
            gender="Female";
        }


        String email=textField3.getText();
        String marital=null;
        if(maritalbtn.isSelected()){
            marital="Married";

        }else if(unmaritalbtn.isSelected()){
            marital="UnMarried";
        }else if(dontwantto.isSelected()){
            marital="Other";
        }


        String address=textField5.getText();
        String city=textField6.getText();
        String pincode=textField7.getText();
        String state=textField8.getText();

        try{
            if(textField1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill the detail first");
            }else{
                Con con1=new Con();
                String q="Insert into SignUp Values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new SignUp2();
                setVisible(false);

            }

        }catch(Exception E){
            E.printStackTrace();

        }




    }
    public static void main(String[] args) {
        new SignUp();
    }

}
