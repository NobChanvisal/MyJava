import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttons extends JFrame {
    JButton button = new JButton();
    Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

    buttons() {
        setTitle("How to use button");
        setSize(750, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        add(button);

        button.setBounds(200, 100, 150, 35);
        button.setText("Click Me");
        button.setFocusable(false);
        button.setBorder(border);
        
        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
    }

    public static void main(String[] args) {
        new buttons();
    }
}
