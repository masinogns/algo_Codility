package lesson9;

/**
 * Created by masinogns on 2017. 8. 29..
 *
 * 주식의 가격을 N일 동안의 주식 가격을 기록한 배열 A가 있다고하자
 * 이 때 가장 큰 이득을 보는 살 때와 팔 때의 차이는 언제인가?
 */
public class MaxProfit {
    public int solution(int[] A) {
        int min = 2147483647 , maxProfit = 0;

        for (int a : A){
            min = Math.min(min, a);
            maxProfit = Math.max(a-min, maxProfit);
        }

        return maxProfit;
    }
}
