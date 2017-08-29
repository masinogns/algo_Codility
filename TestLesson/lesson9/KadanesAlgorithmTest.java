package lesson9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 28..
 */
public class KadanesAlgorithmTest {
    KadanesAlgorithm application;

    @Before
    public void setUp() throws Exception {
        application = new KadanesAlgorithm();
    }

    @Test
    public void test(){
        assertEquals(6, application.solution(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }


}