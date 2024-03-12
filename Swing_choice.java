import java.awt.*;

import javax.swing.*;

public class Swing_choice extends JFrame {

    public static void main(String[] args) {

        Frame frame = new Frame();

        Choice choice = new Choice();

        choice.add("Item 1");
        choice.add("Item 2");
        choice.add("Item 3");

        frame.add(choice);

        frame.setSize(300, 300);
        
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);
    }
}
