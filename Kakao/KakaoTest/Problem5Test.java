import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 30..
 */
public class Problem5Test {
    Problem5 application;

    @Before
    public void setUp() throws Exception {
        application = new Problem5();

    }

    @Test
    public void test(){
        assertEquals(16, application.solution(new int[][]
                {
                        {1,2,3,5},
                        {5,6,7,8},
                        {4,3,2,1}
                }
                ));
    }

    @Test
    public void test2(){
        assertEquals(19, application.solution(new int[][]
                {
                        {4,4,5,7},
                        {1,2,3,8},
                        {5,5,5,9}
                }
        ));
    }

    @Test
    public void test3(){
        assertEquals(24, application.solution(new int[][]
                {
                        {7,6,5,4},
                        {10,3,9,4},
                        {8,7,4,3}
                }
        ));
    }
}