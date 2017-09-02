package srcRecursionP;

/**
 * Created by masinogns on 2017. 9. 1..
 */
public class Basic1 {
    // 무한루프에 빠지는 recursion 문
    public void infiniteLoop() {
        System.out.println("Hello");
        infiniteLoop();
    }

    /**
     * 무한루프에 빠지지 않으려면?
     * 1. base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 한다
     * 2. recursive case : recursion을 반복하다보면 결국 base case로 수렴해야 한다
     * @param i
     */
    public void recursionLoop(int i) {
        if (i == 0)
            return;
        else{
            System.out.println("Hell");
            recursionLoop(i-1);
        }
    }

    /**
     * 0에서 n까지의 합을 만드는 함수를 만들어라
     * 1. 함수의 미션은 0~n까지의 합을 구하는 것
     * 2. n=0이라면 합은 0이다
     * 3. n>0, 0~n까지의 합은 0에서 n-1까지의 합에 n을 더한 것이다
     * @param i
     * @return
     */
    public int recursiveSum(int i) {
        int result = 0;

        if (i == 0)
            return 0;
        else
            result = i + recursiveSum(i-1);

        return result;
    }


    /**
     * factorial : n!
     * 0! = 1
     * n! = n * (n-1)!
     *
     * @param i
     * @return
     */
    public int recursiveFactorial(int i) {
        int ret = 0;

        if (i == 0)
            return 1;
        else
            ret = i*recursiveFactorial(i-1);

        return ret;
    }


    /**
     * x의 n승을 계산하는 함수
     * x^0 = 1
     * x^n = x*x^n-1 if n > 0
     *
     * @param x
     * @param n
     * @return
     */
    public int recursiveX(int x, int n) {
        if (n == 0)
            return 1;
        else
            return x*recursiveX(x, n-1);
    }

    /**
     * 피보나치
     * f0 = 0
     * f1 = 1
     * fn = fn-1 + fn-2 ( n>1 )
     * @param i
     * @return
     */
    public int recursiveFibo(int i) {

        if (i == 0)
            return 0;
        else if (i == 1)
            return 1;
        else
            return recursiveFibo(i-1)+recursiveFibo(i-2);
    }

    /**
     * 아 이건 못풀겠다.
     * 최대 공약수 : Euclid method

     * m>=n인 두 양의 정수 m과 n에 대해서 m이 n의 배수이면 gcd(m,n) = n이고,
     * 그렇지 않으면 gcd(m,n) = gcd(n,m%n)이다.

     * 좀 더 단순한 버전

     * gcd(p, q)
     * p if q = 0
     * gcd(q, p%q) otherwise
     * @param n
     * @param m
     * @return
     */
    public int recursiveEuclid(int n, int m) {
        return 0;
    }
}
