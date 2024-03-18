import java.awt.*;
import java.util.*;
import java.util.concurrent.Flow;

import javax.swing.*;

public class TestClass {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        JFrame Jframe = new JFrame(); // creates a frame
        Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Jframe.setSize(500, 200);
        Jframe.setLocation(750, 250);
        // int choice = JoptionPaneLearn(Jframe);
        // choiceEx(choice, Jframe);
        Jframe.setVisible(true);
        FlowLayout(Jframe);
        // GridLayoutLearn(Jframe);
        // BorderLayoutLearn(Jframe);
    }

    public static void HelloWorld(JFrame Jframe) {
        Jframe.setTitle("Hello World");
        Jframe.setLocation(300, 200);
        Jframe.add(new Button("click"));
        Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static int JoptionPaneLearn(JFrame Jframe) {
        Jframe.setTitle("JoptionPane");
        String chat;
        int num, ques;
        do {
            chat = JOptionPane.showInputDialog(Jframe, "Enter your choice ");
            if (chat != null && chat.trim().equals("")) {
                try {
                    num = Integer.parseInt(chat);
                    ques = JOptionPane.showConfirmDialog(Jframe, "Are you sure?", "Question",
                            JOptionPane.YES_NO_OPTION);
                    if (ques == JOptionPane.YES_OPTION) {
                        break;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong Input");
                }
            }
        } while (true);
        return num;
    }

    public static void FlowLayout(JFrame Jframe) {
        Jframe.setTitle("FlowLayout");
        JLabel JLabel1 = new JLabel("Enter your name");
        JLabel JLabel2 = new JLabel("Enter your city");
        JTextField JTextField1 = new JTextField(20);
        JTextField JTextField2 = new JTextField(20);
        JButton JButton = new JButton("Login");

        JPanel JPanel1 = new JPanel();
        JPanel JPanel2 = new JPanel();
        JPanel1.setPreferredSize(new Dimension(500, 40));
        JPanel2.setPreferredSize(new Dimension(500, 40));

        JPanel1.add(JLabel1);
        JPanel1.add(JTextField1);

        JPanel2.add(JLabel2);
        JPanel2.add(JTextField2);

        Jframe.add(JPanel1);
        Jframe.add(JPanel2);
        Jframe.add(JButton);

        JButton.addActionListener(e -> {
            System.out.println(JTextField1.getText() + JTextField2.getText());
        });
        Jframe.add(JButton);

        Jframe.setLayout(new FlowLayout(FlowLayout.CENTER, 500, 10));
    }

    public static void GridLayoutLearn(JFrame Jframe) {
        Jframe.setTitle("GridLayout");
        Jframe.setLayout(new GridLayout(3, 3, 10, 0));
        Jframe.add(new Button("1"));
        Jframe.add(new Button("2"));
        Jframe.add(new Button("3"));
        Jframe.add(new Button("4"));
        Jframe.add(new Button("5"));
        Jframe.add(new Button("6"));
        Jframe.add(new Button("7"));
        Jframe.add(new Button("8"));
    }

    public static void BorderLayoutLearn(JFrame Jframe) {
        Jframe.setTitle("Border Layout");
        Jframe.setLayout(new BorderLayout());
        Jframe.add(new Button("TOP"), BorderLayout.NORTH);
        Jframe.add(new Button("LEFT"), BorderLayout.WEST);
        Jframe.add(new Button("CENTER"), BorderLayout.CENTER);
        Jframe.add(new Button("RIGHT"), BorderLayout.EAST);
        Jframe.add(new Button("BOTTOM"), BorderLayout.SOUTH);
    }

    public static void choiceEx(int choice, JFrame Jframe) {
        do {
            System.out.println("1. FlowLayout | 2. GridLayout | 3. BorderLayout ");
            System.out.print("Enter youy choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    FlowLayout(Jframe);
                    break;
                case 2:
                    GridLayoutLearn(Jframe);
                    break;
                case 3:
                    BorderLayoutLearn(Jframe);
                    break;
            }
        } while (choice < 1 || choice > 3);
    }

}
