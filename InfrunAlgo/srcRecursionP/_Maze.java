package srcRecursionP;

/**
 * Created by masinogns on 2017. 9. 2..
 *
 * 아이디어 설명
 *
 * 그리드의 크기 n*n
 * 입구는 (0 , 0), 출구는 (n-1 , n-1)
 *
 * 현재 위치에서 출구까지 가는 경로가 있으려면
 * 1. 현재 위치가 출구이거나 혹은
 * 2. 이웃한 셀들 중 하나에서 현재 위치를 지나지 않고 출구까지 가는 경로가 있거나
 *
 * recursion을 만들 때 무한루프에 빠지지 않는지 생각해주어야한다 !!!
 *
 * boolean findPath(x,y)
 *  if(x,y) is the exit
 *      return true;
 *  else
 *      mark(x,y) as a visited cell;
 *      for each neighbouring cell(x`,y`) of (x,y) do
 *          if findPath(x`,y`)
 *              return true;
 *      return false
 */


public class _Maze {
    private static int N = 8;
    private static int[][] maze = {
            {0,0,0,0,0,0,0,1},
            {0,1,1,0,1,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,0,0,1,1,0,0},
            {0,1,1,1,0,0,1,1},
            {0,1,0,0,0,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,1,1,0,1,0,0}
    };

    private static final int PATHWAY_COLOR = 0; // 지날 수 있는 통로
    private static final int WALL_COLOR = 1;    // 지날 수 없는 벽
    private static final int BLOCKED_COLOR = 2; // visited이며 출구까지의 경로 상에 있지 않음이 밝혀진 cell
    private static final int PATH_COLOR = 3;    // visited이며 아직 출구로 가는 경로가 될 가능성이 있는 cell

    public static boolean findMazePath(int x, int y){
        // x,y 좌표가 유효한 좌표인가
        if (x<0||y<0||x>=N||y>=N)
            return false;
        else if (maze[x][y] != PATHWAY_COLOR)
            return false;
        else if (x==N-1 && y==N-1){
            maze[x][y] = PATH_COLOR;
            return true;
        }else {
            maze[x][y] = PATH_COLOR;
            if (findMazePath(x-1,y)||findMazePath(x,y+1)||findMazePath(x+1,y)||findMazePath(x,y-1))
                return true;

            maze[x][y] = BLOCKED_COLOR; // dead end
            return false;
        }
    }

    public static void main(String[] args) {
        findMazePath(0,0);
    }


}
