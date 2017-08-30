import java.util.*;

/**
 * Created by masinogns on 2017. 8. 30..
 *
 * 직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때, 나머지 한 점의 좌표를 구하려고 합니다.
 * 점 3개의 좌표가 들어있는 배열 v가 매개변수로 주어질 때, 직사각형을 만드는 데
 * 필요한 나머지 한 점의 좌표를 return 하도록 solution 함수를 완성해주세요.
 * 단, 직사각형의 각 변은 x축, y축에 평행하며, 반드시 직사각형을 만들 수 있는 경우만 입력으로 주어집니다.

 제한사항
 v는 세 점의 좌표가 들어있는 2차원 배열입니다.
 v의 각 원소는 점의 좌표를 나타내며, 좌표는 [x축 좌표, y축 좌표] 순으로 주어집니다.
 좌표값은 1 이상 10억 이하의 자연수입니다.
 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 [x축 좌표, y축 좌표] 순으로 담아 return 해주세요.
 */
public class Problem3 {
    public int[] solution(int[][] v) {
        int[] answer = {};

        HashMap<Integer, Integer> hashMapX = new HashMap<>();
        HashMap<Integer, Integer> hashMapY = new HashMap<>();

        for (int i = 0; i < 3; i++){
            if (hashMapX.get(v[i][0]) == null)
                hashMapX.put(v[i][0], 0);
            else
                hashMapX.put(v[i][0], hashMapX.get(v[i][0])+1);

            if (hashMapY.get(v[i][1]) == null)
                hashMapY.put(v[i][1], 0);
            else
                hashMapY.put(v[i][1], hashMapY.get(v[i][1])+1);
        }

        int xx = retKey(hashMapX);
        int yy = retKey(hashMapY);
//        System.out.println(xx);
//        System.out.println(yy);

        answer = new int[]{xx, yy};

        return answer;
    }

    private int retKey(HashMap<Integer, Integer> hashMapX) {
        int xx = 0;
        Iterator iterator = hashMapX.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();

            int key = 0, value = 0;

            key = (int)entry.getKey();
            value = (int)entry.getValue();

//            System.out.println("key : " + key);
//            System.out.println("value : " + value);

            if (value == 0)
                xx = key;
        }
        return xx;
    }
}
