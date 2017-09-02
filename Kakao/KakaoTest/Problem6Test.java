import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 30..
 */
public class Problem6Test {
    Problem6 application;

    @Before
    public void setUp() throws Exception {
        application = new Problem6();
    }

    @Test
    public void test(){
        assertEquals(36, application.solution(new int[]{14,6,5,11,3,9,2,10}));
    }
    @Test
    public void test2(){
        assertEquals(8, application.solution(new int[]{1,3,2,5,4}));
    }
}