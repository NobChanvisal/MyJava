import java.awt.*;
import javax.swing.*;

public class BorderLayouts extends JFrame {
    JPanel redPanel = new JPanel();
    JPanel bluePanel = new JPanel();
    JPanel yellowPanel = new JPanel();
    JPanel greenPanel = new JPanel();
    JPanel pinkPanel = new JPanel();
    
    BorderLayouts() {
        super("Border Layouts");
        setSize(500, 500);
        setLayout(new BorderLayout(10,10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        redPanel.setBackground(Color.red);
        bluePanel.setBackground(Color.blue);
        yellowPanel.setBackground(Color.yellow);
        greenPanel.setBackground(Color.green);
        pinkPanel.setBackground(Color.pink);

        redPanel.setPreferredSize(new Dimension(100, 50));
        bluePanel.setPreferredSize(new Dimension(100, 50));
        yellowPanel.setPreferredSize(new Dimension(100, 50));
        greenPanel.setPreferredSize(new Dimension(100, 50));
        pinkPanel.setPreferredSize(new Dimension(100, 50));

        // Adding panels to different regions of the BorderLayout
        add(redPanel, BorderLayout.NORTH);
        add(bluePanel, BorderLayout.SOUTH);
        add(yellowPanel, BorderLayout.WEST);
        add(greenPanel, BorderLayout.EAST);
        add(pinkPanel, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
            new BorderLayouts();  
    }
}

