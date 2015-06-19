package com.frans;

/**
 * Created by Fransoklin on 19/06/2015.
 */

public class test {
    public static void main(String [] Args){

        batre litium = new batre("litium",5000);
        batre ion = new batre("ion",3000);
        batre abc = new batre("abc", 1300);

        hp samsung = new hp("Samsung",4000000,"Kanada",1,"litium");
        hp andromax = new hp("andromax",1000000,"indonesia,",1,"abc");
        System.out.println(samsung.toString());
        System.out.println(andromax.getJenisBatrai());


    }
}

