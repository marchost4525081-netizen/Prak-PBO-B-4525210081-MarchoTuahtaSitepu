package com.univ;

public class mahasiswa {
    
private String npm;
private String namaDepan;
private String namaBelakang;
private String tanggalLahir;
private String alamat; 
private String Prodi;
private int umur;

public mahasiswa(String npm, String namaDepan, String namaBelakang, String tanggalLahir, String alamat,String Prodi,int umur)  {
    this.npm = npm;
    this.namaDepan = namaDepan;
    this.namaBelakang = namaBelakang;
    this.tanggalLahir = tanggalLahir; 
    this.alamat = alamat;
    this.Prodi = Prodi;
    this.umur = umur ;
    
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

        public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }
    
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getProdi(){
        return Prodi;

        public void setProdi(String Prodi ) {
            this.Prodi = Prodi;
        }
    }
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur ;
    }

    public void belajar() {
        System.out.println(namaDepan + "sedang belajar");
    }
    
    public void ujiam() {
        System.out.println(namaDepan + "sedang ujian");
    }

    public void displayInfo() {
        System.out.println("===== Data Mahasiswa ====");
        System.out.println("NPM                  : " + npm);
        System.out.println("Nama Depan           : " + namaDepan);
        System.out.println("Nama Belakang        : " + namaBelakang);
        System.out.println("Tanggal Lahir        : " + tanggalLahir);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Umur                    : " + umur);
        System.out.println();
    } 
}