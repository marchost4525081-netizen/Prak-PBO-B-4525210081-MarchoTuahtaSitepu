package com.univ;

public class main {

   public static void main (String[] args) {
        mahasiswa marcho = new mahasiswa(
        "4525210081",
        "marcho tuahta ",
        "sitepu",
        "29 agust 2007",
        "tsc",
        19
         );

        mahasiswa david = new mahasiswa(
        "4524210002",
        "david",
        "saputra",
        "10 mei 2001",
        "jakarta",
        23
        );

        marcho.displayinfo();
        david.displayinfo();

        marcho.belajar();
        david.ujian();
   } 
}
