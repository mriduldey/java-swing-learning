import javax.swing.*;
import java.awt.*;

public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // frame.setSize(700, 500);
        // frame.setLocation(200, 200);
        // work same as above two statements
        frame.setBounds(200, 200, 700, 500);
        frame.setTitle("My Frame");

        // Provide image icon
        ImageIcon icon = new ImageIcon("xyz.png");
        frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();
        // Color c = new Color(255, 0, 0);
        c.setBackground(Color.RED);

        // Stop resizing window
        frame.setResizable(false);
    }
}