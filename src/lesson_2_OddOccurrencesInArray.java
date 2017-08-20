import java.util.*;

/**
 * Created by masinogns on 2017. 5. 24..
 * 66%
 */
public class lesson_2_OddOccurrencesInArray {
    public int solution(int[] A){

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int counter = 0;
        int result = 0;

        for (int a : A){
            hashMap.put(a, counter);
        }

        for (int a : A){
            if (hashMap.containsKey(a)){
                hashMap.put(a, hashMap.get(a)+1);
            }
        }

        for (int key : hashMap.keySet()){
//            System.out.println("we have keys. it is that" + hashMap.get(key));
        }

        //TreeMap은 Key에 대해서 정렬합니다. Value에 대한 정렬이 필요하면, TreeSet을 쓰거나,
        List<Integer> list = new ArrayList<>(hashMap.values()); // JAVA 8에서는 이렇게 써도 됩니다.
        Collections.sort(list); // java.util.Collections

        for(int key: hashMap.keySet()) {
            if(hashMap.get(key).equals(list.get(0))) {
                result = key;
            }
        }


        return result;
    }

    public int solution2(int[] A){

        Set<Integer> set = new HashSet<Integer>();

        for (int element : A) {
            if (set.contains(element)){
                set.remove(element);
            }else {
                set.add(element);
            }
        }


        return set.iterator().next();
    }

    public static void main(String[] args) {
        lesson_2_OddOccurrencesInArray solution = new lesson_2_OddOccurrencesInArray();

        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int result = solution.solution2(A);
        System.out.println(result);

    }
}
