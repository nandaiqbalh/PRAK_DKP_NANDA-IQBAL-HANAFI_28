package com.nandaiqbalh;

public class Pendefinisi {
    public static void main(String[] args) {
        Pendefinisi objek = new Pendefinisi();
        objek.greeting();
        objek.kelompok("Kelompok 28");
        String print = objek.kenalan("Nanda", "futsal");
        System.out.println(print);
    }
    public void greeting(){
        System.out.println("Hai, saya method dari class pendefinisi. Salam kenal :)");
    }

    public void kelompok(String kelompok){
        System.out.println(kelompok);
    }

    public String kenalan (String nama, String hobi){
        return "Hai, Nama saya " + nama + " hobi saya " + hobi;
    }
}
