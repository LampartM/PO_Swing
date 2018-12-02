/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolo_aids;

import java.util.Random;

/**
 *
 * @author Maciek
 */
public class FiguraDyn {
    public static void main(String[] args) { 
        figura();
    }
    
    static void figura(){
        Random rand = new Random();
        float[] tabX = new float[100];
        float[] tabY = new float[100];
        float nalezace = 0;
        int i=0;
        for (i=0 ; i<100; i++){
            tabX[i]=rand.nextFloat();
            tabY[i]=rand.nextFloat();
            if( tabX[i]*tabX[i] <= tabY[i] ){
                nalezace++;
            }
        }
        System.out.println("Pole figury = "+(nalezace/i) );
    }  
}
