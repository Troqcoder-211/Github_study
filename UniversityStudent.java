public class UniversityStudent extends Student {
    private String schoolsName;

    public UniversityStudent(String MSSV, String Name, String Khoa, int Age, float fee, String schoolsName) {
        super(MSSV, Name, Khoa, Age, fee);
        this.schoolsName = schoolsName;
    }

    public UniversityStudent() {

    }

    public String getSchoolsName() {
        return schoolsName;
    }

    public void setSchoolsName(String schoolsName) {
        this.schoolsName = schoolsName;
    }

    public String getMSSV() {
        return super.getMSSV();
    }

    public String getName() {
        return super.getName();
    }

    public String getKhoa() {
        return super.getKhoa();
    }

    public int getAge() {
        return super.getAge();
    }

    public float getFee() {
        return super.getFee();
    }

    public void setMSSV(String MSSV) {
        super.setMSSV(MSSV);
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setKhoa(String khoa) {
        super.setKhoa(khoa);
    }

    public void setAge(int age) {
        super.setAge(age);
    }

    public void setFee(float fee) {
        super.setFee(fee);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello Student University !!");
    }
}
