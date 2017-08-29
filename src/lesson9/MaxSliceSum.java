package lesson9;

/**
 * Created by masinogns on 2017. 8. 28..
 *
 * 배열 안에서 가장 최대의 값을 갖는 slice를 찾는 것이 목표이다
 *
 * 그런데 음수만 있을 때 음수를 출력해야한다
 *
 * 첫 번째 수부터 더하기 시작한다. sum에 저장하고
 * result의 값과 sum의 값을 비교한 후에
 * sum의 값이 더 크면 result에 저장한다
 *
 *
 */
public class MaxSliceSum {
    public int maxSliceSum(int[] A) {
        int sum = 0, result = -2147483648;

        for (int a : A){
            sum+=a;

            if (result < sum)
                result = sum;

            if (sum < 0)
                sum = 0;
        }

        return result;
    }
}
