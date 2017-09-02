package srcRecursionP;

/**
 * Created by masinogns on 2017. 9. 2..
 *
 *  * DESIGNING RECURSION
 * 순환 알고리즘 설계
 *
 * 적어도 하나의 base case, 즉 순환되지 않고 종료되는 case가 있어야 함
 * 모든 case는 결국 base case로 수렴해야 함
 *
 * if(  ){
 *     base case
 * }else{
 *     recursion
 * }
 *
 * 가장 중요한 순환적 알고리즘 설계
 * 암시적(implicit) 매개변수를
 * 명시적(explicit) 매개변수로 바꾸어라 !!!
 */
public class Basic3 {
    /**
     * 순차 탐색 sequential search
     *
     * 배열이 주어지고 타겟값도 주어진다
     * 배열 안에 타겟값이 있는지 없는지 판단하고 있다면 어디에 있는지 출력해준다
     *
     * 이 함수의 미션은 data[0]에서 data[n-1] 사이에서 target을 검색하는 것이다
     * 하지만 검색 구간의 시작 인덱스 0은 보통 생략한다 즉 암시적 매개변수이다
     */
    public int searchIterator(int[] data, int n, int target){
        // [0, n-1]에서 int n에서 명시적으로 표현되어있다 그러나 0은 암시적 매개변수이다
        for (int i = 0; i < n ; i++){
            if (data[i] == target)
                return i;
        }

        return -1;
    }

    /**
     * 이 함수의 미션은 data[begin]에 data[end] 사이에서 target을 검색한다
     * 즉 검색구간의 시작점을 명시적(explicit)으로 지정한다
     *
     * 이 함수를 search(data, 0, n-1, taget)으로 호출한다면
     * 앞 페이지의 함수와 완전히 동일한 일을 한다
     *
     * 0의 암묵적 매개변수를 begin 명시적으로 바꿨다
     */
    public int searchRecursion(int[] data, int begin, int end, int target){
        if (begin > end)            // 데이터의 갯수가 0개 라는 것
            return -1;
        else if (target == data[begin])
            return begin;
        return searchRecursion(data, begin+1, end, target);
    }

    /**
     * 다른 버전
     */
    public int searchRecursionV2(int[] data, int begin, int end, int target){
        if (begin>end)
            return -1;
        else if (target == data[end])
            return end;
        else
            return searchRecursionV2(data, begin, end-1, target);
    }

    /**
     * 배열을 절반으로 나눠서 생각하기
     */
    public int searchRecursionV3(int[] data, int begin, int end, int target){
        if (begin > end)
            return -1;
        else {
            int middle = (begin+end)/2;

            if (data[middle] == target)
                return middle;

            int index = searchRecursionV3(data, begin, middle-1, target);

            if (index != -1)
                return index;
            else
                return searchRecursionV3(data, middle+1, end, target);
        }
    }


    /**
     * 매개변수의 명시화 : 최대값 찾기
     */
    public int findMax(int[] data, int begin, int end){
        if (begin == end)       // 데이터의 갯수가 1개일 때가 base case이다
            return data[begin];
        else
            return Math.max(data[begin], findMax(data, begin+1, end));
    }

    public int findMaxV2(int[] data, int begin, int end){
        if (begin == end)
            return data[begin];
        else{
            int middle = (begin/end)/2;
            int max1 = findMaxV2(data, begin, middle);
            int max2 = findMaxV2(data, middle+1, end);

            return Math.max(max1, max2);
        }
    }

    /**
     * Binary Search
     *
     * items[begin]에서 items[end] 사이에서 target을 검색한다
     *
     * 데이터는 크기순으로 정렬되어있기 때문에, 오름차순
     * 가운데를 비교하고 가운데보다 크다면 middle + 1 ~ end
     * 가운데를 비교하고 가운데보다 작다면 begin ~ middle - 1에서 비교하면 된다
     */
    public static int binarySearch(String[] items, String target, int begin, int end){
        if (begin > end)
            return -1;
        else {
            int middle = (begin+end)/2;
            int compResult = target.compareTo(items[middle]);
            if (compResult == 0)
                return middle;
            else if (compResult < 0)
                return binarySearch(items, target, begin, middle-1);
            else
                return binarySearch(items, target, middle+1, end);
        }
    }

}
