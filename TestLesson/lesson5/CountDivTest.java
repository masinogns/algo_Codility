package lesson5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 26..
 */
public class CountDivTest {
    @Test
    public void test(){
        CountDiv application = new CountDiv();

        assertEquals(3, application.solution(6,11,2));
        assertEquals(3, application.solution2(6,11,2));
        assertEquals(1, application.solution(1,3,2));
        assertEquals(1, application.solution2(1,3,2));
    }

}