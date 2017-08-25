package lesson4;

import java.util.*;

/**
 * Created by masinogns on 2017. 5. 28..
 */
public class lesson_4_Missinginteger {
    public int solution(int[] A){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int result = 0;
        int counter = 0;
        int returnValue = 0;

        for (int a : A){
            hashMap.put(a, counter);
        }

        for (int a : A){
            if (hashMap.containsKey(a)){
                hashMap.put(a, hashMap.get(a)+1);
            }
        }

        for (int key : hashMap.keySet()){
            System.out.print(key+" : ");
            System.out.println(hashMap.get(key));
        }

        // https://www.mkyong.com/java8/java-8-convert-map-to-list/ convert map to list
        List<Integer> convert = new ArrayList<>(hashMap.keySet());

        for(int i = 0; i < convert.size()-1; i++){
//            System.out.println(convert.get(i));
            result = convert.get(i+1) - convert.get(i);
            if (result != 1){
                returnValue = convert.get(i+1)-1;
            }
//            System.out.println(result);
        }
//        System.out.println(returnValue);
        return returnValue;
    }

    public static void main(String[] args) {
        lesson_4_Missinginteger controller = new lesson_4_Missinginteger();
        int[] A = {1,3,6,4,1,2};
        controller.solution(A);
    }
}
