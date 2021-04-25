/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.util.Random;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ольга
 */
@Service
public class lab3Task1 {

    Random rand = new Random();

    public static int[] task(int arrayLeng) {

        
        int[] intArray = new int[arrayLeng];

        for (int j = 0; j < arrayLeng; j++) {
            intArray[j] = (int) (Math.random() * (100 - 10) + 10);

        }
        return intArray;
    }

    public static String output(int[] intArray) {
        String result = "{";

        for (int i : intArray) {
            result += i + ", ";
        }
        result = result.substring(0, result.length() - 2);
        result += "}";
        return result;
    }

    public static int[] prod(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sum(intArray[i]);
        }
        return intArray;
    }

    public static int sum(int n) {
        int rez = 0;
        while (n > 0) {
            rez += Math.pow(n % 10, 2);
            n /= 10;
        }
        return rez;
    }

}

/*        public static int[] prod(int[] intArray) {
    int[] newresult = new int[intArray.length];
    
    for (int i = 0; i < intArray.length; i++) {
    newresult[i] =  sum(intArray[i]);
    }
    return newresult;
    }*/
