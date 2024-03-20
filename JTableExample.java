import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class JTableExample {
    static Scanner scanner = new Scanner(System.in);

    JTableExample() {
        JFrame f = new JFrame();
        JPanel panelTop = new JPanel();
        JLabel label = new JLabel("DANH SÁCH QUẢN LÝ ĐIỂM SINH VIÊN");
        panelTop.setBounds(100, 0, 300, 50);

        JPanel panelCenter = new JPanel();
        JLabel labelMSV = new JLabel("Mã Sinh Viên");
        JLabel labelName = new JLabel("Họ Tên");
        JLabel labelPoint = new JLabel("Điểm");

        JTextField textMSV = new JTextField(20);
        JTextField textHT = new JTextField(20);
        JTextField textPoint = new JTextField(20);
        panelCenter.setBounds(0, 50, 500, 100);
        panelCenter.setLayout(new GridLayout(3, 2));

        JPanel panelRight = new JPanel();
        JButton btnAdd = new JButton("Thêm");
        JButton btnEdit = new JButton("Sửa");
        JButton btnDel = new JButton("Xóa");
        JButton btnExit = new JButton("Thoát");
        panelRight.setBounds(0, 350, 200, 50);
        panelRight.setLayout(new GridLayout(4, 1));

        JPanel panelBottom = new JPanel();
        JTable table = new JTable();
        DefaultTableModel modelTablePoint = new DefaultTableModel();
        modelTablePoint.addColumn("Mã SV");
        modelTablePoint.addColumn("Họ Tên");
        modelTablePoint.addColumn("Điểm");
        table.setModel(modelTablePoint);
        panelBottom.setBounds(0, 400, 500, 300);
        JScrollPane sp = new JScrollPane(table);
        panelTop.add(label);
        f.setLayout(new BorderLayout());

        panelCenter.add(labelMSV);
        panelCenter.add(textMSV);
        panelCenter.add(labelName);
        panelCenter.add(textHT);
        panelCenter.add(labelPoint);
        panelCenter.add(textPoint);

        panelRight.add(btnAdd);
        panelRight.add(btnEdit);
        panelRight.add(btnDel);
        panelRight.add(btnExit);

        panelBottom.add(sp);

        f.add(panelTop, BorderLayout.NORTH);
        f.add(panelCenter, BorderLayout.CENTER);
        f.add(panelRight, BorderLayout.EAST);
        f.add(panelBottom, BorderLayout.SOUTH);

        ArrayList<String> students = new ArrayList<>();

        if (ObjectOriendtedProgramming.FileReaderBasic(new File("ListStudent.txt"), scanner, students)) {
            LoadList(students, modelTablePoint);
        }

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (textMSV.getText().equals("") || textHT.getText().equals("") || textPoint.getText().equals("")) {
                    JOptionPane.showMessageDialog(f, "Nhập Họ Tên, Mã Sinh Viên, Điểm");
                } else {
                    modelTablePoint.addRow(new Object[] { textMSV.getText(), textHT.getText(), textPoint.getText() });
                    String fullName = textHT.getText().replaceAll(" ", "_");
                    try {
                        FileWriter file = new FileWriter("ListStudent.txt", true);
                        file.write(textMSV.getText() + " " + fullName + " " + textPoint.getText() + "\n");
                        file.close();

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                int i = table.getSelectedRow();

                if (i >= 0) {
                    modelTablePoint.setValueAt(textMSV.getText(), i, 0);
                    modelTablePoint.setValueAt(textHT.getText(), i, 1);
                    modelTablePoint.setValueAt(textPoint.getText(), i, 2);
                } else {
                    JOptionPane.showMessageDialog(f, "Chọn mã sinh viên muốn sửa");
                }

            }
        });
        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                int i = table.getSelectedRow();
                if (i >= 0) {
                    modelTablePoint.removeRow(i);
                } else {
                    JOptionPane.showMessageDialog(f, "Chọn mà sinh viên muốn xóa");
                }
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                f.dispose();
                new MineQuizz();
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 800);
        f.setLocation(800, 100);
        f.setVisible(true);
    }

    public static void main(String[] args) {

        // BoardPoint(f);
        // ListManagerPoint(f);
        new JTableExample();

    }

    static void BoardPoint(JFrame f) {
        JTable table = new JTable();
        JScrollPane sp = new JScrollPane(table);
        String[][] data = {
                { "1", "Nguyen Van A", "10" },
                { "2", "Nguyen Van B", "9" },
                { "3", "Nguyen Van C", "8" },
                { "4", "Nguyen Van D", "7" },
                { "5", "Nguyen Van E", "6" },
                { "6", "Nguyen Van F", "5" },
                { "7", "Nguyen Van G", "4" },
                { "8", "Nguyen Van H", "3" },
                { "9", "Nguyen Van I", "2" },
                { "10", "Nguyen Van J", "1" },
        };
        String[] column = { "MSSV", "Ho Ten", "Diem" };
        DefaultTableModel model = new DefaultTableModel(data, column);
        table.setModel(model);
        f.add(sp);
    }

    static void LoadList(ArrayList<String> students, DefaultTableModel modelTablePoint) {

        for (String student : students) {
            String dataListStudent[] = student.split(" ");
            String dataListNameStudent = dataListStudent[1].replaceAll("_", " ");
            modelTablePoint.addRow(new Object[] { dataListStudent[0], dataListNameStudent, dataListStudent[2] });
        }
    }
}
