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
class FiboDyn {

    public static void main(String[] args) {
        final int N = 5; // n-ty wyraz ciągu
        System.out.println(fibo(N));
    }

    static int fibo(int n) {
        int[] tab = new int[n + 1];
        tab[1] = 1;
        tab[2] = 1;
        for (int i = 3; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        return tab[tab.length - 1];
    }
    
    static int fiboz(int n)
    {
        if (n == 1 || n == 2)
            return 1;
        else
            return 3* ( fibo(n-1) * fibo(n-2) );
    }
}
