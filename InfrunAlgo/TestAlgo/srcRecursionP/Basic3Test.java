package srcRecursionP;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 2..
 */
public class Basic3Test{
    Basic3 basic = new Basic3();
    int[] data = new int[]{
            3,4,5,6,7,8,9
    };

    @Test
    public void searchIterator() throws Exception {
        assertEquals(2, basic.searchIterator(data, data.length, 5));
    }

    @Test
    public void searchRecursion() throws Exception {
        assertEquals(2, basic.searchRecursion(data, 0, data.length, 5));
    }

    @Test
    public void searchRecursionVersion2() throws Exception {
        assertEquals(2, basic.searchRecursionV2(data, 0, data.length, 5));
    }

    @Test
    public void searchRecursionVersion3() throws Exception {
        assertEquals(2, basic.searchRecursionV3(data, 0, data.length, 5));
    }

    @Test
    public void findMax() throws Exception {
//        assertEquals(9, basic.findMax(data, 0, data.length));
    }
}