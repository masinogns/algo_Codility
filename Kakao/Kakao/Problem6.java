/**
 * Created by masinogns on 2017. 8. 30..
 */
public class Problem6 {
    public int solution(int[] sticker) {
        int answer = 0;

        int addSum = 0;
        for (int i = 0; i < sticker.length; i+=2){
            addSum += sticker[i];
        }

        int oddSum = 0;
        for (int i = 1; i < sticker.length; i+=2){
            oddSum += sticker[i];
        }

        answer = Math.max(addSum, oddSum);

        return answer;
    }
}
