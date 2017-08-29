package lesson9;

/**
 * Created by masinogns on 2017. 8. 28..
 *
 * Kadane's Algorithm
 *
 * Maximum subarray sum

 요약 : 주어진 배열의 sub array중 합이 가장 큰 것을 찾는 Maximum Subarray 알고리즘이다.
 전형적인 Dynamic Programming의 예시로써 다음과 같은 점화식을 가진다.

 DP(idx) = idx에서 끝나는 sub-array의 합 중 최댓값.
 arr = 주어진 배열.

 DP(idx) = max(DP(idx - 1) + arr[idx], arr[idx])

 시간 : O(N)
 [출처] Kadane's Algorithm|작성자 CurnurX
 */

/**
 *
 */
public class KadanesAlgorithm {
    public int solution(int[] A) {
        int maxTotal = 0, maxHere = 0;

        maxTotal = maxHere = A[0];

        for (int i = 1; i < A.length; i++){
            maxHere = Math.max(maxHere+A[i], A[i]);
            maxTotal = Math.max(maxTotal, maxHere);
        }

        return maxTotal;
    }
}
