package lesson8;

import java.util.*;

/**
 * Created by masinogns on 2017. 8. 27..
 */
// 내림차순 !!
class Descending implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
// 오름차순 !!
class Ascending implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

public class _Leader {

    // O(n^2)
    public int slowLeader(ArrayList<Integer> arrayList) {
        int n = arrayList.size();
        int leader = -1;

        for (int k = 0; k < n; k++) {
            int candidate = arrayList.get(k);
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (arrayList.get(i) == candidate) {
                    count += 1;
                }
            }

            if (count > n % 2) {
                leader = candidate;
            }
        }
        return leader;
    }

    // O(n*logN)
    public int fastLeader(ArrayList<Integer> arrayList) {
        int n = arrayList.size();
        int leader = -1;

        Collections.sort(arrayList, new Ascending());
//        for (Integer i : arrayList){
//            System.out.print(i+" ");
//        }

        int candidate = arrayList.get(n % 2);
        int count = 0;

        for (int i = 0; i < n; i++){
            if (arrayList.get(i) == candidate){
                count+=1;
            }
        }

        if (count > n % 2){
            leader = candidate;
        }

        return leader;
    }


    public int leader(ArrayList<Integer> arrayList) {
        int n = arrayList.size();
        int size = 0;

        int value = 0;
        for (int k = 0; k<n; k++){
            if (size == 0){
                size+=1;
                value = arrayList.get(k);
            }else {
                if (value!=arrayList.get(k))
                    size-=1;
                else
                    size+=1;
            }
        }
        int candidate = 0;
        if (size > 0)
            candidate = value;

        int leader = -1;
        int count = 0;

        for (int k = 0; k<n;k++){
            if (arrayList.get(k)==candidate)
                count+=1;
        }
        if (count> n%2)
            leader = candidate;

        return leader;
    }
}
