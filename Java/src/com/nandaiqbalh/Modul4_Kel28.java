package com.nandaiqbalh;

public class Modul4_Kel28 {
    public static void main(String[] args) {

        // PEMANGGILAN FUNGSI
        //penggunaan function non-return type dengan megisikan argument untuk parameter kelompok
        cetak("Kelompok 28");
        //penggunaan function non-return type tanpa parameter
        cetak1();
        //penggunaan function return type dengan mengisikan nilai pada parameter text
        System.out.println(cetak2("Function dengan Return"));
        //penggunaan function return type tanpa parameter
        System.out.println(cetak3());

        /*// PEMANGGILAN METHOD
        Pendefinisi objek = new Pendefinisi();
        objek.greeting();
        objek.kelompok("Kelompok 28");
        String print = objek.kenalan("Nanda", "futsal");
        System.out.println(print);*/
    }

    // non-return type dengan parameter
    static void cetak(String kelompok) {
        System.out.println(kelompok);
    }

    // non-return type tanpa parameter
    static void cetak1() {
        System.out.println("Hello Praktikan DKP 2021 ^^ ");
    }

    // return type dengan parameter
    static String cetak2(String text) {
        return text;
    }

    // return type tanpa parameter
    static String cetak3() {
        return "Kali ini kita akan belajar mengenai Function";
    }


}
