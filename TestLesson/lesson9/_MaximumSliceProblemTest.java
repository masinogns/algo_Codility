package lesson9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 28..
 */
public class _MaximumSliceProblemTest {
    _MaximumSliceProblem application;

    int[] A = new int[]{5,-7,3,5-2,4,-1};

    @Before
    public void setUp() throws Exception {
        application = new _MaximumSliceProblem();
    }

    @Test   // O(n^3)
    public void slowTest(){
        assertEquals(10, application.slowMaxSlice(A));
    }

    @Test   // O(n^2)
    public void quadraTest(){
        assertEquals(10, application.quadraticMaxSlice(A));
    }

    @Test   // O(n)
    public void goldenMaxSlice(){
        assertEquals(10, application.goldenMaxSlice(A));
    }

}