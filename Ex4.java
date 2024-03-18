import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex4 {
    Ex4() {
        JFrame f = new JFrame("EX4");
        JRadioButton r1 = new JRadioButton("Fish");
        JRadioButton r2 = new JRadioButton("Cat");
        JRadioButton r3 = new JRadioButton("Dog");
        JRadioButton r4 = new JRadioButton("Rabbit");
        JRadioButton r5 = new JRadioButton("Pig");
        ImageIcon imageDog = new ImageIcon("Image/dog.jpg");
        ImageIcon imageCat = new ImageIcon("Image/cat.png");
        ImageIcon imageRabbit = new ImageIcon("Image/rabbit.jpg");
        ImageIcon imagePig = new ImageIcon("Image/heo.jpg");
        ImageIcon imageFish = new ImageIcon("Image/ca.jpg");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        bg.add(r5);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
        f.add(r5);

        JLabel l = new JLabel();
        r1.setBounds(10, 0, 50, 50);
        r2.setBounds(60, 0, 50, 50);
        r3.setBounds(110, 0, 50, 50);
        r4.setBounds(160, 0, 50, 50);
        r5.setBounds(210, 0, 50, 50);

        f.setLayout(null);
        l.setBounds(0, 200, 100, 150);
        f.add(l);
        f.setSize(300, 500);
        l.setBounds(0, 0, 250, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        r1.addActionListener(e -> {
            l.setIcon(imageFish);
        });
        r2.addActionListener(e -> {
            l.setIcon(imageCat);
        });
        r3.addActionListener(e -> {
            l.setIcon(imageDog);
        });
        r4.addActionListener(e -> {
            l.setIcon(imageRabbit);
        });
        r5.addActionListener(e -> {
            l.setIcon(imagePig);
        });
    }

    public static void main(String[] args) {
        new Ex4();
    }
}
