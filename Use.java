import javax.swing.*;
import java.awt.*;
class FirstSwing extends JFrame{
FirstSwing()
{
setLayout(new FlowLayout());
ImageIcon i1=new ImageIcon("116266956916qiutis5vg2yxagidijcsogxgmyplrcivsyjcswdolifcn036sfybgqy6wbegnvbymydd7zrostwfmvvspnzvi2eeobirwlbhipg.jpg");
JLabel l1=new JLabel("label with text");
JLabel l2=new JLabel("text and icon",i1,SwingConstants.LEFT);
add(l1);
add(l2);
}}
class Use
{
public static void main(String ar[])
{
FirstSwing o1= new FirstSwing();
o1.setTitle("label component demo");
o1.setBounds(200,250,150,150);
o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
o1.setVisible(true);
}}
