import java.util.Scanner;

public class Student {
    private String MSSV;
    private String Name;
    private String Khoa;
    private int Age;
    private float fee;

    public Student(String MSSV, String Name, String Khoa, int Age, float fee) {
        this.MSSV = MSSV;
        this.Name = Name;
        this.Khoa = Khoa;
        this.Age = Age;
        this.fee = fee;
    }

    public Student() {

    }

    public Student(Student student) {
        this.MSSV = student.MSSV;
        this.Name = student.Name;
        this.Khoa = student.Khoa;
        this.Age = student.Age;
        this.fee = student.fee;
    }

    public void sayHello() {
        System.out.println("Hello Student !!");
    }

    public String getMSSV() {
        return MSSV;
    }

    public String getName() {
        return Name;
    }

    public String getKhoa() {
        return Khoa;
    }

    public int getAge() {
        return Age;
    }

    public float getFee() {
        return fee;
    }

    public void setMSSV(String mSSV) {
        this.MSSV = mSSV;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setKhoa(String khoa) {
        this.Khoa = khoa;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public void display() {
        System.out.format("%-10s %-20s %-10s %-10d %-10f\n", MSSV, Name, Khoa, Age, fee);
    }

    public void input(Scanner scanner) {
        System.out.print("MSSV: ");
        setMSSV(scanner.next());
        scanner.nextLine();
        System.out.print("Name: ");
        setName(scanner.next());
        scanner.nextLine();
        System.out.print("Khoa: ");
        setKhoa(scanner.nextLine());
        System.out.print("Age: ");
        setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Fee: ");
        setFee(scanner.nextFloat());
        scanner.nextLine();
    }

}
