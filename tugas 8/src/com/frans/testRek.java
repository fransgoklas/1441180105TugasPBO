package com.frans;

/**
 * Created by Fransoklin on 17/06/2015.
 */
public class testRek {
    public static void main(String[] args) {

//      Membuat objek rekening
        rek satu = new rek(40000000.0);
//      Membuat objek nasabah
        nasabah dua = new nasabah("frans",satu);

        System.out.println(dua.toString());

//        tarik 10jt
        satu.tarik(10000000.0);
        System.out.println(dua.getSaldo());

//        setor 20jt
        satu.setor(30000000.0);
        System.out.println(dua.getSaldo());
    }
}




