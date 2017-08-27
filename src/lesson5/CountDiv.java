package lesson5;

/**
 * Created by masinogns on 2017. 8. 26..
 */
public class CountDiv {
    // O(B-A) 50%
    public int solution(int A, int B, int K){
        int count = 0;
        for (int i = A; i <= B; i++){
            if (i%K==0)count++;
        }

        return count;
    }

    //O(1) 62%
    public int solution2(int A, int B, int K){

        int result = B / K ;
        if (A!=0) result -= (A-1) / K ;

        return result;
    }

    //O(1)
    public int solution3(int A, int B, int K){

        int result = B / K + 1;
        if (A!=0) result -= (A-1) / K + 1;

        return result;
    }
}
