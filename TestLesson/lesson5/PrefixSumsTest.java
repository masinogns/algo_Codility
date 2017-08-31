package lesson5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 26..
 *
 * Prefix sum 수열의 구간 합 구하기
 */
public class PrefixSumsTest {
    _PrefixSums application;

    int[] A = new int[]{2,3,5,4,1,3};
    @Before
    public void setUp() throws Exception {
        application = new _PrefixSums();
    }

    @Test
    public void test2(){
        assertEquals(12, application.countTotal(application.prefixSum(A), 1, 3));
    }

}