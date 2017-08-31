package lesson5;

/**
 * Created by masinogns on 2017. 8. 26..
 *
 * 부분 합이란 0~k까지의 합을 의미하는 것이고
 * 구간 합이란 a~b까지의 합을 의미하는 것이다
 *
 * http://www.crocus.co.kr/843
 *
 * https://www.acmicpc.net/problem/1806
 * https://www.acmicpc.net/problem/1644
 * https://www.acmicpc.net/problem/11441
 출처: http://www.crocus.co.kr/599 [Crocus]
 *
 */
public class _PrefixSums {
    int[] P;

    public int[] prefixSum(int[] A) {
         P = new int[A.length+1];

        for (int i = 1; i < A.length+1; i++){
            P[i] = P[i-1] + A[i-1];
        }
        return P;
    }

    // P[x] + P[x+1] + ... + P[y-1] + P[y]
    public int countTotal(int[] P, int x, int y){
        return P[y+1] - P[x];
    }
}
