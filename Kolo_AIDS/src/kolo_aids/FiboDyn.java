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
    
    
    static int fibo2dyn(int n)
    {
        int[] tab = new int[n+1];
        tab[1] = 1;
        tab[2] = 1;
        for (int i = 3; i < tab.length; i++)
        {
           // tab[i] = tab[i-1] + tab[i-2]; // zamiast tego to warunki w if'ach
            // tam były 3 wartunki ze i>2 i i%3=0 itd.
            //pierwszy wartunek będzie tu zawsze spełniony bo pętla zaczyna się od 3
            //więc if'y mniej więcej tak
            if(i%3==0)
            {
                //i tu funkcja
            }
            if(i%3==1)
            {
                // druga funkcja
            }
            if (i%3==2)
            {
                //trzecia funkcja
            }
        }

        return tab[tab.length - 1];
    }
}

