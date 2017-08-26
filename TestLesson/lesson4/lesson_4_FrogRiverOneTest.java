package lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 26..
 */
public class lesson_4_FrogRiverOneTest {
    @Test
    public void test(){
        int[] A = {1,3,1,4,2,3,5,4};
        int[] B = {2,2,2,2,2,2};
        int[] C ={1, 2, 3, 5, 3, 1};
        lesson_4_FrogRiverOne application = new lesson_4_FrogRiverOne();

        assertEquals(6, application.solution(5, A));
        assertEquals(-1, application.solution(6, A));
        assertEquals(-1, application.solution(2, B));
        assertEquals(-1, application.solution(5, C));
    }

}