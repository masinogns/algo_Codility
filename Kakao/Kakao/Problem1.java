import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 8. 30..
 *
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class Problem1 {
    public int solution(int n) {
        int answer = 0, numberLenght = 0;

        numberLenght = (int)(Math.log10(n)+1);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = numberLenght; i > 0; i--){
            arrayList.add((int) (n/Math.pow(10,i-1)));
            n = (int) (n % Math.pow(10, i-1));
        }

        for (Integer i : arrayList){
            answer += i;
        }

        return answer;
    }
}
