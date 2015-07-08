package com.liga;

/**
 * Created by Fransoklin on 04/07/2015.
 */
public class club {


    private String namaclub;
    private divisi divisi;
    private liga liga;

    public club(String namaclub) {
        this.namaclub = namaclub;
    }

    public club(String namaclub, divisi divisi, liga liga) {
        this.namaclub = namaclub;
        this.divisi = divisi;
        this.liga = liga;
    }

    public String getNamaclub() {
        return namaclub;
    }

    public void setnamaclub(String namaclub) {
        this.namaclub = namaclub;
    }

    public divisi getdivisi() {
        return divisi;
    }

    public void setdivisi(divisi divisi) {
        this.divisi = divisi;
    }

    public liga getliga() {
        return liga;
    }

    public void setliga(liga liga) {
        this.liga = liga;
    }

// 4
    public void getNamaDivisi (String mencari)
    {
        for (int i = 0; i < liga.daftardivisi.size() ; i++)
        {
            divisi y = liga.daftardivisi.get(i);
            for (int j = 0; j < divisi.daftarclub.size() ; j++)
            {
                y.daftarclub.get(j);
                club a =y.daftarclub.get(j);
                if (mencari == a.getNamaclub())
                {
                    System.out.println(y.getNamaDivisi());
                }
            }
        }
    }

    public void setDivisi(divisi divisi){
        this.divisi = divisi;
    }

// 5
    public void getNamaLiga (String mencari){
        for (int i = 0; i < liga.daftardivisi.size() ; i++)
        {
            divisi y = liga.daftardivisi.get(i);
            for (int j = 0; j < divisi.daftarclub.size() ; j++)
            {
                y.daftarclub.get(j);
                club a = y.daftarclub.get(j);
                if (mencari == a.getNamaclub())
                {
                    System.out.println(liga.getNamaliga());
                }
            }
        }
    }

    public void setLiga (liga liga){
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "Klub{" +
                "namaclub='" + namaclub + '\'' +
                '}';
    }
}