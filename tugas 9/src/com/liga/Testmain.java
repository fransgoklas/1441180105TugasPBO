package com.liga;

/**
 * Created by Fransoklin on 24/07/2015.
 */
public class Testmain {


    public static void main(String[] args) {
//      Membuat Objek
        liga spanyol = new liga("primera");

        divisi bbva = new divisi("BBVA", spanyol);
        divisi Segunda = new divisi("Segunda", spanyol);

        club realMadrid = new club("Real Madrid",bbva,spanyol);
        club barcelona = new club("Barcelona",bbva,spanyol);

        club barcelonaB = new club("Barcelona B",Segunda,spanyol);
        club malaga = new club("Malaga",Segunda,spanyol);


        spanyol.setDaftardivisi(bbva);
        spanyol.setDaftardivisi(Segunda);


        bbva.setDaftarclub(realMadrid);
        bbva.setDaftarclub(barcelona);

        Segunda.setDaftarclub(barcelonaB);
        Segunda.setDaftarclub(malaga);

        System.out.println("UAS PBO");
        System.out.println("++++++++++++++++++");
        System.out.println("");


//        No 1(Get daftar divisi by nama liga)
        System.out.println("Nomer 1");
        spanyol.getDaftarDivisi("primera");
        System.out.println("");

//        No 2(Get daftar club by nama liga)
        System.out.println("Nomer 2");
        bbva.getDaftarClubLiga("primera");
        System.out.println("");

//        No 3(Get daftar club by nama divisi)
        System.out.println("Nomer 3");
        bbva.getDaftarClubDIvisi("BBVA");
        System.out.println("");


//        No 4(Get club ini berada di divisi mana by nama club)
        System.out.println("Nomer 4");
        malaga.getNamaclub();
        System.out.println(malaga.getNamaclub());
        System.out.println(malaga.getdivisi());
        System.out.println("");

//        No 5(Get club ini berada di liga apa by nama club)
        System.out.println("Nomer 5");
        realMadrid.getNamaclub();
        System.out.println(realMadrid.getNamaclub());
        System.out.println(realMadrid.getliga());
        System.out.println("");

    }
}