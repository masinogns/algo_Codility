package srcRecursionP;

/**
 * Created by masinogns on 2017. 9. 2..
 *
 * 아이디어 설명
 * 1. Binary image
 * 2. 각 픽셀은 background pixel or image pixel
 * 3. 서로 연결된 image pixel들의 집합을 blob이라고 부른다
 * 4. 상하좌우 및 대각방향으로도 연결된 것으로 간주한다..!!
 *
 * 입력 {
 *     n*n 크기의 2차원 그리드
 *     하나의 좌표 x,y
 * }
 * 출력 {
 *     픽셀 x,y가 포함된 blob의 크기
 *     x,y가 어떤  blob에도 속하지 않는 경우에는 0
 * }
 *
 * 현재 픽셀이 속한 blob의 크기를 카운트하려면
 *  현재 픽셀이 image color가 아니라면
 *      0을 반환한다
 *  현재 픽셀이 image color라면
 *      먼저 현재 픽셀을 카운트한다 (count = 1)
 *      현재 픽셀이 중복 카운트되는 것을 방지하기 위해 다른 색으로 칠한다 (이미 카운트되었음을 표시한다)
 *      현재 픽셀에 이웃한 모든 픽셀에 대해서 (8개의 픽셀, 상하좌우, 대각선방향)
 *          그 픽셀이 속한 blob의 크기를 카운트하여 카운터에 더해준다
 *      카운터를 반환한다
 */
public class _CountingCellsInABlob {
    private static int N = 8;
    private static int[][] grid = {

    };

    private static int BACKGROUND_COLOR = 0;
    private static int IMAGE_COLOR = 1;
    private static int ALREADY_COUNTED = 2;

    public int countCells(int x, int y){
        int result;

        if (x<0||x>=N||y<0||y>=N)
            return 0;
        else if (grid[x][y] != IMAGE_COLOR)
            return 0;
        else {
            grid[x][y] = ALREADY_COUNTED;
            return 1+countCells(x-1,y+1) + countCells(x, y+1)
                    + countCells(x+1,y+1) + countCells(x-1, y)
                    + countCells(x+1, y) + countCells(x-1, y-1)
                    + countCells(x, y-1) + countCells(x+1, y-1);
        }
    }

}
