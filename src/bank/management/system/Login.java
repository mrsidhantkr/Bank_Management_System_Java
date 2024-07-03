package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel jlabel1,jlabel2,jlabel3;
    JTextField textfield;
    JPasswordField passwordField;
    JButton button1,button2,button3;


    Login(){
        super("Bank Management System");  //Always below the constructor and used for Title of the Frame
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);






        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("Icons/card.png"));
        Image i22=i11.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i33=new ImageIcon(i22);
        JLabel image1=new JLabel(i33);
        image1.setBounds(630,350,100,100);
        add(image1);


        jlabel1 =new JLabel("Welcome to the ATM");
        jlabel1.setForeground(Color.WHITE);
        jlabel1.setFont(new Font("AvantGarde",Font.BOLD,38));
        jlabel1.setBounds(230,125,450,40);
        add(jlabel1);




        jlabel2 =new JLabel("Card No.");
        jlabel2.setFont(new Font("Ralway",Font.BOLD,28));
        jlabel2.setForeground(Color.WHITE);
        jlabel2.setBounds(150,190,375,30);
        add(jlabel2);


        textfield=new JTextField(15);
        textfield.setBounds(325,190,230,30);
        textfield.setFont(new Font("Arial",Font.BOLD,30));
        add(textfield);


        jlabel3=new JLabel("Password");
        jlabel3.setFont(new Font("Ralway",Font.BOLD,28));
        jlabel3.setForeground(Color.WHITE);
        jlabel3.setBounds(150,250,375,30);
        add(jlabel3);

        passwordField=new JPasswordField(15);
        passwordField.setFont(new Font("Arial",Font.BOLD,30));
        passwordField.setBounds(325,250,230,30);
        add(passwordField);


        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.white);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);


        button2=new JButton("Clear");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(500,300,100,30);
        button2.addActionListener(this);
        add(button2);


        button3=new JButton("SIGN UP");
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,200,30);
        //button3.getHorizontalAlignment();
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.addActionListener(this);

        add(button3);







        ImageIcon i111=new ImageIcon(ClassLoader.getSystemResource("Icons/backbg.png"));
        Image i222=i111.getImage().getScaledInstance(850,1480,Image.SCALE_DEFAULT);
        ImageIcon i333=new ImageIcon(i222);
        JLabel image2=new JLabel(i333);
        image2.setBounds(0,0,840,490);
        add(image2);



        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            if(e.getSource() ==button1){

            } else if (e.getSource()==button2) {
                textfield.setText("");
                passwordField.setText("");
                
            } else if (e.getSource()==button3) {
                
            }
        }catch(Exception E){
            E.printStackTrace();

        }

        try{
            if(e.getSource()==button3){
                new SignUp();
                setVisible(true);
            }else if(e.getSource()==button1){
                setVisible(true);
            }
        }catch(Exception ss){
            ss.printStackTrace();

        }


    }

//    public void actionPerformedsign(ActionEvent signup){
//        if(signup.getSource()==button3){
//            new SignUp();
//            setVisible(true);
//        }else if(signup.getSource()==button1){
//            setVisible(true);
//        }
//    }

    public static void main(String[] args) {
        new Login();
    }
}
