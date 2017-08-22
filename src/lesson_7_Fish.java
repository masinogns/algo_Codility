import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 8. 20..
 *
 * 1. eater 배열 만들기
 * if ( B[P] = 1 ){     // fish P가 하류로 흐를 때
 *     eater <- A[P]    // fish P를 eater로 정의한다
 *     A[P].remove()    // fish P를 A배열에서 삭제한다
 *                      // A[P]에 남은 물고기들은 eater와 싸우게된다
 * }
 *
 * 2. food chain 만들기
 * if ( eater가 존재하면 ){
 *     if(eater > A[index]){    // eater가 더 큰 물고기라면
 *         A[index].remove()    //eater가 A[index]를 먹는다
 *     }else{
 *         eater.remove()       // A[index]가 eater를 먹는다
 *         eaterIndex[++]       // eaterIndex를 증가시킨다
 *     }
 * }
 *
 * else{
 *     // eater가 존재하지 않는다면
 *     // 서로 마주칠 수 있는 물고기는 존재하지 않으므로
 *     // 살아있는 물고기 수를 return한다
 * }
 */
public class lesson_7_Fish {
    private int[] fishSize;
    private int[] fishFlowDirection;

    public void setFishSize(int[] fishSize) {
        this.fishSize = fishSize;
    }

    public void setFishFlowDirection(int[] fishFlowDirection) {
        this.fishFlowDirection = fishFlowDirection;
    }

    public int[] getFishSize() {
        return fishSize;
    }

    public int[] getFishFlowDirection() {
        return fishFlowDirection;
    }

    public int howManyAliveFishes(int[] A, int[] B){
        // 출처 .. http://hangaebal.tistory.com/115
        int N = A.length;
        int alive = N;
        Stack<Integer> downFishStack = new Stack<>();

        for (int i = 0; i < N; i++) {
            if (B[i] == 0) {			// up
                if ( !downFishStack.empty()) {
                    while ( !downFishStack.empty()) {
                        alive--;
                        if (downFishStack.peek() > A[i]) {
                            break;
                        } else {
                            downFishStack.pop();
                        }
                    }
                }
            } else {			// down
                downFishStack.push(A[i]);
            }
        }
        return alive;
    }

    // 다시 풀어보길 바람.
    public int solution(int[] A, int[] B){
        return 0;
    }
}
