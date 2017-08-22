import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 20..
 */
public class lesson_7_FishTest {

    @Test
    public void test(){
        lesson_7_Fish application = new lesson_7_Fish();

        int[] fishSize = {4,3,2,1,5};
        int[] fishFlowDirection = {0,1,0,0,0};

        application.setFishSize(fishSize);
        application.setFishFlowDirection(fishFlowDirection);

        int howManyAliveFishes = application.howManyAliveFishes(
                application.getFishSize(),
                application.getFishFlowDirection()
        );

        assertEquals(2, howManyAliveFishes);

        int[] a = { 4, 3, 2, 1, 5 };
        int[] b = { 0, 1, 0, 0, 0 };
        assertEquals(2, application.howManyAliveFishes(a,b));

        a = new int[] { 4, 3, 2, 1, 5 };
        b = new int[] { 0, 1, 0, 1, 0 };
        assertEquals(2, application.howManyAliveFishes(a,b));

        a = new int[] { 4, 3, 2, 1, 5 };
        b = new int[] { 0, 0, 0, 0, 0 };
        assertEquals(5, application.howManyAliveFishes(a,b));

        a = new int[] { 4, 3, 2, 1, 5 };
        b = new int[] { 1, 1, 1, 1, 1 };
        assertEquals(5, application.howManyAliveFishes(a,b));

        a = new int[] { 4, 3, 2, 1, 5 };
        b = new int[] { 0, 0, 0, 1, 1 };
        assertEquals(5, application.howManyAliveFishes(a,b));

        a = new int[] { 5, 3, 2, 1, 4 };
        b = new int[] { 1, 0, 0, 0, 0 };
        assertEquals(1, application.howManyAliveFishes(a,b));

        a = new int[] { 1, 2, 3, 4, 5 };
        b = new int[] { 1, 1, 1, 1, 0 };
        assertEquals(1, application.howManyAliveFishes(a,b));
    }

    @Test
    public void test2(){
        lesson_7_Fish application = new lesson_7_Fish();

        int[] a = new int[] { 4, 3, 2, 1, 5 };
        int[] b = new int[] { 1, 1, 1, 1, 1 };

        assertEquals(5, application.howManyAliveFishes(a,b));

    }
}