package lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 26..
 */
public class _MissingintegerTest {
    @Test
    public void test(){
        Missinginteger controller = new Missinginteger();
        int[] A = {1,3,6,4,1,2};
        int[] B = {-1,-2,-3};
        int[] C = {1,2,3};

        assertEquals(5, controller.solution(A));
        assertEquals(1, controller.solution(B));
        assertEquals(4, controller.solution(C));
    }

}