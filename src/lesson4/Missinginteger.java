package lesson4;

import java.util.*;

/**
 * Created by masinogns on 2017. 5. 28..
 *
 * N개의 정수 배열로 이루어진 배열 Array
 * A 배열에 없는 가장 최소의 양의 정수를 출력하는 것
 *
 * 양수의 갯수가 0개이면 모두 음수라는 뜻 return 1
 * 양수의 갯수가 1개이면 하나만 양수라는 것 return 1
 * 양수의 갯수가 2개이면 두개가 양수라는 것 If
 *
 */
public class Missinginteger {
    public int solution(int[] A) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < A.length+1; i++){
            arrayList.add(i, i+1);
        }
        int min = 100000, value = 0, indexValue = 0;

        for (int i = 0; i < A.length; i++){
            indexValue = arrayList.indexOf(A[i]);
            if ( indexValue != -1){
                arrayList.remove(indexValue);
            }
        }

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            value = (int)iterator.next();
            if (value < min){
                min = value;
            }
        }

        return min;
    }

    public int solution2(int[] A){
        int result = 1;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : A){
            hashSet.add(i);
        }

        while (hashSet.contains(result)){
            result++;
        }

        return result;
    }

}
