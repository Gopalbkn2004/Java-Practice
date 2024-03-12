import javax.swing.*;
//import java.awt.*;
class Swing extends JFrame
{
public static void main(String ar[])
{
JFrame f=new JFrame("my form");
JPanel p = new JPanel();
JLabel l1=new JLabel("Name  ");
JTextField t1=new JTextField(10);
l1.setBounds(20,120,70,80);
t1.setBounds(120, 30, 120, 50);
JLabel l2=new JLabel("Mother's Name  ");
l2.setBounds(100,220,70,80);

JTextField t2=new JTextField(16);t2.setBounds(200,320,70,80);
JLabel l3=new JLabel("Father's Name  ");l3.setBounds(100,320,70,80);
JTextField t3=new JTextField(16);
JLabel l4=new JLabel("Address  ");
JTextArea a1=new JTextArea(7,15);

JLabel genderLabel = new JLabel("Gender:");
JRadioButton maleRadioButton = new JRadioButton("Male");
JRadioButton femaleRadioButton = new JRadioButton("Female");
ButtonGroup genderGroup = new ButtonGroup();
genderGroup.add(maleRadioButton);
genderGroup.add(femaleRadioButton);


JLabel l5=new JLabel("Qualification :");
JCheckBox c1=new JCheckBox("10th",false);
JCheckBox c2=new JCheckBox("12th",false);
JCheckBox c3 =new JCheckBox("Graduation",false);
JButton b1=new JButton();
b1.setText("Submit");
p.add(l1);
p.add(t1);
p.add(l2);
p.add(t2);
p.add(l3);
p.add(t3);
p.add(genderLabel);
p.add(maleRadioButton);
p.add(femaleRadioButton);
p.add(l5);
p.add(c1);
p.add(c2);
p.add(c3);
p.add(l4);
p.add(a1);
p.add(b1);
f.add(p);
//f.show();


f.setSize(1000,1000);
f.setVisible(true);
//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}