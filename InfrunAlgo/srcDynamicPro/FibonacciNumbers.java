package srcDynamicPro;

/**
 * Created by masinogns on 2017. 9. 1..
 */
public class FibonacciNumbers {
    /**
     * 피보나치의 수 using Recursion
     * 굉장히 많은 계산이 중복됨
     * 매우 비효율적인 알고리즘이다
     * @param n
     * @return
     */
    int fib(int n){
        if (n == 1||n == 2)
            return 1;
        else
            return fib(n-2)+fib(n-1);
    }

    /**
     * using Memorization !!!
     * recursion
     */
    int fibMeomrize(int n){

        int[] f = new int[n];
        if (n==1||n==2)
            return 1;
        else if (f[n] > -1) // 배열 f가 -1로 초기화되어 있다고 가정한다 , 즉 이미 계산된 값이라는 의미
            return f[n];
        else {
            // 중간 계산 결과를 caching한다. --> 중복 계산을 피할 수 있다
            f[n] = fibMeomrize(n-2) + fib(n-1);     // 중간 결과를 caching 해서 중복을 피한다
            return f[n];
        }
    }

    /**
     *
     * f index   1   2   3   4   5   6   7   8   9
     * f[index]  1   1   2   3   5   8   13  21  34
     *
     * f[8] = f[7] + f[6]
     * f[index=8] : 21 = 13+8
     *
     * fib(
     *
     * @param n
     * @return
     */
    int fibBottomUp(int n){
        int[] f = new int[n];

        f[1] = f[2] = 1;

        for(int i = 3; i <= n; i++)
            f[n] = f[n-1] + f[n-2];

        return f[n];
    }




}
