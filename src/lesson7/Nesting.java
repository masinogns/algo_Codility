package lesson7;

import java.util.Stack;

/**
 * Created by masinogns on 2017. 8. 26..
 */
public class Nesting {
    int solution(String S){
        Stack<Character> stack = new Stack<>();
        int ret = 0;

        for (Character ch : S.toCharArray()){
            if (ch == '('){
                stack.push(ch);
            }else {
                if (!stack.isEmpty()){
                    stack.pop();
                }else {
                    return 0;
                }
            }
        }

        if (!stack.isEmpty()) ret = 0;
        else ret = 1;

        return ret;
    }
}
