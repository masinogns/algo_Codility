package lesson7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 26..
 */
public class NestingTest {
    Nesting application = new Nesting();
    String[] A = new String[10];

    @Test
    public void test1(){

        A[0] = "()";
        A[1] = "(())";
        A[2] = "(()";
        A[3] = "((((((())";
        A[4] = "))))))((((";
        A[5] = "()()()";
        A[6] = ")()()(";

        assertEquals(1, application.solution(A[0]));
        assertEquals(1, application.solution(A[1]));
        assertEquals(0, application.solution(A[2]));
        assertEquals(0, application.solution(A[3]));
        assertEquals(0, application.solution(A[4]));
        assertEquals(1, application.solution(A[5]));
        assertEquals(0, application.solution(A[6]));
    }

}