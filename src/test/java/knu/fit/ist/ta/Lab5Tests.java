/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import knu.fit.ist.ta.lab4.TaskForLab4;
import knu.fit.ist.ta.lab5.LinearSearch;
import knu.fit.ist.ta.lab5.sortApproach2_binarySearch;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Ольга
 */
public class Lab5Tests {
        @Test
    void TestForLaba5() {

        LinearSearch LS = new LinearSearch();
        sortApproach2_binarySearch sA2_bS = new sortApproach2_binarySearch(5);
        TaskForLab4 tfl4 = new TaskForLab4();

        String text = "test checks lab five job testing theory algorithms java";
      

        assertEquals("position = " + 0, LS.Task1("test", -1, -1, tfl4.getList(text)));
        assertEquals("position = " + 3, LS.Task1("five", -1, -1, tfl4.getList(text)));
        assertEquals("position = " + 8, LS.Task1("java", -1, -1, tfl4.getList(text)));

        assertEquals("-1", LS.Task1("theory", -1, 3, tfl4.getList(text)));
        assertEquals("-1", LS.Task1("java", 1, 2, tfl4.getList(text)));

        String text2 = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

        assertEquals("position = " + 10, LS.Task1("k", 7, 13, tfl4.getList(text2)));
        assertEquals("-1", LS.Task1("k", 12, 13, tfl4.getList(text2)));
        assertEquals("position = " + 23, LS.Task1("x", 15, -1, tfl4.getList(text2)));
        assertEquals("-1", LS.Task1("k", 24, 25, tfl4.getList(text2)));
    }
    
    
    @Test
    void TestForLaba52() {
        LinearSearch LS = new LinearSearch();
        sortApproach2_binarySearch sA2_bS = new sortApproach2_binarySearch(5);
        TaskForLab4 tfl4 = new TaskForLab4();

        String textt = "its tests laboratory work theory algorithms checking";
        assertEquals("position = " + 0, LS.Task1("its", -1, -1, tfl4.getList(textt)));
        assertEquals("position = " + 3, LS.Task1("work", -1, -1, tfl4.getList(textt)));
        assertEquals("position = " + 6, LS.Task1("checking", -1, -1, tfl4.getList(textt)));

    }

}
