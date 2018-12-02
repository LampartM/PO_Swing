/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolo_aids;

import java.util.Scanner;

/**
 *
 * @author Maciek
 */
public class ResztaZachlanny {


    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        String tekst;
        final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        final int[] ILOSC = {1,2,3,2,1,31,23,35,23}; //Dokładnych iosci nie pamiętam xD
        int zl, gr, r, i = 0;
        zl = 7;
        gr = 53;// tu wpisujecie kwote, tez nie pamietam ile dokladnie ale gdzies kolo tego
        r = zl * 100 + gr;
        while (r > 0) {
            if (r >= M[i] && ILOSC[i] > 0) {
                System.out.print(M[i] / 100.0 + " ");
                r = r - M[i];
                ILOSC[i] = ILOSC[i]-1;
            } else {
                i++;
            }
        }
        System.out.println();
    }
}