import java.awt.Color;

import javax.swing.*;

public class Ex3 {
    Ex3() {
        JFrame f = new JFrame("BÀI 3");
        String[] colors = { "White", "Green", "Blue", "Red" };
        JComboBox cb = new JComboBox(colors);
        f.setSize(500, 500);
        cb.setBounds(100, 100, 100, 100);
        f.setLayout(null);
        cb.addActionListener(e -> {
            if (cb.getSelectedIndex() == 0) {
                f.getContentPane().setBackground(Color.WHITE);
            } else if (cb.getSelectedIndex() == 1) {
                f.getContentPane().setBackground(Color.GREEN);
            } else if (cb.getSelectedIndex() == 2) {
                f.getContentPane().setBackground(Color.BLUE);
            } else if (cb.getSelectedIndex() == 3) {
                f.getContentPane().setBackground(Color.RED);
            }
        });
        f.add(cb);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Ex3();
    }
}
