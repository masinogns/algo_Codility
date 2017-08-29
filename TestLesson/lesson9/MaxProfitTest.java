package lesson9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 29..
 */
public class MaxProfitTest {
    MaxProfit application;

    int[] profit = new int[]{
            23171,21011, 21123, 21366,21013, 21367
    };

    @Before
    public void setUp() throws Exception {
        application = new MaxProfit();
    }

    @Test
    public void test(){
        assertEquals(356, application.solution(profit));
    }
}