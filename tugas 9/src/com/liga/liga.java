package com.liga;

import java.util.ArrayList;

/**
 * Created by Fransoklin on 24/06/2015.
 */
public class liga {


    private String namaLiga;
    ArrayList<divisi> daftardivisi = new ArrayList<divisi>();
    private club daftarclub;

// 1
    public void getDaftarDivisi (String liga)
    {
        if (liga== getNamaliga())
        {
            for (int i =0; i < daftardivisi.size() ; i++)
            {
                System.out.println(daftardivisi.get(i));
            }
        }
    }
    public liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public liga(String namaLiga, club daftarclub) {
        this.namaLiga = namaLiga;
        this.daftarclub = daftarclub;
    }

    public String getNamaliga() {
        System.out.println("Nama Liga");
        return namaLiga;
    }

    public void setNamaliga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public ArrayList<divisi> getDaftardivisi(liga ligacari)
    {
            System.out.println("Daftar divisi");
            return daftardivisi;
    }

    public void setDaftardivisi(divisi divisi) {
        this.daftardivisi.add(divisi);
    }

    public club getDaftarclub() {
        return daftarclub;
    }

    public void setDaftarclub(club daftarclub) {
        this.daftarclub = daftarclub;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                '}';
    }
}