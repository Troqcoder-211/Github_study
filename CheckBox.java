import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class CheckBox {
    CheckBox() {
        JFrame f = new JFrame("CheckBox Example");
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        label1.setHorizontalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label1.setSize(400, 100);
        label2.setSize(400, 100);
        label1.setBounds(150, 50, 50, 50);
        label1.setBounds(150, 100, 50, 50);

        JCheckBox checkbox1 = new JCheckBox("C++");
        checkbox1.setBounds(150, 150, 50, 50);

        JCheckBox checkbox2 = new JCheckBox("Java");
        checkbox2.setBounds(150, 200, 50, 50);

        f.add(checkbox1);
        f.add(checkbox2);
        f.add(label1);
        f.add(label2);

        checkbox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label1.setText("C++ Checkbox: "
                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }

        });

        checkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label2.setText("Java Checkbox: "
                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBox();
    }
}