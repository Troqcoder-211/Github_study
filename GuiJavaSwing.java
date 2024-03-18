import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.*;

public class GuiJavaSwing {
    public static void main(String[] args) {
        JFrame Jframe = new JFrame("Hello World "); // creates a frame
        JLabel JLabel = new JLabel(); // creates a label
        JButton JButton = new JButton("click me"); // creates a button
        Frame(Jframe);
        Label(Jframe, JLabel);
        JButton(Jframe, JButton);
    }

    // JFrame
    static void Frame(JFrame Jframe) {

        Jframe.setTitle("Learn JAVA Swing"); // sets title of frame

        Jframe.setSize(600, 500); // set the x-dimension and y-dimension of the frame

        // Hiển thị khung hình vị trí bắt đầu
        Jframe.setLocation(750, 250);

        Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Thoát ra khỏi chương
        // trình khi đóng cửa sổ

        // Jframe.setDefaultCloseOperation(Jframe.HIDE_ON_CLOSE); // Ẩn của sổ khi
        // chương trình đang chạy

        // Jframe.setDefaultCloseOperation(Jframe.DISPOSE_ON_CLOSE);// Xóa bỏ khung
        // chương trình vẫn chạy

        // Jframe.setDefaultCloseOperation(Jframe.DO_NOTHING_ON_CLOSE); // Không thể bỏ
        // khung
        // chương trình đang chạy

        ImageIcon imageIcon = new ImageIcon("Image/download.png");

        Jframe.setIconImage(imageIcon.getImage()); // change icon of frame

        // Jframe.getContentPane().setBackground(new Color(0, 250, 0));// add Color for
        // Background

        Jframe.setVisible(true); // makes the frame visible
    }

    // JLabel
    static void Label(JFrame Jframe, JLabel JLabel) {

        ImageIcon imageIcon = new ImageIcon("Image/download.png");
        Border Border = BorderFactory.createLineBorder(Color.blue, 2);// set Border
        JLabel.setText("TRỌNG NGUYỄN");
        JLabel.setIcon(imageIcon);
        JLabel.setHorizontalTextPosition(JLabel.LEFT);// set Text LEFT,RIGHT,CENTER
        // OF
        // IMAGE ICON
        JLabel.setVerticalTextPosition(JLabel.CENTER);// set Text TOP , CENTER
        // ,BOTTOM
        // of IMAGE ICON
        JLabel.setForeground(Color.red);// set color of Text
        // JLabel.setFont(new Font("Arial", Font.PLAIN, 20));// set Font
        JLabel.setIconTextGap(100);// set IconTextGap
        // JLabel.setBackground(Color.yellow);// set Background
        // JLabel.setOpaque(true);// display Background color
        // JLabel.setBorder(Border);// set Border
        // JLabel.setHorizontalAlignment(JLabel.CENTER);// set Text LEFT,RIGHT,CENTER OF
        // IMAGE ICON
        // JLabel.setVerticalAlignment(JLabel.CENTER);// set Text LEFT,RIGHT,CENTER OF
        // IMAGE ICON
        JLabel.setBounds(0, 0, 250, 250);// set Location
        Jframe.add(JLabel);
    }

    public static void JButton(JFrame Jframe, JButton JButton) {

        Jframe.add(new JButton("click me"));
        Jframe.setLayout(null);
    }
}
