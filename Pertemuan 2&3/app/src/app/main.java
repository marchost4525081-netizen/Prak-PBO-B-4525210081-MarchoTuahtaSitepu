package app;

public class main {
    public static void main ( String[]args) throws Exception {
        Karyawan Ridho = new Karyawan("12345","Ridho");
        Ridho.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();
        Ridho.absenPulang();

        System.out.println();

        Karyawan Melan = new Karyawan("12346". "Melan");
        Melan.getInfo();
        Melan.absenPagi();
        Melan.kerja();
        Melan.absenPulang();
    }
    
}
