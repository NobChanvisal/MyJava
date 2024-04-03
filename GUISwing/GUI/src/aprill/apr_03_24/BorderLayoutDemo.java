import java.awt.*;
import javax.swing.*;

//add inset
public class BorderLayoutDemo extends JFrame{
    JButton leftButton = new JButton("Left");
    JButton rightButton = new JButton("Right");
    JButton topButton = new JButton("Top");
    JTextArea textArea = new JTextArea();
    JLabel label = new JLabel("the footer message");

    BorderLayoutDemo(){
        setTitle("Border Layout Example");
        setSize(700,700);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String message = "this message on the center of the border layout";
        textArea.setText(message);

        rightButton.setFocusable(false);
        leftButton.setFocusable(false);
        topButton.setFocusable(false);

        label.setHorizontalAlignment(JLabel.CENTER); // Center the text horizontally

        add(leftButton, BorderLayout.WEST);
        add(label, BorderLayout.SOUTH);
        add(rightButton, BorderLayout.EAST);
        add(topButton, BorderLayout.NORTH);
        
        add(textArea, BorderLayout.CENTER);

        setVisible(true);
    }
    public Insets getInsets(){
        return new Insets(40, 30, 30, 30);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    } 
}
