package srcDynamicPro;

/**
 * Created by masinogns on 2017. 9. 1..
 */
public class BinomialCoefficient {
    /**
     * 이항 계수(Binomial Coefficient)
     * n개 중에서 k를 선택하는 경우의 수
     *
     * (n, k) = n ! / (n-1)!*k!
     * n행 k열의 배열 캐시
     *
     * 100! / 2! 98! --> 100*99 / 2
     * 100!계산하고 98!계산한 다음 ... 하면 문제가 생긴다
     * 100!가 엄청 큰 값이다
     * 많은 계산이 중복된다 !!
     *
     * 캐싱 캐싱 캐싱 !! 배열로 캐싱한다
     */
    int binomial(int n, int k ){
        if (n == k || k == 0)
            return 0;
        else
            return binomial(n-1, k) + binomial(n-1, k-1);
    }

    int binomialMemorization(int n, int k){
        int[][] binom = new int[n][k];

        if (n == k || k == 0)
            return 0;
        else if (binom[n][k] > -1)
            return binom[n][k];
        else {
            binom[n][k] = binomialMemorization(n-1, k) + binomialMemorization(n-1, k-1);
            return binom[n][k];
        }
    }

    // Bottom up 방식
    // 기본적인 값에서 시작해서 내가 원하는 값으로 올라온다 라는 의미에서 Bottom up이다
    // 순환식을 계산을 할 때 오른쪽에 등장하는 값이 왼쪽에 계산되어지는 값보다 먼저 계산되어지는 방식이 Bottom up 방식이라고 한다
    int binomialDynamicProgramming(int n, int k){
        int[][] binom = new int[n][k];

        for (int i = 0; i <=n; i++){
            for (int j=0; j<=k&&j<=i; j++){
                if (k==0||n==k)
                    binom[i][j] = 1;
                else
                    binom[i][j] = binom[i-1][j-1] + binom[i-1][j];

            }
        }

        return binom[n][k];
    }

    /**
     * Memorization vs Dynamic Programming
     * 순환식의 값을 계산하는 기법들
     * 둘 다 동적계획법의 일종으로 보기도 한다
     * Memoization은 top-down 방식이며 실제로 필요한 subproblem만을 푼다
     * 동적 계획법은 bottom-up방식이며 recursion에 수반되는 overhead가 없다
     */
}
