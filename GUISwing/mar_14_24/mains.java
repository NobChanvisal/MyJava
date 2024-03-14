package GUISwing.mar_14_24;

import javax.swing.JFrame;

public class mains {
    public static void main(String[] args) {
        //JFrame : a GUI window to add component to
        JFrame frame = new JFrame(); //Create a frame
        frame.setTitle("JFrame title put here");//title name of JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of applications
        frame.setResizable(false);// prevent frame being resized
        frame.setSize(420, 420);
        frame.setVisible(true);//make frame visible
    }
}
