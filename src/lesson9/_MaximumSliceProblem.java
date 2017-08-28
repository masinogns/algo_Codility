package lesson9;

/**
 * Created by masinogns on 2017. 8. 28..
 *
 * 주어진 배열에서 가장 최대값을 갖는 slice를 찾는다
 * p에서부터 q까지일 때 최대 값을 찾는다
 */
public class _MaximumSliceProblem {
    // O(n^3) 가장 쉬운 방법으로 모든 slice를 검사한다
    public int slowMaxSlice(int[] A) {
        int n = A.length, result = 0;

        for (int p = 0; p < n; p++){
            for (int q = p; q < n; q++){
                int sum = 0;
                for (int i = p; i < q+1; i++ ){
                    sum += A[i];
                }
                result = Math.max(result, sum);
            }
        }

        return result;
    }

    public int quadraticMaxSlice(int[] A){
        int n = A.length, result = 0, sum = 0;

        for (int p = 0; p < n; p++){
            sum = 0;

            for (int q = p; q < n; q++){
                sum += A[q];
                result = Math.max(result, sum);
            }
        }
        return result;
    }

    public int goldenMaxSlice(int[] A) {
        int sum = 0, result = 0;

        for (int a : A){
            // 0 보다 작을 경우에는 0
            // 0 이상일 경우에는 sum+a
            sum = Math.max(0, sum+a);
            result = Math.max(result, sum);
        }
        return result;
    }
}
