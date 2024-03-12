import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.TextField;
import javax.swing.*;
class Jframe 
{
public static void main(String[] ar)
{
JFrame frame=new JFrame("Gopal");
Color c1=new Color(200,34,53);
JPanel p1=new JPanel();
//ImageIcon i=new ImageIcon("g1.jpg");
//JLabel l1=new JLabel(i);
JLabel l1=new JLabel("Enter the Name:");
TextField tf=new TextField("Enter the Name",15);
tf.setBounds(20,30,90,150);
JButton jb=new JButton("Submit");

// Checkbox jcb=new Checkbox("Mobile",g1,false);
// JCheckBox jcb1=new JCheckBox("Laptop");
// JCheckBox jcb2=new JCheckBox("keyboard");
// p1.add(jcb);
// p1.add(jcb1);
// p1.add(jcb2);


p1.add(l1);
p1.add(tf);
p1.setBackground(c1);
p1.add(jb);
frame.add(p1);
frame.show();
frame.setSize(800, 600);  
//frame.setLocationRelativeTo(null);  
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.setVisible(true);  

//m1.setSize(200,300);
}
}