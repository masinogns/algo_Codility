package lesson4;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by masinogns on 2017. 5. 28..
 */
public class lesson_4_PermCheck {

    public int solution(int[] A){
        int confirm = 0;
        int result = 0;
        int index = 0;

        int permCheck = -1;

        Arrays.sort(A);
        index = A[A.length-1];

        confirm = IntStream.of(A).sum();
        result = IntStream.rangeClosed(1, index).sum();

        if (confirm != result){
            permCheck = 0;
        }else {
            permCheck = 1;
        }

        System.out.println(confirm);
        return permCheck;
    }

    public int solution2(int[] A){

        int permCheck = -1;

        Arrays.sort(A);

        for (int i = 0 ; i < A.length-1; i++){
            if ((A[i+1]-A[i])!=1){
                permCheck = 0;
                break;
            }else {
                permCheck = 1;
            }
        }
        return permCheck;
    }
    public static void main(String[] args) {

        lesson_4_PermCheck controller = new lesson_4_PermCheck();
        int[] A = {4,1,3};
        System.out.println(controller.solution2(A));

    }
}
