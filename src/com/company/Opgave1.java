package com.company;

public class Opgave1 {
    private int[] arr = {0, 1, 2, 3 , 4, 5, 6, 7, 8, 9};


    public void udskriv(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public double gennemsnit(int[] arr, int amount){
        int counter = 0;
        for (int i : arr) {
            counter = counter + i;

        }
        //(double), gør at inten counter / amount bliver udregnet som en double i stedet for en int.
        //dette giver et mere præcist svar
        return (double)counter/amount;
    }

    public int[] getArr() {
        return arr;
    }

}

