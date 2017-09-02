import org.junit.Before;
import org.junit.Test;
import srcRecursionP.Basic2;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 2..
 *

 */
public class Basic2Test {
    Basic2 basic;

    @Before
    public void setUp() throws Exception {
        basic = new Basic2();
    }

    @Test
    public void stringLength() throws Exception {
        assertEquals(6, basic.length("rlgns!"));
    }

    @Test
    public void printChar() throws Exception {
        basic.printChar("Superman");
    }

    @Test
    public void printCharReverse() throws Exception {
        basic.printCharsRevers("Superman");
    }


}