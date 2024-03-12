
import javax.swing.*;
import java.awt.*;

public class Form_copy extends JFrame {

    public Form_copy() {
        super("Swing Form Example");

        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTextField = new JTextField(20);

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageTextField = new JTextField(20);

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        JLabel qualificationLabel = new JLabel("Qualification:");
        JCheckBox tenthCheckBox = new JCheckBox("10th");
        JCheckBox twelfthCheckBox = new JCheckBox("12th");
        JCheckBox graduationCheckBox = new JCheckBox("Graduation");

        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressTextArea = new JTextArea(5, 20);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
                       String result="Form Submission";
            JOptionPane.showMessageDialog(this, result, "Form Submission", JOptionPane.INFORMATION_MESSAGE);
        });

        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(ageLabel);
        panel.add(ageTextField);
        panel.add(genderLabel);
        panel.add(maleRadioButton);
        panel.add(femaleRadioButton);
        panel.add(qualificationLabel);
        panel.add(tenthCheckBox);
        panel.add(twelfthCheckBox);
        panel.add(graduationCheckBox);
        panel.add(addressLabel);
        panel.add(addressTextArea);
        panel.add(submitButton);

        add(panel);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Form_copy::new);
    }
}

