/**
 * Created by masinogns on 2017. 8. 30..
 *
 * 땅따먹기 게임을 하려고 합니다. 땅따먹기 게임의 땅(land)은 총 N행 4열로 이루어져 있고,
 * 모든 칸에는 점수가 쓰여 있습니다. 1행부터 땅을 밟으며 한 행씩 내려올 때,
 * 각 행의 4칸 중 한 칸만 밟으면서 내려와야 합니다.
 * 단, 땅따먹기 게임에는 한 행씩 내려올 때, 같은 열을 연속해서 밟을 수 없는 특수 규칙이 있습니다.

 예를 들면,

 | 1 | 2 | 3 | 5 |
 | 5 | 6 | 7 | 8 |
 | 4 | 3 | 2 | 1 |

 로 땅이 주어졌다면, 1행에서 네번째 칸 (5)를 밟았으면, 2행의 네번째 칸 (8)은 밟을 수 없습니다.

 마지막 행까지 모두 내려왔을 때, 얻을 수 있는 점수의 최대값을 return하는 solution 함수를 완성해 주세요.
 위 예의 경우, 1행의 네번째 칸 (5), 2행의 세번째 칸 (7), 3행의 첫번째 칸 (4) 땅을 밟아
 16점이 최고점이 되므로 16을 return 하면 됩니다.

 D[N][4] = N행 i열일 때의 최고 값
 */
public class Problem5 {

    public int solution(int[][] land) {
        int answer = 0;

        int size = land.length;
        int[][] D = new int[size+1][5];

        D[1][1] = land[0][0];
        D[1][2] = land[0][1];
        D[1][3] = land[0][2];
        D[1][4] = land[0][3];

        for (int i = 2; i <= size; i++){
            D[i][1] = Math.max(Math.max(D[i-1][2],D[i-1][3]),D[i-1][4])+land[i-1][0];
            D[i][2] = Math.max(Math.max(D[i-1][1],D[i-1][3]),D[i-1][4])+land[i-1][1];
            D[i][3] = Math.max(Math.max(D[i-1][1],D[i-1][2]),D[i-1][4])+land[i-1][2];
            D[i][4] = Math.max(Math.max(D[i-1][1],D[i-1][2]),D[i-1][3])+land[i-1][3];
        }

        answer = Math.max(Math.max(Math.max(D[size][1],D[size][2]),D[size][3]),D[size][4]);
        return answer;
    }
}
