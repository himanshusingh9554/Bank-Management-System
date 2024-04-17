package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;

    JRadioButton r1, r2, e1, e2;
    JButton next;
    String formno;

    Signup2(String formno) {
        this.formno = formno;
        //super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);



        JLabel l1 = new JLabel("Page 2 :-");
        l1.setBounds(300, 30, 600, 70);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Ralway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 70);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Ralway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String religion[] = {"Christian", "Hindu", "Muslim", "Sikh"};
        comboBox = new JComboBox(religion);
        comboBox.setBounds(350, 120, 320, 30);
        comboBox.setBackground(new Color(252, 208, 76));
        comboBox.setFont(new Font("Ralway", Font.BOLD, 18));
        add(comboBox);

        JLabel j4 = new JLabel("Category: ");
        j4.setBounds(100, 170, 100, 30);
        j4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(j4);

        String Category[] = {"General", "OBC", "SC", "ST", "other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBounds(350, 170, 320, 30);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBackground(new Color(252, 208, 76));
        add(comboBox2);


        JLabel j5 = new JLabel("Income : ");
        j5.setFont(new Font("Raleway", Font.BOLD, 18));
        j5.setBounds(100, 220, 100, 30);
        add(j5);


        String income[] = {"Student", "<1,50,000", "<2,50,000", "upto 5000000", "upto 1000000", "Above"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBounds(350, 220, 320, 30);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBackground(new Color(252, 208, 76));
        add(comboBox3);

        JLabel j6 = new JLabel("Qualification");
        j6.setFont(new Font("Raleway", Font.BOLD, 18));
        j6.setBounds(100, 270, 150, 30);
        add(j6);

        String Qualification[] = {"B.Com", "B.Tech", "B.Sc", "M.Sc,M.Tech"};
        comboBox4 = new JComboBox(Qualification);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        comboBox4.setBackground(new Color(252, 208, 76));
        add(comboBox4);

        JLabel j7 = new JLabel("Occupation");
        j7.setBounds(100, 320, 150, 30);
        j7.setFont(new Font("Raleway", Font.BOLD, 18));
        add(j7);

        String Occupation[] = {"Salaried", "Self-Employed", "Student", "Buisseness"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 320, 320, 30);
        comboBox5.setBackground(new Color(252, 208, 76));
        add(comboBox5);


        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 370, 150, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        textPan.setBounds(350, 390, 320, 30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 440, 180, 30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        textAadhar.setBounds(350, 440, 320, 30);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 490, 180, 30);
        add(l10);

        r1 = new JRadioButton("YES");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(350, 490, 100, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(600, 490, 100, 30);
        add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 540, 180, 30);
        add(l11);

        e1 = new JRadioButton("YES");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBounds(350, 540, 100, 30);
        e1.setBackground(new Color(252, 208, 76));
        add(e1);

        e2 = new JRadioButton("NO");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBounds(600, 540, 100, 30);
        e2.setBackground(new Color(252, 208, 76));
        add(e2);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(570, 640, 100, 30);
        next.setForeground(Color.BLACK);
        next.setBackground(Color.WHITE);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 207, 89));
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String re1 = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())) {
            scitizen = "Yes";

        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eAccount = " ";
        if ((r1.isSelected())) {
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount = "No";

        }
        try {
            if (textPan.getText().equals(" ")|| textAadhar.getText().equals(" ")) {
                JOptionPane.showMessageDialog(null, "fill all the blanks");
            } else {
                conn c1 = new conn();
                String q = "insert into Signuptwo values('" + formno + "','" + re1 + "','" + cate + "','" + inc + "','" + edu + "','" + occ + "','" + pan + "','" + aadhar + "','" + scitizen + "','" + eAccount + "')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}