import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 30..
 */
public class Problem2Test {
    Problem2 application;

    @Before
    public void setUp() throws Exception {
        application = new Problem2();
    }

    @Test
    public void test1(){
        assertEquals(true, application.solution(new int[]{4,1,3,2}));
    }

    @Test
    public void test(){
        assertEquals(false, application.solution(new int[]{4,1,3}));
    }
}