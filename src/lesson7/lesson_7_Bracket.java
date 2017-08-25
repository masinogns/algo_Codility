package lesson7;

import java.util.Stack;

/**
 * Created by masinogns on 2017. 8. 20..
 */

public class lesson_7_Bracket {
    int solution(String S){
        Stack<Character> stack = new Stack<>();
        int ret = 0;

        for (Character character : S.toCharArray()){
            if (character == '('){
                stack.push(character);
            }else if (character == ')'){
                if (stack.isEmpty()){
                    return 0;
                }else {
                    if (stack.peek() == '(')
                    stack.pop();
                    else return 0;
                }
            }

            else if (character == '['){
                stack.push(character);
            }else if (character == ']'){
                if (stack.isEmpty()){
                    return 0;
                }else {
                    if (stack.peek() == '[')
                        stack.pop();
                    else return 0;
                }
            }

            else if (character == '{'){
                stack.push(character);
            }else if (character == '}'){
                if (stack.isEmpty()){
                    return 0;
                }else {
                    if (stack.peek() == '{')
                        stack.pop();
                    else return 0;
                }
            }

        }

        if (stack.isEmpty()) ret = 1;
        else ret = 0;

        return ret;
    }
}
