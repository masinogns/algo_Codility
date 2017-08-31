package lesson5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by masinogns on 2017. 8. 30..
 *
 * *
 * to find the minimal impact factor
 *  Nucleotides of types A, C, G and T
 *  have impact factors of 1, 2, 3 and 4, respectively.
 *
 * 더 작은것을 리턴한다
 */
public class GenomicRangeQuery {

    // O(N*M) 62%  왜냐하면 contains or indexOf가 O(N)의 복잡도를 갖는다
    public int[] solution(String s, int[] p, int[] q) {

        int M = p.length;
        int[] answer = new int[M];
        char[] chars;
        String string;

        for (int i = 0 ; i < M; i++){
            chars = new char[q[i]+1-p[i]];
            s.getChars(p[i], q[i]+1, chars,0);
            string = Arrays.toString(chars);

            if (string.contains("A")){
                answer[i] = 1;
            }else if (string.contains("C")){
                answer[i] = 2;
            }else if (string.contains("G")){
                answer[i] = 3;
            }else {
                answer[i] = 4;
            }

        }

        return answer;
    }

    public int[] solution2(String s, int[] p, int[] q){
        int M = p.length;
        int[] answer = new int[M];

        // A, C, G = 1, 2, 3 index를 저장하는 배열
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        ArrayList<Integer> G = new ArrayList<>();

        // O(N)
        // index에 맞는 문자를 찾아서 저장한다
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A')
                A.add(i);
            else if (s.charAt(i) == 'C')
                C.add(i);
            else if (s.charAt(i) == 'G')
                G.add(i);
        }

        // O(M)
        for (int i = 0; i < q.length; i++){

        }
        return new int[0];
    }
}
