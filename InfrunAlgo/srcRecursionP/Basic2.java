package srcRecursionP;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 2..
 *
 * Recursive Thinking
 *
 *
 */
public class Basic2 {
    /**
     * 문자열의 길이 계산
     * 문자열의 길이 = 1 + 다음 문자열의 길이
     * @param str
     * @return
     */
    public static int length(String str){
        if (str.equals(""))
            return 0;
        else
            return 1+length(str.substring(1));
    }
    /**
     * 문자열의 프린트
     */
    public static void printChar(String str){
        if (str.length()==0)
            return;
        else {
            System.out.print(str.charAt(0));  // charAt(0)은 문자열에서 첫 글자를 리턴
            printChar(str.substring(1));        // substring(1)는 첫 글자를 제외한 나머지 문자열
        }
    }

    /**
     * 문자열을 뒤집어 프린트
     *
     * 1. 문자열을 뒤집어 프린트하려면
     * 2. 다음 문자열을 뒤집어 프린트 한 후에
     * 3. 마지막으로 첫 글자를 프린트하면 된다
     *
     */
    public static void printCharsRevers(String str){
        if (str.length() == 0)
            return;
        else {
            printCharsRevers(str.substring(1));     // substring(1)는 첫 글자를 제외한 나머지 문자열
            System.out.print(str.charAt(0));      // charAt(0)은 문자열에서 첫 글자를 리턴
        }
    }
    /**
     * 문자열의 프린트와 문자열을 뒤집어 프린트는 함수의 순서만 바뀐것 밖에 다른 점이 없다
     */

    /**
     * 2진수로 변환하여 출력
     * 음이 아닌 정수 n을 이진수로 변환하여 인쇄한다
     */
    public void printInBinary(int n){
        if (n<2)                       //Base case
            System.out.println(n);
        else {                         //Recursion case
            printInBinary(n/2);     // n을 2로 나눈 몫을 먼저 2진수로 변환하여 인쇄한 후
            System.out.print(n%2);     // n을 2로 나눈 나머지를 인쇄한다
        }
    }

    /**
     * 배열의 합 구하기
     * data[0]에서 data[n-1]까지의 합을 구하여 반환한다
     * n : 데이터의 갯수 = data.lenght
     */
    public static int sum(int n, int[] data){
        if (n<=0)
            return 0;
        else
            return sum(n-1, data) + data[n-1];
    }

    /**
     * 데이터 파일로부터 n개의 정수 읽어오기
     *
     * Scanner in이 참조하는 파일로부터 n개의 정수를 입력받아 배열 data의 data[0], ... ,data[n-1]에 저장한다
     */
    public void readFrom(int n, int[] data, Scanner in){
        if (n == 0)
            return;
        else {
            readFrom(n-1, data, in);
            data[n-1] = in.nextInt();
        }
    }

    /**
     * Recursion vs Iteration
     *
     * 모든 순환함수는 반복문으로 변경 가능하다 그 역도 가능하다
     * 모든 반복문은 recursion으로 표현 가능하다
     *
     * 복잡한 알고리즘을 단순하고 알기쉽게 표현하는 것을 가능하게 한다
     * 하지만 함수 호출에 따른 오버헤드가 있다 (매개변수 전달 ..)
     */
}
