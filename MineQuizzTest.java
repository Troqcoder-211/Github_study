import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MineQuizzTest extends JFrame {

    JPanel Cont = new JPanel();
    JPanel firts = new JPanel();
    JPanel second = new JPanel();

    JButton btnFirst = new JButton("First switch to Second");
    JButton btnSecond = new JButton("Second switch to Third");

    CardLayout cardLayout = new CardLayout();

    MineQuizzTest() {

        Cont.setLayout(cardLayout);

        firts.add(btnFirst);
        firts.setBackground(Color.BLACK);
        second.add(btnSecond);
        second.setBackground(Color.RED);

        Cont.add("firts", firts);
        Cont.add("second", second);

        cardLayout.show(Cont, "firts");

        add(Cont);

        btnFirst.addActionListener(e -> {
            cardLayout.show(Cont, "second");
        });

        btnSecond.addActionListener(e -> {
            cardLayout.show(Cont, "firts");
        });

        setSize(1000, 700);
        setLocation(500, 100);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MineQuizzTest();
    }
}
