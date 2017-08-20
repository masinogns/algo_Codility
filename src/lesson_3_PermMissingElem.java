import java.lang.reflect.Array;
import java.util.*;


/**
 * Created by masinogns on 2017. 5. 25..
 */
public class lesson_3_PermMissingElem {

    // 풀이 50퍼가 나옴 왜 이런지는 생각해보아야 할 문
    public int solution(int[] A){

        int result = 0;
        int counter = 0;
//        System.out.println(Arrays.toString(A));
        Arrays.sort(A);
//        System.out.println(Arrays.toString(A));
//        Arrays.stream(A).forEach(System.out::println);

        for (int i = 0; i < A.length-1; i++){
//            System.out.println(A[i]);

            result = A[i+1]-A[i];
//            System.out.println(result);

            if (result != 1){
                counter = i+1;
            }
        }
//        System.out.println(A[counter]);
        return A[counter]-1;
    }

    /**
     * intStream
     * intStream.of() // intStream 생
     * intStream.range(1,5) // 1,2,3,4에 대한 int stream 생성
     * intStream.rangeClosed(1,5) // 1,2,3,4,5에 대한 int stream 생성
     * @param A
     * @return
     */
    public int solution2(int[] A){

        int sumArrays = 0;
        int minusArrays = 0;

        for (int elemnet : A){
            sumArrays += elemnet;
        }

        for (int i = 1 ; i<=A.length+1; i++){
//            System.out.println(minusArrays);
            minusArrays += i;
        }

        int result = minusArrays - sumArrays;


        return result;
    }

    public static void main(String[] args) {
        lesson_3_PermMissingElem controller = new lesson_3_PermMissingElem();
        int[] A = {2,3,1,5};
//        controller.solution(A);
        int sys = controller.solution2(A);
        System.out.println(sys);

    }
}
