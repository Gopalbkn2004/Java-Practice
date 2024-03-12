import javax.swing.*;
import java.awt.*;
class First extends JFrame
{
    First()
    {
        setLayout(new FlowLayout());
        JLabel l1=new JLabel("Hobbies");
        JCheckBox c1=new JCheckBox("Sports");
        JCheckBox c2=new JCheckBox("Music");
        JCheckBox c3=new JCheckBox("Reading");
        add(l1);
        add(c1);
        add(c2);
        add(c3);

    }

}

class User6
{
    public static void main(String ar[])
    {
        First f1=new First();
        f1.setTitle("CheckBox Component Demo");
        f1.setBounds(200,300,190,400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);

    }

}