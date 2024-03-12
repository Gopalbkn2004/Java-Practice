import javax.swing.*;
class Form1
{
public static void main(String[] arg)
{
	JFrame f1=new JFrame("Form");
	JPanel p1=new JPanel();

	JLabel Name=new JLabel("Name ");
	JTextField NameField=new JTextField(20);
	Name.setBounds(20,50,120,130);


	JLabel FName=new JLabel("Father Name ");
	JTextField FNameField=new JTextField(20);
	FName.setBounds(60,100,120,130);


	JLabel MName=new JLabel("Mother Name ");
	JTextField MNameField=new JTextField(20);
	MName.setBounds(120,150,120,130);

	JRadioButton b1=new JRadioButton("Male");
	JRadioButton b2=new JRadioButton("Female");
	ButtonGroup bg1=new ButtonGroup();

	JButton Submit=new JButton("Submit");

	Submit.addActionListener(e ->{
String result="Conform Detail , After submit You can not change the data";
String Conform="Enter Email";
JOptionPane.showInputDialog(Conform);
JOptionPane.showConfirmDialog(Submit, result);

	});

	



p1.add(Name);
Name.setBounds(20,50,120,130);

p1.add(NameField);
p1.add(FName);
p1.add(FNameField);

p1.add(MName);
p1.add(MNameField);


bg1.add(b1);
bg1.add(b2);
p1.add(b1);
p1.add(b2);
p1.add(Submit);


f1.add(p1);

f1.setSize(1300,1400);
f1.setVisible(true);
}


}