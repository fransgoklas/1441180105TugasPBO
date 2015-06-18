package com.frans;

/**
 * Created by Fransoklin on 17/06/2015.
 */
public class rek {


    private double saldo;

    public rek(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tarik(double jumlah){
        saldo = saldo - jumlah;
    }

    public void setor(double jumlah){
        saldo = saldo + jumlah;
    }


    @Override
    public String toString() {
        return "Rekening{" +
                "saldo=" + saldo +
                '}';
    }
}
