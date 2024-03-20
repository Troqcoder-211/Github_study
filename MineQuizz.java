import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MineQuizz extends JFrame {
    String content = "MINE_QUIZZ";
    String copyRight = "copyRight @ fourT SGU 2024";
    JPanel contentPanelRight = new JPanel();
    ImageIcon imagePrimarySoftWare = new ImageIcon("Image/java.jpg");
    static String contentWelcomePanelRight = "Welcome to MINE_QUIZZ \n";
    static String contentWelcomePanelRightCode = "Enter your code \n";

    JPanel contentPanelLeft = new JPanel() {
        @Override
        protected void paintComponent(Graphics grphcs) {
            super.paintComponent(grphcs);
            Graphics2D g2d = (Graphics2D) grphcs;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint gp = new GradientPaint(0, 0,
                    new Color(97, 97, 97), 0, getHeight(),
                    new Color(189, 189, 189));
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, getWidth(), getHeight());

        }
    };

    static void setContentTitlePanelLeft(JPanel contentPaneLeft, String content, int size, int width, int height) {
        JLabel labelContentLeft = new JLabel(content);
        labelContentLeft.setForeground(new Color(92, 112, 176));
        labelContentLeft.setHorizontalAlignment(JLabel.CENTER);
        labelContentLeft.setVerticalAlignment(JLabel.CENTER);
        labelContentLeft.setHorizontalTextPosition(JLabel.CENTER);
        labelContentLeft.setVerticalTextPosition(JLabel.CENTER);
        labelContentLeft.setFont(new Font("Arial", Font.BOLD, size));
        labelContentLeft.setSize(new Dimension(width, height));
        contentPaneLeft.add(labelContentLeft);
    }

    static void setContentImagePanelLeft(JPanel contentJPanelLeft, ImageIcon imageIcon, int width, int height) {
        JLabel labelImageLeft = new JLabel();
        labelImageLeft.setIcon(imageIcon);
        labelImageLeft.setHorizontalAlignment(JLabel.CENTER);
        labelImageLeft.setVerticalAlignment(JLabel.CENTER);
        labelImageLeft.setPreferredSize(new Dimension(width, height));
        labelImageLeft.setSize(new Dimension(width, height));
        contentJPanelLeft.add(labelImageLeft);
    }

    static void setContentPanelRight(JPanel contentJPanelRight, String content, int size, int width, int height) {
        JLabel labelContentRight = new JLabel(content);
        labelContentRight.setForeground(new Color(92, 112, 176));
        labelContentRight.setHorizontalAlignment(JLabel.CENTER);
        labelContentRight.setVerticalAlignment(JLabel.CENTER);
        labelContentRight.setFont(new Font("Arial", Font.BOLD, size));
        labelContentRight.setSize(new Dimension(width, height));
        contentJPanelRight.add(labelContentRight);
    }

    static void setTextFieldRight(JPanel contentJPanelRight, int size) {
        JTextField textFieldright = new JTextField(size);
        textFieldright.setForeground(new Color(92, 112, 176));
        textFieldright.setFont(new Font("Arial", Font.BOLD, size));
        textFieldright.setHorizontalAlignment(JTextField.CENTER);

        JLabel labelContentRight = new JLabel(contentWelcomePanelRightCode);
        labelContentRight.setForeground(new Color(92, 112, 176));
        labelContentRight.setHorizontalAlignment(JLabel.CENTER);
        labelContentRight.setVerticalAlignment(JLabel.CENTER);
        labelContentRight.setFont(new Font("Arial", Font.BOLD, 15));

        JPanel contentJPanelRightInput = new JPanel();
        contentJPanelRightInput.setLayout(new GridLayout(2, 1));
        contentJPanelRightInput.add(labelContentRight);
        contentJPanelRightInput.add(textFieldright);

        contentJPanelRight.add(contentJPanelRightInput);
    }

    static void setButtonRight(JPanel contentJPanelRight, int size) {
        JButton buttonRight = new JButton("Submit");
        buttonRight.setForeground(new Color(92, 112, 176));
        buttonRight.setFont(new Font("Arial", Font.BOLD, size));
        contentJPanelRight.add(buttonRight);
    }

    MineQuizz() {
        JFrame f = new JFrame();
        contentPanelRight.setBackground(Color.WHITE);

        setContentImagePanelLeft(contentPanelLeft, imagePrimarySoftWare, 250, 100);
        setContentTitlePanelLeft(contentPanelLeft, content, 40, 350, 100);
        setContentTitlePanelLeft(contentPanelLeft, copyRight, 10, 250, 100);
        contentPanelLeft.setLayout(new FlowLayout(FlowLayout.CENTER, 125, 100));

        setContentPanelRight(contentPanelRight, contentWelcomePanelRight, 20, 500, 100);
        setTextFieldRight(contentPanelRight, 20);
        setButtonRight(contentPanelRight, 20);
        contentPanelRight.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));

        f.add(contentPanelLeft);
        f.add(contentPanelRight);
        f.setLayout(new GridLayout(1, 2));
        f.setSize(1000, 700);
        f.setLocation(500, 100);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MineQuizz();
        ;
    }
}