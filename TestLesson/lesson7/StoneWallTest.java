package lesson7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 25..
 */
public class StoneWallTest {

    @Test
    public void test(){
        StoneWall application = new StoneWall();


        int[] H = {8,8,5,7,9,8,7,4,8};
        assertEquals(7, application.solution(H));
    }

}