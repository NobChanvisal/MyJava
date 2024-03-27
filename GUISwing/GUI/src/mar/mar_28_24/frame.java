import javax.swing.JFrame;

public class frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Title can be here");//set the title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to clode frame
        frame.setSize(500,500);//set the size of frame
        frame.setVisible(true);//to show frame
    }
}
