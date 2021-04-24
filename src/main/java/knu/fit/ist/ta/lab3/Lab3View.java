/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import org.springframework.stereotype.Service;

/**
 *
 * @author Ольга
 */
@Service
public class Lab3View {
    
  private int [] startArray;

    public String showStartArray(String arrayLengString) {

        if (arrayLengString.equals("")) {
            return "Please enter the length of massiv";
        }
        int arrayLeng = Integer.parseInt(arrayLengString);

        if (arrayLeng < 0) {
            return "Wrong length";
        } else if (1 < 1) {
            return "";
        } else {
            startArray = lab3Task1.task(arrayLeng);
            return (lab3Task1.output(startArray));

        }
    }

    
    public String showResult() {

        

        return (lab3Task1.output(lab3Task1.prod(startArray)));

    }

}
