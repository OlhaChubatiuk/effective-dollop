/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.llab2;

/**
 *
 * @author Ольга
 */
public class Calculate {
    public static float lab2(float x){
        float a = 6; float  b = 5; float c = -8; float  d = 10;
        if (a*x*x + b*x + c == 0) {return Integer.MAX_VALUE;}
        return (float) (Math.sqrt(d*x) / (a*x*x + b*x + c));
        
    }
}
