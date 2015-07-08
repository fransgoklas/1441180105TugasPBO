package com.liga;

import java.util.ArrayList;

/**
 * Created by Fransoklin on 24/06/2015.
 */
public class divisi {

    private String namaDivisi;
    private liga namaliga;
    ArrayList<club> daftarclub = new ArrayList<club>();



// 2
    public void getDaftarClubLiga (String liga)
    {
        if (liga == namaliga.getNamaliga())
        {
            for (int i =0; i < namaliga.daftardivisi.size() ; i++)
            {
                divisi y = namaliga.daftardivisi.get(i);
                System.out.println(y.getNamaDivisi());
                for (int j = 0; j < daftarclub.size(); j++)
                {
                    System.out.println(y.daftarclub.get(j));
                }
            }
        }
    }
    // 3
    public void getDaftarClubDIvisi (String divisi)
    {
        for (int i =0; i < namaliga.daftardivisi.size() ; i++)
        {
            divisi y = namaliga.daftardivisi.get(i);
            if (divisi == y.getNamaDivisi()) {
                for (int j = 0; j < daftarclub.size(); j++) {
                    System.out.println(y.daftarclub.get(j));
                }
            }
        }
    }

    public divisi(String namaDivisi, liga namaliga) {
        this.namaDivisi = namaDivisi;
        this.namaliga = namaliga;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public ArrayList<club> getDaftarclub() {
        System.out.println("Daftar club: ");
        return daftarclub;
    }

    public void setDaftarclub(club club) {
        this.daftarclub.add(club);
    }

    @Override
    public String toString() {
        return "Divisi{" +
                "namaDivisi='" + namaDivisi + '\'' +
                '}';
    }
}
