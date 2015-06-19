package com.frans;

/**
 * Created by Fransoklin on 17/06/2015.
 */


public class nasabah {

    // write your code here
    private String namaNasabah;
    private rek saldo;

    public nasabah(String nama, rek saldo) {
        namaNasabah = nama;
        this.saldo = saldo;
    }

    public String getNama() {
        return namaNasabah;
    }

    public void setNama(String nama) {
        namaNasabah = nama;
    }

    public rek getSaldo() {
        return saldo;
    }

    public void setSaldo(rek saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "saldo=" + saldo +
                ", Nama='" + namaNasabah + '\'' +
                '}';
    }
}
