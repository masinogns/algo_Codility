package srcDynamicPro;

/**
 * Created by masinogns on 2017. 9. 2..
 *
 *
 * 행렬 경로 문제
 *
 * 정수들이 저장된 n*n행렬의 좌상단에서 우하단까지 이동한다
 * 단 오른쪽이나 아래쪽 방향으로만 이동할 수 있다
 *
 * 방문한 칸에 있는 정수들의 합이 최소화되도록 하라
 *
 * 순환식을 세우고 계산하는 것을 동적 계획법이라고 한다
 *
 * i,j에 도달하기위해서는 i,j-1 or i-1,j를 거쳐야한다
 * 또한 i, j-1 or i-1, j까지는 최선의 방법으로 이동해야 한다
 *
 * L(i,j) : 1,1에서 i,j까지 이르는 최소합
 *
 * base case
 * m(i,j)                           if i = 1 and j = 1
 * L(i-1,j) + m(i,j)                if j = 1;   외길
 * L(i, j-1) + m(i,j)               if i = 1;   외길
 *
 * general case
 * min(L[i-1,j], L[i,j-1]) + mij    otherwise.
 */

public class ArrayPath {
    /**
     * 비효율적이다 중복 계산 부분이 많아진다
     * --> Memorization or Bottom up 방식으로 중복을 피할 수 있다
     */

    int[][] m = new int[10][10];
    int[][] L = new int[10][10];
    // 경로를 구하기 위해서는 방향을 넣어줄 수 있는 배열을 하나 더 둔 후에 함
    int[][] P = new int[10][10];


    int mat(int i, int j){
        if (i == 1 && j == 1)
            return m[i][j];
        else if (i==1)
            return mat(1, j-1)+m[i][j];
        else if (j==1)
            return mat(i-1, 1)+m[i][j];
        else
            return Math.min(mat(i-1, j), mat(i, j-1)+m[i][j]);

    }

    int matMemorization(int i, int j){

        if (L[i][j] != -1) return L[i][j];  // 캐쉬 memorization
        if (i == 1 && j == 1)
            return m[i][j];
        else if (i==1)
            return matMemorization(1, j-1)+m[i][j];
        else if (j==1)
            return matMemorization(i-1, 1)+m[i][j];
        else
            Math.min(matMemorization(i-1, j), matMemorization(i, j-1)+m[i][j]);

        return L[i][j];
    }

    // 행 우선 순서로 계산함 Bottom up
    // else if가 있는 이유는 i == 1, j==1일 때 인덱스가 0이 되기 때문이다
    // 그래서 0 인덱스일 때 무한대로 넣어두면 else if 를 없앨 수 있다
    int matDynamic(int n){

        for (int i = 1; i <=n; i++){
            for (int j = 1; j <=n; j++){
                if (i==1&&j==1)
                    L[i][j] = m[1][1];
                else if (i==1)
                    L[i][j] = m[i][j] + L[i][j-1];
                else if (j==1)
                    L[i][j] = m[i][j] + L[i-1][j];
                else
                    L[i][j] = m[i][j] + Math.min(L[i-1][j], L[i][j-1]);
            }
        }
        return L[n][n];
    }

    /**
     * 1.일반적으로 최적화 문제 혹은 카운팅 문제에 적용된다
     * 2.주어진 문제에 대한 순환식을 정의한다
     * 3.중복 계산을 피하기 위해서 순환식을 memozation 혹은 bottom up 방식으로 푼다
     *
     * subproblem들을 풀어서 원래 문제를 푸는 방식
     * 분할정봅법에서는 분할된 문제들이 서로
     * 동적계획법에서는 그렇지 않다
     * 즉 서로 overlapping하는 subproblem들을 해결함으로써 원래 문제를 해결한다
     */
}
