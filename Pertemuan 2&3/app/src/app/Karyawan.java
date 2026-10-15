package app;

public class Karyawan {
    protected String kodeKaryawan;
    protected String nama;

    public Karyawan(String var1, String var2) {
        this.kodeKaryawan = var1;
        this.nama = var2;
    
    }
    public void absenPagi() {
        System.out.println(this.nama + ": absen pagi");
    }

    public void kerja() {
        System.out.println(this.nama + ": sedang kerja");
    }

    public void absenPulang() {
        System.out.println(this.nama + ": absen pulang");
    }

    public void getInfo() {
        System.out.println("Kode Karyawan:" + this.kodeKaryawan);
        System.out.println("Nama: " + this.nama);
    }
}