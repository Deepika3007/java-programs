import javax.swing.*;
import java.awt.*;

public class DisplayTextAndImage {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Text and Image Display");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, JavaFX!");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        ImageIcon image = new ImageIcon("imagePath.jpg");
        JLabel imageLabel = new JLabel(image);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(Box.createVerticalStrut(20));
        panel.add(label);
        panel.add(Box.createVerticalStrut(10));
        panel.add(imageLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}


