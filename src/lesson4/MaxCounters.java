package lesson4;

import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 8. 26..
 *
 */
public class MaxCounters {
    int[] counter;

    public int[] solution(int N, int[] A){
        counter = new int[N];

        // O(M)
        for (int i = 0 ; i < A.length; i++){


            if (1<=A[i] && A[i]<=N){
                increase(A[i]);
            }

            if (A[i]==N+1){
                maxCounter(N);
            }
//            counter 배열이 어떻게 변하는지 볼 수 있게 결과값 찍는 곳이다
//            for (int c : counter) System.out.print(c+" ");
//            System.out.println("");
        }

        return counter;
    }

    private void increase(int X){
        counter[X-1] += 1;
    }

    private void maxCounter(int n){
        int max = -999;

        //O(N)
        for (int i:counter){
            if (max < i){
                max = i;
            }
        }

        //O(N)
        for (int i = 0 ; i < counter.length; i++){
            counter[i] = max;
        }
    }

    public ArrayList<Integer> getResult(){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i : counter){
            arrayList.add(i);
        }

        return arrayList;
    }
}
