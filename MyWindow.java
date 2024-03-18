import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow extends JFrame {
    public MyWindow(int Size_X, int Size_Y, int Location_X, int Location_Y) {
        backgroundImage();
        setTitle("My Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Size_X, Size_Y);
        setLocation(Location_X, Location_Y);
        setVisible(true);

    }

    public void backgroundImage() {
        ImageIcon image = new ImageIcon("Image/nartural.jpg");// create an ImageIcon
        setIconImage(image.getImage()); // change icon of frame
        getContentPane().setBackground(Color.blue);
    }

    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow(500, 500, 750, 250);

        String name = JOptionPane.showInputDialog(myWindow, "Enter your name:");
        JOptionPane.showMessageDialog(myWindow, "Hello " + name);

    }
}
