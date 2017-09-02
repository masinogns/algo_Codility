package srcRecursionP;

/**
 * Created by masinogns on 2017. 9. 2..
 *
 * Backtracking
 * 지나온 곳을 다시 백해서 돌아가면서 문제를 해결해 나간다
 * 안된다 -> 최근에 내린 결정을 번복하고 다시 결정한다
 *
 * 상태공간트리
 * 상태공간트리란 찾는 해를 포함하는 트리 !
 * 즉 해가 존재한다면 그것은 반드시 이 트리의 어떤 한 노드에 해당한다
 * 따라서 이 트리를 체계적으로 탐색하면 해를 구할 수 있다
 *
 * 상태공간 트리의 모든 노드를 탐색해야 하는 것은 아니다
 * 트리를 만드는 것이 아니라 탐색하는 코드를 짜면 된다
 *
 * 되추적 기법 Backtracking 기법 = 깊이 우선 탐색
 * 상태공간 트리를 깊이 우선 방식으로 탐색하여 해를 찾는 알고리즘을 말한다 !!!!
 *
 * 깊이 우선 방식은 recursion이나 stack을 이용해서 백트래킹알고리즘을 구현한다
 *
 * 백트래킹을 하는 알고리즘은 대부분 다음과 같은 로직을 갖는다
 *                      매개변수는 내가 현재 트리의 어떤 노드에 있는지를 지정해야 한다.
 * return type queens (arguments){
 *     if non-promising //실패
 *      report failure and return
 *     else if success
 *      report answer and return
 *     else
 *      visit children recursively  // 꽝도 아니고 정답도 아니면 자식 노드들을 또 살펴봐야 한다
 * }
 */
public class _NQueensProblem {

    /**
     * param : level 현재 노드의 레벨을 표현하고, 1번에서 level 말이 어디에 놓였는지 전역변수 배열 cols로 표현하자
     * cols[i] = j 는 i번 말이 i행 j열에 놓였음을 의미한다.
     *
     * param :
     * cols[1]는 1번 말이 놓인 열 번호
     * cols[2]는 2번 말이 놓인 열 번호
     */

    private int N = 4;
    int[] cols = new int[N+1];
    boolean queens(int level){
        if (!promising(level))
            return false;

        else if (level == N)
//            for (Integer a : cols) System.out.println(a);
            return true;

        for (int i = 1; i <=N; i++){    // level + 1 번째 말을 각각의 열에 놓은 후 recursion을 호출한다
            cols[level+1] = i;

            if (queens(level+1))
                return true;
        }
        return false;
    }

    private boolean promising(int level) {
        for (int i = 1; i < level; i++){
            if (cols[i] == cols[level])                         // 같은 열에 놓였는지 검사
                return false;
            else if (level-i == Math.abs(cols[level]-cols[i]))  // 같은 대각선에 놓였는지 검사
                return false;
        }
        return false;
    }
}