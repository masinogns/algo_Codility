package lesson4;

/**
 * Created by masinogns on 2017. 5. 28..
 *
 * X는 location
 * A[K] k초에 떨어지는 잎의 위치 = location
 *
 * 제일 먼저 떨어지는 X를 배열에서 찾아서 그 K초를 찾아내는게 목표
 *
 */
public class lesson_4_FrogRiverOne {

    public int solution(int X, int[] A){
        int check = X;
        boolean[] visit = new boolean[X];

        for (int k = 0; k < A.length; k++){
            if (!visit[A[k]-1]&&A[k]-1<X){
                visit[A[k]-1] = true;
                check--;
            }

            if (check==0) return k;
        }

        return -1;
    }
}
