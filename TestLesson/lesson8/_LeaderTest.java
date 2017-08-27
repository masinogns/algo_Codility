package lesson8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 27..
 */
public class _LeaderTest {
    _Leader application = new _Leader();

    ArrayList<Integer> arrayList = new ArrayList<>(
            Arrays.asList(6, 8, 4, 6, 8, 6, 6));

    @Test
    public void slowTest(){
        assertEquals(6, application.slowLeader(arrayList));
    }


    @Test
    public void fasterTest(){
        assertEquals(6, application.fastLeader(arrayList));
    }

    @Test
    public void leader(){
        assertEquals(6, application.leader(arrayList));
    }
}