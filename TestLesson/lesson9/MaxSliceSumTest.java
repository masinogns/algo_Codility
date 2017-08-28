package lesson9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 28..
 */
public class MaxSliceSumTest {
    MaxSliceSum application;

    @Before
    public void setUp() throws Exception {
        application = new MaxSliceSum();
    }

    @Test
    public void test(){
        assertEquals(5, application.maxSliceSum(new int[]{3,2,-6,4,0}));
    }

    @Test
    public void test2(){
        assertEquals(-10, application.maxSliceSum(new int[]{-10}));
    }

    @Test
    public void test3(){
        assertEquals(1, application.maxSliceSum(new int[]{-2,1}));
    }

    @Test
    public void test4(){
        assertEquals(3, application.maxSliceSum(new int[]{1,-2,3}));
    }

}