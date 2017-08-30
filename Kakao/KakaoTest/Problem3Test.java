import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 30..
 */
public class Problem3Test {
    Problem3 application;

    @Before
    public void setUp() throws Exception {
        application = new Problem3();
    }

    // JUNIT에서 int[] 테스트하는 방법
    @Test
    public void test(){
//        assertEquals(new int[]{1,1}, application.solution(
//                new int[][]{
//                        {1,4},
//                        {3,4},
//                        {3,1}
//                }));

        int[] a = application.solution(new int[][]{
                {1,4},
                {3,4},
                {3,1}
        });

        System.out.println(a[0]+" : "+a[1]);
    }

    @Test
    public void test2(){
        assertEquals(new int[]{2,1}, application.solution(
                new int[][]{{1,1},{2,2},{1,2}}));
    }
}