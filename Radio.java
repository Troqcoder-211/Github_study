import javax.swing.*;

public class Radio {
    Radio() {
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setLocation(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JRadioButton jr = new JRadioButton("Radio Button", true);
        jr.setBounds(100, 100, 100, 100);
        f.add(jr);
        f.setVisible(true);
        if (jr.isSelected()) {
            JOptionPane.showMessageDialog(f, "Radio Button is selected");
        }
    }

    public static void main(String[] args) {
        new Radio();
    }
}
