package lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 26..
 */
public class lesson_4_PermCheckTest {

    @Test
    public void test(){
        lesson_4_PermCheck controller = new lesson_4_PermCheck();
        int[] A = {4,1,3};
        int[] B = {4,1,3,2};
        assertEquals(0, controller.solution(A));
        assertEquals(1, controller.solution(B));
    }

}