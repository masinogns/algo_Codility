import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 30..
 */
public class Problem1Test {
    Problem1 application;

    @Before
    public void setUp() throws Exception {
        application = new Problem1();
    }

    @Test
    public void test(){
        assertEquals(6, application.solution(123));
    }

    @Test
    public void test2(){
        assertEquals(24, application.solution(987));
    }
}