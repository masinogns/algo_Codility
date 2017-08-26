package lesson4;

import java.util.Arrays;

/**
 * Created by masinogns on 2017. 5. 28..
 */
public class lesson_4_PermCheck {
    public int solution(int[] A) {
        int ret = 1;

        Arrays.sort(A);

        for (int i = 1; i < A.length; i ++){
            if (A[i] - A[i-1] != 1){
                ret = 0;
                break;
            }
        }
        return ret;
    }
}
