package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordfield3;

    JButton button1,button2,button3;

//import static java.awt.Font.BOLD;

    login() {
        super ("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Bank1.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image i22 = i11.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel cimage = new JLabel(i33);
        cimage.setBounds(630,350,100,100);
        add(cimage);

        ImageIcon ii11 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image ii22 = ii11.getImage().getScaledInstance(800,480,Image.SCALE_DEFAULT);
        ImageIcon ii33 = new ImageIcon(ii22);
        JLabel bimage = new JLabel(ii33);
        bimage.setBounds(0,0,850,480);
        add(bimage);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setFont(new Font("AvantGarde", Font.BOLD,38)) ;
        label1.setForeground(Color.WHITE);
        label1.setBounds(330,125,450,40);
        bimage.add(label1);

        label2 = new JLabel("Card No: ");
        label2.setFont(new Font("Ralway", Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        bimage.add(label2);


        textField2=new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial", Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("PIN:  ");
        label3.setFont(new Font("Ralway", Font.BOLD,28));
        label3.setForeground(Color.white);
        label3.setBounds(150,250,375,30);
        bimage.add(label3);

        passwordfield3 = new JPasswordField(15);
        passwordfield3.setBounds(325,250,230,30);
        passwordfield3.setFont(new Font("Arial", Font.BOLD,15));
        add(passwordfield3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
      button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        bimage.add(button1);

        button2 = new JButton("CLEAR");
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setFont(new Font("Arial", Font.BOLD,14));
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        bimage.add(button2);

        button3 = new JButton("SIGN UP");
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setFont(new Font("Arial", Font.BOLD,14));
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        bimage.add(button3);





        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        //setUndecorated(true);
        setVisible(true);
    }




    @Override
    public  void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){
                conn c = new conn();
                String cardno = textField2.getText();
                String pin = passwordfield3.getText();
                String q ="select * from login where card_number = '"+cardno+"'and pin='"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
        } else if (e.getSource()==button2) {
                textField2.setText("");
                passwordfield3.setText("");
            } else if (e.getSource()==button3 ) {
                new Signup();
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new login();
    }

}
