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
import java.util.Random;

public class PoleMonteCarlo {

    static double punktyWPolu = 0;
    static double punktyWszystkie = 0;

    public static void main(String[] args) {
        pole();
    }

    static void pole() {
        double x = 0, y = 0;
        for (int i = 0; i < 101; i++) {
            punktyWszystkie++;
            Random losuj = new Random(1);
            System.out.println(i + ".");
            x = losuj.nextDouble();
            System.out.println("x: " + x);
            y = losuj.nextDouble();
            System.out.println("y: " + y);
            if (x * x == y && x * x > y) {
                punktyWPolu++;
            }
        }
        
        double pole = punktyWPolu / punktyWszystkie;
        System.out.println("Punkty w polu: " + punktyWPolu);
        System.out.println("Pole wynosi: " + pole);

    }
}