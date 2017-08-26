package lesson5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 26..
 */
public class PassingCarsTest {
    @Test
    public void test(){
        PassingCars application = new PassingCars();

        int[] A = {0,1,0,1,1};

        assertEquals(5, application.solution(A));
        assertEquals(5, application.solution2(A));

    }

}