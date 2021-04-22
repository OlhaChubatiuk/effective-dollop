package knu.fit.ist.ta;

import java.util.Arrays;
import knu.fit.ist.ta.lab3.lab3Task1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaApplication.class, args);
        /*                        lab3Task1 t = new lab3Task1();
        int arlng = 20;
        int[] x = t.task(arlng);
        System.out.println(Arrays.toString(t.task(arlng)));
        System.out.println(Arrays.toString(t.prod(x, arlng)));*/
    }

}
