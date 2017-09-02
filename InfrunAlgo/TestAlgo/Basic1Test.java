import org.junit.Before;
import org.junit.Test;
import srcRecursionP.Basic1;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 1..
 */
public class Basic1Test {
    Basic1 basic1;
    @Before
    public void setUp() throws Exception {
         basic1 = new Basic1();
    }

    @Test
    public void inifiniteLoop(){
        basic1.infiniteLoop();
    }

    @Test
    public void recursionLoop() throws Exception {
        basic1.recursionLoop(4);
    }

    @Test
    public void recursiveSum() throws Exception {
        assertEquals(55, basic1.recursiveSum(10));
        assertEquals(10, basic1.recursiveSum(4));
    }

    @Test
    public void recursiveFactorial() throws Exception {
        assertEquals(6, basic1.recursiveFactorial(3));
    }

    @Test
    public void recursiveX() throws Exception {
        assertEquals(9, basic1.recursiveX(3, 2));
    }

    @Test
    public void recursiveFibo() throws Exception {
        assertEquals(3, basic1.recursiveFibo(4));
    }

    @Test
    public void recursiveEuclid() throws Exception {
        assertEquals(10, basic1.recursiveEuclid(10, 10));
    }
}