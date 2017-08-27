package lesson8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by masinogns on 2017. 8. 28..
 */
public class DominatorTest {
    Dominator application;

    @Before
    public void setUp() throws Exception {
        application = new Dominator();
    }

    @Test
    public void test(){
        assertEquals(6, application.solution(new int[]{3,4,3,2,3,-1,3,3}));
    }

}