package lesson8;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by masinogns on 2017. 8. 28..
 */
public class Dominator {

    public int solution(int[] A) {

        // 배열에서 가장 많이 등장하는 리더 값을 찾는다
        int size = 0, findLeader = 0, storedLeader = 0;

        for (int i = 0; i < A.length; i++){
            if (size==0){
                size+=1;
                findLeader = A[i];
            }else {
                if (findLeader == A[i])
                    size+=1;
                else
                    size-=1;
            }
        }

        if (size > 0)
            storedLeader = findLeader;
        else return -1;

        // 리더의 인덱스 값들을 큐에 저장한다
        Queue<Integer> queue = new LinkedList<>();

        // 리더값과 같은 배열의 값의 인덱스 값들을 큐에 저장한다
        for (int i = 0; i < A.length; i++){
            if (storedLeader == A[i])
                queue.offer(i);
        }

        // 만약 리더 값의 크기가 > n/2 more than half of array A 이라면 실행한다
        if (queue.size() > A.length/2){
            int count = 0;
            // n/2 more than half of array A가 되는 부분의 index값을 return한다
            for (Integer i : queue) {
                count+=1;

                if (count >= A.length/2){
                    return i;
                }
            }
        }

        return -1;
    }
}
