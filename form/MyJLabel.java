import javax.swing.*;
import java.awt.*;

public class MyJLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 700, 500);
        frame.setTitle("My Form");

        Container c = frame.getContentPane();
        c.setLayout(null);
        // Color c = new Color(255, 0, 0);
        c.setBackground(Color.RED);

        JLabel label = new JLabel("Username");
        label.setBounds(100,50,100,100);
        c.add(label);
    }
}