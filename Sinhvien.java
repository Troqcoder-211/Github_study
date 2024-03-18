public class Sinhvien {
    private String Msv;
    private String Ht;
    private String Diem;

    public Sinhvien(String Msv, String Ht, String Diem) {
        this.Msv = Msv;
        this.Ht = Ht;
        this.Diem = Diem;
    }

    public String getMsv() {
        return Msv;
    }

    public void setMsv(String msv) {
        Msv = msv;
    }

    public String getHt() {
        return Ht;
    }

    public void setHt(String ht) {
        Ht = ht;
    }

    public String getDiem() {
        return Diem;
    }

    public void setDiem(String diem) {
        Diem = diem;
    }

}
