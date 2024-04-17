package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup extends JFrame implements ActionListener {
   JRadioButton r1, r2, m1, m2;

   JButton next;
   JDateChooser dateChooser;

   Random ran = new Random();
   long first4 = (ran.nextLong() % 9000L) + 1000L;
   String first = " " + Math.abs(first4);

   JLabel label1, label2;
   JTextField textName, textfname, textmname, textpnumber, textemail, textaddress, textcity, textpin;

   Signup() {
      super("APPLICATION FORM");

      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
      Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(25, 10, 100, 100);
      add(image);


      label1 = new JLabel("APPLICATION FORM NO" + first);
      label1.setBounds(160, 20, 600, 40);
      label1.setFont(new Font("RALWAY", Font.BOLD, 35));
      add(label1);

      label2 = new JLabel("PAGE 1");
      label2.setFont(new Font("RALWAY", Font.BOLD, 22));
      label2.setBounds(330, 70, 600, 40);
      add(label2);


      JLabel label3 = new JLabel("PERSONAL DETAILS ");
      label3.setBounds(290, 100, 600, 30);
      label3.setFont(new Font("RALWAY", Font.BOLD, 22));
      add(label3);

      JLabel labelName = new JLabel("Name");
      labelName.setFont(new Font("RALWAY", Font.BOLD, 20));
      labelName.setBounds(100, 190, 100, 30);
      add(labelName);

      textName = new JTextField();
      textName.setFont(new Font("RALWAY", Font.BOLD, 14));
      textName.setBounds(200, 190, 300, 30);
      add(textName);

      JLabel labelfname = new JLabel("FATHER'S NAME: ");
      labelfname.setFont(new Font("RALWAY", Font.BOLD, 20));
      labelfname.setBounds(100, 250, 300, 30);
      add(labelfname);

      textfname = new JTextField();
      textfname.setFont(new Font("RALWAY", Font.BOLD, 14));
      textfname.setBounds(300, 250, 300, 30);
      add(textfname);


      JLabel labelmname = new JLabel("MOTHER NAME: ");
      labelmname.setBounds(100, 310, 300, 30);
      labelmname.setFont(new Font("RALWAY", Font.BOLD, 20));
      add(labelmname);


      textmname = new JTextField();
      textmname.setBounds(300, 310, 300, 30);
      textmname.setFont(new Font("RALWAY", Font.BOLD, 14));
      add(textmname);

      JLabel labelpnumber = new JLabel("PHONE NO: ");
      labelpnumber.setBounds(100, 370, 300, 30);
      labelpnumber.setFont(new Font("RALWAY", Font.BOLD, 20));
      add(labelpnumber);

      textpnumber = new JTextField();
      textpnumber.setBounds(300, 370, 300, 30);
      textpnumber.setFont(new Font("RALWAY", Font.BOLD, 20));
      add(textpnumber);


      JLabel dob = new JLabel("DATE OF BIRTH: ");
      dob.setBounds(100, 430, 300, 30);
      dob.setFont(new Font("RALWAY", Font.BOLD, 20));
      add(dob);

      dateChooser = new JDateChooser();
      dateChooser.setForeground(new Color(105, 105, 105));
      dateChooser.setBounds(300, 430, 200, 20);
      add(dateChooser);

      JLabel labelG = new JLabel("GENDER: ");
      labelG.setBounds(100, 470, 300, 30);
      labelG.setFont(new Font("RALWAY", Font.BOLD, 20));
      add(labelG);


      r1 = new JRadioButton("MALE");
      r1.setFont(new Font("RALWAY", Font.BOLD, 14));
      r1.setBounds(300, 470, 90, 30);
      add(r1);

      r2 = new JRadioButton("FEMALE");
      r2.setBounds(450, 470, 90, 30);
      r2.setFont(new Font("RALWAY", Font.BOLD, 14));
      add(r2);

      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(r1);
      buttonGroup.add(r2);


      JLabel labelemail = new JLabel("EMAIL: ");
      labelemail.setBounds(100, 530, 300, 30);
      labelemail.setFont(new Font("RALWAY", Font.BOLD, 20));
      add(labelemail);


      textemail = new JTextField();
      textemail.setFont(new Font("RALWAY", Font.BOLD, 14));
      textemail.setBounds(300, 530, 300, 30);
      add(textemail);

      JLabel labeladdress = new JLabel("Address: ");
      labeladdress.setBounds(100, 590, 300, 30);
      labeladdress.setFont(new Font("RALWAY", Font.BOLD, 20));
      add(labeladdress);

      textaddress = new JTextField();
      textaddress.setBounds(300, 590, 300, 30);
      textaddress.setFont(new Font("RALWAY", Font.BOLD, 14));
      add(textaddress);

      JLabel labelcity = new JLabel("City: ");
      labelcity.setFont(new Font("RALWAY", Font.BOLD, 20));
      labelcity.setBounds(100, 650, 300, 30);
      add(labelcity);

      textcity = new JTextField();
      textcity.setFont(new Font("RALWAY", Font.BOLD, 30));
      textcity.setBounds(300, 650, 300, 30);
      add(textcity);


      JLabel labelms = new JLabel("Marital Status: ");
      labelms.setBounds(100, 710, 300, 30);
      labelms.setFont(new Font("RALWAY", Font.BOLD, 20));
      add(labelms);


      m1 = new JRadioButton("Married");
      m1.setBounds(300, 710, 100, 30);
      m1.setFont(new Font("RALWAY", Font.BOLD, 14));
      add(m1);

      m2 = new JRadioButton("Unmarried");
      m2.setFont(new Font("RALWAY", Font.BOLD, 14));
      m2.setBounds(500, 710, 100, 30);
      add(m2);

      ButtonGroup buttonGroup1 = new ButtonGroup();
      buttonGroup1.add(m1);
      buttonGroup1.add(m2);

      next = new JButton("Next");
      next.setFont(new Font("Raleway", Font.BOLD, 14));
      next.setBounds(620, 750, 80, 30);
      next.setBackground(Color.BLACK);
      next.setForeground(Color.WHITE);
      next.addActionListener(this);
      add(next);


      getContentPane().setBackground(new Color(222, 255, 228));

      setLayout(null);
      setSize(850, 800);
      setLocation(350, 40);
      setVisible(true);

   }


   @Override
   public void actionPerformed(ActionEvent e) {
      String formno = first;
      String name = textName.getText();
      String fname = textfname.getText();
      String mname = textmname.getName();
      String pnumber = textpnumber.getText();
      String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
      String gender = null;
      if (r1.isSelected()) {
         gender = "male";
      } else if (r2.isSelected()) {
         gender = "Female";
      }

      String email = textemail.getText();

      String address = textaddress.getText();
      String City = textcity.getText();
     // String pincode = textpin.getText();
      String marital = null;
      if (m1.isSelected()) {
         marital = "Married";

      } else if (m2.isSelected()) {
         marital = "Unmarried";
      }
      try{
         if(textName.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Fill all the field");
         }else{
            conn c =new conn();
            String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+mname+"','"+pnumber+"','"+dob+"','"+gender+"','"+email+"','"+address+"','"+City+"','"+marital+"')";
            c.statement.executeUpdate(q);
            new Signup2(formno);
            setVisible(false);
         }


      }catch(Exception E){
         E.printStackTrace();

      }

   }

   public static void main(String[] args) {

      new Signup();
   }
}


