package lesson5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 30..

 */
public class GenomicRangeQueryTest {
    GenomicRangeQuery application;

    @Before
    public void setUp() throws Exception {
        application = new GenomicRangeQuery();
    }

    @Test
    public void test1() throws Exception {
        int[] result = new int[]{2,4,1};

        String s = "CAGCCTA";
        int[] P = new int[]{2,5,0};
        int[] Q = new int[]{4,5,6};
        assertArrayEquals(result, application.solution(s, P, Q));
    }

    @Test
    public void test() throws Exception {
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
    }
}