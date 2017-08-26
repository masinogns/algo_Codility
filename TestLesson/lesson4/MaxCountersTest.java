package lesson4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 26..
 */
public class MaxCountersTest {
    @Test
    public void test(){
        MaxCounters application = new MaxCounters();

        int[] A ={3,4,4,6,1,4,4};
        int[] Aresult = {3,2,2,4,2};
        ArrayList<Integer> arrayListResult = new ArrayList<>(Arrays.asList(3,2,2,4,2));

        application.solution(5, A);
        assertEquals(arrayListResult, application.getResult());

    }

}