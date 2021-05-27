/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import java.util.Arrays;
import java.util.List;
import knu.fit.ist.ta.lab6.Regression;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Ольга
 */
public class Lab6Tests {
     @Test
     void RegressionTest(){
     Regression regr = new  Regression(9);
     List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
     regr.setArray(arr);
     
     assertEquals(regr.lessThanX( 3), 2);
     assertEquals(regr.lessThanX( 4), 3);
     
     assertEquals(regr.lessThanXTail( 3), 2);
      assertEquals(regr.lessThanXTail( 4), 3);
     
     
     }
}
