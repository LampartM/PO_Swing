/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolo_aids;

/**
 *
 * @author Maciek
 */
public class SilniaDyn {

    public static void main(String[] args) {
        final int N = 5; // n-ty wyraz ciągu
        System.out.println(silnia(N));
    }

    static int silnia(int n) {
        int[] tab = new int[n + 1];
        tab[1] = 1;  
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] * i;
        }
        return tab[tab.length - 1];
    }
}

