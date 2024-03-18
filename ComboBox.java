import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class ComboBox {
    ComboBox() {
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setLocation(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1 = new JLabel();
        String[] fruits = { "Chọn", "Apple", "Banana", "Orange" };
        JComboBox cb = new JComboBox(fruits);
        cb.setBounds(100, 100, 150, 50);
        label1.setBounds(100, 50, 150, 50);
        f.setLayout(null);
        f.add(label1);
        f.add(cb);
        label1.setText("Mời bạn chọn");
        cb.addActionListener(e -> {
            if (cb.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(f, "Mời bạn chọn");
            }
            label1.setText("Selected item is: " + cb.getSelectedItem());
        });
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}
