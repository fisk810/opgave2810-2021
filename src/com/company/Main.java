package com.company;

public class Main {

    public static void main(String[] args) {
        Opgave1 opgave1 = new Opgave1();
        Opgave2 opgave2 = new Opgave2();

        //opgave1
        //opgave1.udskriv(opgave1.getArr());
        //opgave1.gennemsnit(opgave1.getArr(), 10);

        //opgave 2
        opgave2.load();
        opgave1.udskriv(opgave2.load());
    }
}
