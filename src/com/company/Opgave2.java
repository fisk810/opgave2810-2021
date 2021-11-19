package com.company;

import java.io.File;

import java.util.Scanner;

public class Opgave2 {
    File file = new File("MinFil.txt");
    Scanner myFile = new Scanner(file);
    int[] fileNumbers = new int[10];

    public int[] load(){
        int i = 0;
        while (myFile.hasNextInt()) {
            fileNumbers[i] = myFile.nextInt();
            i++;
        }
        return fileNumbers;
        }
}
