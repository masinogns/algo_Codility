import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 20..
 */
public class lesson7_BracketTest {
    lesson_7_Bracket application = new lesson_7_Bracket();
    String[] A = new String[10];
    String[] B = new String[10];

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

    @Test
    public void test2(){
        B[0] = "[]";
        B[1] = "{}[]{}";
        B[2] = "()(";
        B[3] = "{}[()]";
        B[4] = "([{}])";
        B[5] = "}])";

        assertEquals(1, application.solution(B[0]));
        assertEquals(1, application.solution(B[1]));
        assertEquals(0, application.solution(B[2]));
        assertEquals(1, application.solution(B[3]));
        assertEquals(1, application.solution(B[4]));
        assertEquals(0, application.solution(B[5]));

    }
}