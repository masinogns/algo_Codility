package lesson7;

import java.util.Stack;

/**
 * Created by masinogns on 2017. 8. 25..
 *
 * 벽의 높이가 증가할 때     ; count++;
 * 벽의 높이가 감소할 때     ;{
 *     1. 같은 높이의 원소가 있을 때 break;
 *     2. 나보다 작은 원소가 있을 때 count++; break;
 *     3. 나보다 큰 원소가 있을 때 continue;
 * }
 * 벽의 높이가 같을 때      ; continue; //continue하는 부분은 없어도 되는 부분
 */
public class StoneWall {

    int solution(int[] H){
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int h : H) {
            /**
             * 스택이 비지 않았고 벽의 높이가 감소하는 경향을 띨 때
             * h보다 큰 stack의 값들을 모두 pop해서 추출하라
             *
             * 감소하는 경향일 때 h보다 같거나 작은 것이 있어야 비교가 가능하다
             * 그래서 h보다 큰게 있을 때는 비교에 도움이 되지 않기 때문에 모두 pop을 한다
             *
             * h랑 같을 때는 같은 블럭이 있는 것으로 보고
             * h랑 작은 것이 있을 때는 블럭의 수를 +1한다
             */

            while (!stack.isEmpty() && stack.peek() > h){
                stack.pop();
            }
            // 스택이 비었거나 벽의 높이가 증가하는 경향을 띨 때
            if (stack.isEmpty() || stack.peek() < h){
                stack.push(h);
                count++;
            }
            /**
             * if ~~~
             * while ~~이 안되는 이유
             */
        }

        return count;
    }

}
