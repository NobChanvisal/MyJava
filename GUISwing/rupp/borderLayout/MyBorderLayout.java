package GUISwing.rupp.borderLayout;

import java.awt.*;
import javax.swing.*;

class MyBorderLayout extends JFrame {

  MyBorderLayout() {
    super("My BorderLayout");
    setSize(400, 200);
    setLayout(new BorderLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application

    add(new Button("This is across the top."), BorderLayout.NORTH);
    add(new Label("The footer message might go here."), BorderLayout.SOUTH);
    add(new Button("Right"), BorderLayout.EAST);
    add(new Button("Left"), BorderLayout.WEST);

    String msg = "The reasonable man adapts " +
      "himself to the world;\n" +
      "the unreasonable one persists in " +
      "trying to adapt the world to himself.\n" +
      "Therefore all progress depends " +
      "on the unreasonable man.\n\n" +
      "        - George Bernard Shaw\n\n";
    add(new TextArea(msg), BorderLayout.CENTER);
    setVisible(true);
  }

  public static void main(String args[]){
    new MyBorderLayout();
  }
}
