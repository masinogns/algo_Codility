import java.util.Stack;

/**
 * Created by masinogns on 2017. 8. 20..
 */
public class eee {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        stack.push('(');
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());

        stack.pop();
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());
    }
}
