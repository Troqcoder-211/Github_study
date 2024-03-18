import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("Image/heo.jpg");

        JLabel label = new JLabel();
        label.setText("hihih");
        label.setIcon(image);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setBounds(0, 250, 500, 250);

        JFrame f = new JFrame("Panel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(750, 750);
        f.setVisible(true);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);

        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.TOP);

        greenPanel.add(label);
        f.add(redPanel);
        f.add(bluePanel);
        f.add(greenPanel);
    }
}
