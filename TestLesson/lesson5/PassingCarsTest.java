package lesson5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 26..
 */
public class PassingCarsTest {
    PassingCars application = new PassingCars();

    int[] A = {0,1,0,1,1};


    @Test
    public void test(){
        assertEquals(5, application.solution(A));
    }

    @Test
    public void test2(){
        assertEquals(5, application.solution2(A));
    }

}