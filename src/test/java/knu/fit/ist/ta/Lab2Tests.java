package knu.fit.ist.ta;

import knu.fit.ist.ta.llab2.Calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab2Tests {

    @Test
    void contextLoads() {

    }

    @Test
    void test1() {
        assertEquals(Calculate.lab2(1.0f), 1.05f, 0.01f);
        assertEquals(Calculate.lab2(2.0f), 0.17f, 0.01f);
        assertEquals(Calculate.lab2(3.0f), 0.09f, 0.01f);
        assertEquals(Calculate.lab2(4.0f), 0.06f, 0.01f);
        assertEquals(Calculate.lab2(5.0f), 0.04f, 0.01f);
        assertEquals(Calculate.lab2(6.0f), 0.03f, 0.01f);
        assertEquals(Calculate.lab2(7.0f), 0.03f, 0.01f);
        assertEquals(Calculate.lab2(8.0f), 0.02f, 0.01f);
        assertEquals(Calculate.lab2(9.0f), 0.02f, 0.01f);
        
    }
    @Test
    void test2(){
    assertEquals(Calculate.lab2(10.0f), 0.02f, 0.01f);
    assertEquals(Calculate.lab2(11.0f), 0.01f, 0.01f);
    assertEquals(Calculate.lab2(12.0f), 0.01f, 0.01f);
    }
    
}
