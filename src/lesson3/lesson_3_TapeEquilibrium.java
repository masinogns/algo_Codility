package lesson3;

import java.util.stream.IntStream;

/**
 * Created by masinogns on 2017. 5. 28..
 */
public class lesson_3_TapeEquilibrium {
    public int solution(int[] A){
        int sum1 = 0;
        int sum2 = IntStream.of(A).sum();
        int min = 0;
        int result = 100000;

        for (int p = 0; p < A.length-1; p++){
            sum1 += A[p];
            sum2 -= A[p];

            min = Math.abs(sum2 - sum1);
//            System.out.println(Math.abs(min));

            if (result > min){
                result = min;
            }else {
                continue;
            }
        }

//        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        lesson_3_TapeEquilibrium controller = new lesson_3_TapeEquilibrium();

        int[] A = {3,1,2,4,3};
        controller.solution(A);
    }
}
