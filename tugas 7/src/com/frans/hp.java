package com.frans;

/**
 * Created by Fransoklin on 11/06/2015.
 */
public class hp {

    private String merkHp;
    private int hargaHp;
    private String asalPembuatan;
    private int kapasitasMemori;
    private String jenisBatre;


    public hp(String merkHp, int harhaHp, String asalPembuatan, int kapasitasMemori, String jenisBatre) {
        this.merkHp = merkHp;
        this.hargaHp = harhaHp;
        this.asalPembuatan = asalPembuatan;
        this.kapasitasMemori = kapasitasMemori;
        this.jenisBatre = jenisBatre;
    }

    public String getMerkHp() {
        return merkHp;
    }

    public void setMerkHp(String merkHp) {
        this.merkHp = merkHp;
    }

    public int getHarhaHp() {
        return hargaHp;
    }

    public void setHarhaHp(int harhaHp) {
        this.hargaHp = harhaHp;
    }

    public int getKapasitasMemori() {
        return kapasitasMemori;
    }

    public void setKapasitasMemori(int kapasitasMemori) {
        this.kapasitasMemori = kapasitasMemori;
    }

    public String getJenisBatrai() {
        return jenisBatre;
    }

    public void setJenisBatrai(String jenisBatrai) {
        this.jenisBatre = jenisBatrai;
    }

    @Override
    public String toString() {
        return "hape{" +
                "merkHp='" + merkHp + '\'' +
                ", harhaHp=" + hargaHp +
                ", kapasitasMemori=" + kapasitasMemori +
                ", jenisBatrai=" + jenisBatre +
                '}';
    }
}