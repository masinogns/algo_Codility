package lesson5;

import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 8. 26..
 *
 * Array[N]
 * 0 은 동쪽으로 향하는 차
 * 1 은 서쪽으로 향하는 차
 *
 * 목표는 지나가는 차량 수를 세는 것입니다.
 * P가 동쪽으로 가고 Q가 서쪽으로 여행 할 때 0 ≤ P <Q <N 인 한 쌍의 자동차 (P, Q)가 지나가고 있다고합니다.
 *
 * For example, consider array A such that:

 A[0] = 0
 A[1] = 1
 A[2] = 0
 A[3] = 1
 A[4] = 1
 We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4)
 동쪽으로 가는 차와 서쪽으로 가는 차 각각 1:1 대응시켜 한다

 the function should return 5

 (앞에거, 뒤에거)
 뒤에거는 앞에거보다 작은면 안된다
 */
public class PassingCars {
    public int solution(int[] A){
        ArrayList<Integer> arrayListOne = new ArrayList<>();
        ArrayList<Integer> arrayListTwo = new ArrayList<>();

        // 동쪽(0)으로 가는 차, 서쪽(1)으로 가는 차 분류
        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) arrayListOne.add(i);
            else if (A[i] == 1) arrayListTwo.add(i);
        }

        int count = 0;
        // O(N^2)
        for (Integer one : arrayListOne){
            for (Integer two : arrayListTwo){
                if (one < two) count++;
            }
        }

        return count;
    }

    public int solution2(int[] A){

        return 0;
    }
}
