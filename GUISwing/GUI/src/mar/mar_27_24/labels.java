
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class labels {
    public static void main(String[] args) {
        // Load the image icon
        ImageIcon image = new ImageIcon("D:\\RUPP\\MyJava\\GUISwing\\GUI\\icon code.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        // Create the JLabel
        JLabel label = new JLabel();
        label.setIcon(image); // Set image icon
        label.setVerticalTextPosition(JLabel.TOP);//set text top, center ,bottom of image icon
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left ,center, right of image icon
        label.setText("Hello start code with me!!"); // Set text of label
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Set font of the text
        label.setForeground(new Color(50, 205, 50));//set color of the text
        label.setBackground(Color.black); // Set the background color
        label.setOpaque(true);//display background color
        label.setIconTextGap(5);//set gap of the text to image
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);//set the item positionto center

        // Create the JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("How to use labels");
        frame.setSize(500, 500);
        frame.add(label);
        frame.setVisible(true);
    }
}
