import org.junit.Test;
import srcRecursionP._Maze;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 2..
 */
public class _MazeTest {
    @Test
    public void maze() throws Exception {
        assertEquals(true, _Maze.findMazePath(0,0));
    }
}