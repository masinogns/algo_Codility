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

        if (size>0)
            storeLeader = findLeader;

        int leaderSize = 0;
        for (int i : A){
            if (storeLeader == i)
                leaderSize+=1;
        }

        /**
         * 왼쪽 배열의 사이즈와 오른쪽 배열의 사이즈를 증가,감소해가면서 비교
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
