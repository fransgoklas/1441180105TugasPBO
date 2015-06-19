package com.frans;

/**
 * Created by Fransoklin on 11/06/2015.
 */
public class batre {
    private String jenisBatre;
    private int voltageBatre;

    public batre(String jenisBatre, int voltageBatre){
        this.jenisBatre = jenisBatre;
        this.voltageBatre = voltageBatre;

    }

    public String getJenisBatre() {
        return jenisBatre;
    }

    public void setJenisBatrai(String jenisBatre) {
        this.jenisBatre = jenisBatre;
    }

    public int getVoltageBatrai() {
        return voltageBatre;
    }

    public void setVoltageBatrai(int voltageBatrai) {
        this.voltageBatre = voltageBatrai;
    }

    @Override
    public String toString() {
        return "batre{" +
                "jenisBatre=" + jenisBatre +
                ", voltageBatrai=" + voltageBatre +
                '}';
    }
}