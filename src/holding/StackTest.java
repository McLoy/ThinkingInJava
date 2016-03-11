package holding;

import net.mindview.util.Stack;

/**
 * Created by Ostin on 16.11.2015.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (String s: "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.empty())
            System.out.println(stack.pop() + " ");
    }
}
