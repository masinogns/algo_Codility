package lesson7;
/**
 * Created by masinogns on 2017. 8. 20..
 * 첫번째 방법 실패 !!
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
 *
 * 출처 .. http://hangaebal.tistory.com/115 참고
 *
 */

import java.util.Stack;

/**
 * 두번째 방법
 *
 * B[P] = 1 ; 하류로 흐르는 물고기들을 반대로 흐르는 방향의 물고기들과
 * 비교를 하기 위해서 스택에 저장한다
 *
 * 스택에 저장할 때에는 인덱스와 밸류 값을 저장한다
 * 왜냐하면? 한 물고기를 비교할 때 인덱스 + 1 한 값부터 비교를 하기 위해서 그렇다
 *
 * 만약에 eater 물고기가 비교하는 물고기보다 더 작다면
 * eater가 죽는다
 *
 * 죽는 물고기의 표시를 어떻게 할지가 이 문제의 핵심인 듯 싶은데
 * boolean 배열로 살아남은 것을 체크하는 것은 어떠할까?
 *
 * 또 다른 문제. 모든 물고기가 eater라면?
 *
 *
 */


public class lesson_7_Fish {

    public int solution(int[] A, int[] B){

        Stack<Integer> stack = new Stack<>();

        int aliveFish = 0;

        for (int i = 0; i < B.length; i++){
            if (B[i]==0){
                if (stack.isEmpty()) {
                    aliveFish++;
                }
                else {
                    while (!stack.isEmpty()){
                        if (stack.peek() > A[i]){
                            break;
                        }else {
                            stack.pop();

                            if (stack.isEmpty()){
                                aliveFish++;
                            }
                        }
                    }
                }
            }else {
                stack.push(A[i]);
            }
        }

        aliveFish += stack.size();

        return aliveFish;
    }
}
