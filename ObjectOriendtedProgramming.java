import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ObjectOriendtedProgramming {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        // System.out.println(exception(scanner));
        // SearchStudent();
        ListenMusic();

    }

    static Student[] ListStudent(Student[] students, File file, Scanner scanner) {
        System.out.print(" Moi nhap so hoc sinh : ");
        int n = scanner.nextInt();
        students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].input(scanner);
            FileWritterBasic(file, students[i]);
            System.out.println();
        }

        return students;
    }

    static void displayStudent(Student[] students) {
        System.out.format("%-10s %-25s %-10s %-10s %-10s\n", "MSSV", "Name", "Khoa", "Age", "fee");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }

    static void InheritanceandPolymorphism() {
        Student Trong = new Student();
        Student Trong2 = new CollegeStudent();
        Student Trong3 = new UniversityStudent();

        Student[] students = { Trong, Trong2, Trong3 };
        for (Student student : students) {
            student.sayHello();
        }
    }

    static float exception(Scanner scanner) {
        int x, y, z = 0;
        boolean checkException = false;
        do {
            try {
                System.out.print("nhap so bi chia: ");
                x = scanner.nextInt();
                System.out.print("nhap so chia: ");
                y = scanner.nextInt();
                z = x / y;
                break;
            } catch (ArithmeticException e) {
                System.out.println("loi chia cho 0");
            } catch (InputMismatchException e) {
                System.out.println("loi nhap khong hop le");
            } catch (Exception e) {
                System.out.println("loi khong xac dinh");
            }
            scanner.next();
        } while (!checkException);

        return z;
    }

    static boolean fileBasic(File file) {
        if (file.exists()) {
            // System.out.println("file ton tai");
            // System.out.println(file.getPath());
            // System.out.println(file.getAbsolutePath());
            // System.out.println(file.isFile());
            return true;

        } else {
            System.out.println("file khong ton tai");
            return false;
        }
    }

    static void FileWritterBasic(File file, Student students) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(students.getMSSV() + " " + students.getName() + " " + students.getKhoa() + " "
                    + students.getAge() + " " + students.getFee() + "\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean FileReaderBasic(File file, Scanner scanner, ArrayList<String> students) {
        String line, str;
        try {
            scanner = new Scanner(file);
            // DOC FILE HET DONG
            // while (scanner.hasNextLine()) {
            // line = scanner.nextLine();
            // System.out.println(line);
            // }
            // System.out.println();
            // DOC FILE HET KHOANG CACH
            while (scanner.hasNextLine()) {
                str = scanner.nextLine();
                students.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    static void SearchStudent() {
        File file = new File("ListStudent.txt");
        ArrayList<String> students = new ArrayList();
        ArrayList<Student> listStudents = new ArrayList();
        if (fileBasic(file) && FileReaderBasic(file, scanner, students)) {
            // ListStudent(students, file, scanner);
            // FileReaderBasic(file, scanner, students);
            for (String student : students) {
                String[] data = student.split(" ");
                listStudents.add(
                        new Student(data[0], data[1], data[2], Integer.parseInt(data[3]), Float.parseFloat(data[4])));
            }
        } else {
            System.out.println("file khong ton tai");
        }

        while (true) {

            System.out.print("nhap TEN can tim: ");
            String name = scanner.nextLine();
            for (Student student : listStudents) {
                if (student.getName().contains(name)) {
                    System.out.println(student.getName());
                }
            }
            System.out.println("1. TIM KIEM TEN\n2. THOAT");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 2)
                break;
        }
    }

    static void ListenMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File DontFreatMusic = new File("C:\\vscode\\Java_fullcourse\\PackgeAudio\\Don't Fret - Quincas Moreira.wav");
        File WatchMeWorkMusic = new File(
                "C:\\vscode\\Java_fullcourse\\PackgeAudio\\Y2meta.app - Watch Me Work ~ Tinashe ( Slowed + Reverb ) (128 kbps).wav");
        File ShhhhhhhMusic = new File(
                "C:\\vscode\\Java_fullcourse\\PackgeAudio\\Y2meta.app - shhhhhhh_ _ WEAN & TLINH _ ( Lyrics Video ). (128 kbps).wav");
        File NeuAnhMuonDoiVaiMusic = new File(
                "C:\\vscode\\Java_fullcourse\\PackgeAudio\\Y2meta.app - NẾU ANH MUỐN ĐỔI VAI - UMIE x SimonC x Hổ _ Official MV (128 kbps).wav");
        File ForYahMusic = new File(
                "C:\\vscode\\Java_fullcourse\\PackgeAudio\\Y2meta.app - [ENG][Pinyin] For ya - Jiang Xiao Ne (蒋小呢) lyrics 歌词 (128 kbps).wav");
        File TinhVeMusic = new File(
                "C:\\vscode\\Java_fullcourse\\PackgeAudio\\Y2meta.app - TINH VỆ (精卫) - JAPANDEE REMIX (128 kbps).wav");
        while (true) {
            try {
                if (System.getProperty("os.name").contains("Windows"))
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                else
                    Runtime.getRuntime().exec("clear");
            } catch (IOException | InterruptedException ex) {
            }
            // System.out.println(System.getProperty("os.name"));
            System.out.println("Which song do you want to listen to?");
            System.out.println("1. Don't Fret");
            System.out.println("2. Watch Me Work");
            System.out.println("3. Shhhhhhh");
            System.out.println("4. Neu Anh Muon Doi Vai");
            System.out.println("5. For Yah");
            System.out.println("6. Tinh Ve");
            int choice;
            do {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
            } while (choice < 1 || choice > 6);
            switch (choice) {
                case 1:
                    Audio.AudioLive(DontFreatMusic);
                    break;
                case 2:
                    Audio.AudioLive(WatchMeWorkMusic);
                    break;
                case 3:
                    Audio.AudioLive(ShhhhhhhMusic);
                    break;
                case 4:
                    Audio.AudioLive(NeuAnhMuonDoiVaiMusic);
                    break;
                case 5:
                    Audio.AudioLive(ForYahMusic);
                    break;
                case 6:
                    Audio.AudioLive(TinhVeMusic);
                    break;
            }
        }
    }
}
