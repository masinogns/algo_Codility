package lesson4;

import java.util.Arrays;

/**
 * Created by masinogns on 2017. 5. 28..
 * 정수 N개로 구성된 비어있지 않은 배열 A가 주어진다.
 * permutation이란 1부터 N까지 각 요소를 단 한 번만 포함하는 숫자들이다.

 * 출처: http://hangaebal.tistory.com/97 [개발]
 *
 * Hashmap으로 Key값은 수로하고 Value값은 counting을 한다
 */
public class lesson_4_PermCheck {
    public int solution(int[] A) {

        boolean[] seen = new boolean[A.length];

        for (int i : A){
            if (i<1 || i>A.length)return 0;
            else if (seen[i-1])return 0;

            seen[i-1] = true;
        }

        Arrays.sort(A);

        for (int i = 1; i < A.length; i++){
            if (A[i]-A[i-1] != 1)return 0;
        }

        return 1;
    }
}
