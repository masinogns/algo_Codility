package lesson1;

/**
 * Created by masinogns on 2017. 5. 24..
 * 100 score
 */
public class lesson_1_Iterators {
    public int solution(int N){
        int result = 0;
        int counter = 0;

        String binary = Integer.toBinaryString(N);
        System.out.println(binary);

        for (int i = 0; i < binary.length(); i++){
            if (binary.charAt(i)=='0'){
                //"0"을 하면 안되고 '0'을 하면 된다?
//                System.out.println("0이 발견되었다");
                counter++;
            }else {
                if (counter > result){
                    result = counter;
                }
                counter = 0;
            }
        }

        if (result == 0){
            result = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        lesson_1_Iterators solution = new lesson_1_Iterators();
        int result = solution.solution(25);
        System.out.println(result);
    }
}
