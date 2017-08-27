package lesson8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 27..
 */
public class EquiLeaderTest {
    EquiLeader application;

    @Before
    public void setUp() throws Exception {
        application = new EquiLeader();

    }


    @Test
    public void test(){
        assertEquals(2, application.solution(new int[]{4, 3, 4, 4, 4, 2}));
        assertEquals(3, application.solution(new int[]{4, 4, 2, 5, 3, 4, 4, 4}));

    }

}