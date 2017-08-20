import java.util.ArrayList;
import java.util.List;

/**
 * Created by masinogns on 2017. 5. 25..
 * 87 score
 */
public class lesson_2_CyclicRotation {

    public int[] solution(int[] A, int K){

        int lastElement = 0;
        int lastIndex = 0;

        List<Integer> listInteger = new ArrayList<Integer>();

        for (int i : A){
            listInteger.add(i);
        }
//        System.out.println(listInteger);

        for (int index = 0; index < A.length; index++){
            System.out.println(listInteger.get(index));
//            listInteger.add(index+1, listInteger.get(index));
        }
//        System.out.println(listInteger);

        for (int i = 0; i < K; i++){
            lastIndex = listInteger.size() -1;
            lastElement = listInteger.get(lastIndex);
            listInteger.remove(lastIndex);
            listInteger.add(0, lastElement);
        }

        System.out.println(listInteger);

        int[] intArray = new int[listInteger.size()];
        for (int i = 0; i < listInteger.size(); i++){
            intArray[i] = listInteger.get(i).intValue();
//            System.out.println(listInteger.get(i).intValue());
        }

        return intArray;
    }

    public static void main(String[] args) {

        lesson_2_CyclicRotation controller = new lesson_2_CyclicRotation();

        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        controller.solution(A, K);
    }
}
