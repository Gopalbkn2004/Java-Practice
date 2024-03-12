import javax.swing.*;
import java.awt.*;
class First extends JFrame
{
    First()
    {
        setLayout(new FlowLayout());
        JLabel l1=new JLabel("Caste:");
        JRadioButton s1=new JRadioButton("SC");
        JRadioButton s2=new JRadioButton("ST");
        JRadioButton o1=new JRadioButton("OBC");
        JRadioButton g1=new JRadioButton("General");
        ButtonGroup g2 = new ButtonGroup();
        add(l1);
        g2.add(s1);
        g2.add(s2);
        g2.add(o1);
        g2.add(g1);
        add(s1);
        add(s2);
        add(o1);
        add(g1);
       
    }

}

class User7
{
    public static void main(String ar[])
    {
        First f1=new First();
        f1.setTitle("CheckBox Component Demo");
        f1.setBounds(200,150,300,400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);

    }

}