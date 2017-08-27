package lesson8;

import sun.jvm.hotspot.oops.OopUtilities;

import java.util.Stack;

/**
 * Created by masinogns on 2017. 8. 27..
 *
 * Find the index S
 */
public class EquiLeader {
    public int solution(int[] A) {
        /**
         *
         * 사이즐 높여가면서 어떤 것이 리더 값인지 판별한다
         */
        int n = A.length;
        int size = 0, findLeader = 0, storeLeader = 0;

        for (int i = 0; i < n; i++){
            if (size==0){
                size+=1;
                findLeader = A[i];
            }else {
                if (findLeader!=A[i])
                    size-=1;
                else
                    size+=1;
            }
        }

        // 그래서 찾은 리더 값은 다음 storeLeader에 저장이 된다
        if (size>0)
            storeLeader = findLeader;

        // leader 값의 총 갯수를 저장하는 로직
        int leaderSize = 0;
        for (int i : A){
            if (storeLeader == i)
                leaderSize+=1;
        }

        /**
         * 왼쪽 배열의 사이즈와 오른쪽 배열의 사이즈를 증가,감소해가면서 비교
         *
         * 만약 리더 값과 같다면 {
         *      왼쪽 리더 사이즈 + 1
         *      총 리더 사이즈 - 1
         *
         *      왼쪽 배열 사이즈 + 1
         *      총 배열 사이즈 - 1
         *
         *      만약 왼쪽 리더 사이즈가 왼쪽 배열의 n/2보다 크고 && 오른쪽 리더 사이즈도 오른쪽 배열의 n/2보다 크다면
         *      서로 리더에 만족하는 것이므로
         *      목표 카운트 + 1을 해준다 ( equileader + 1)
         * }
         *
         * 우리의 목표는 몇개의 equi leader인가이기 때문이다
         */
        int leftSize = 0, rightSize = A.length, leftLeaderSize = 0;
        int ret = 0;

        for (int i : A){
            if (storeLeader == i){
                leftLeaderSize+=1;
                leaderSize-=1;

                leftSize+=1;
                rightSize-=1;

                if (leftLeaderSize > leftSize/2 && leaderSize > rightSize/2){
                    ret+=1;
                }

            }else {
                leftSize+=1;
                rightSize-=1;

                if (leftLeaderSize > leftSize/2 && leaderSize > rightSize/2){
                    ret+=1;
                }
            }
        }

        return ret;
    }
}
