package holding;

/**
 * Created by Ostin on 16.11.2015.
 */
import net.mindview.util.*;

public class StackCollision {
    public static void main(String[] args) {
        net.mindview.util.Stack<String> stack = new net.mindview.util.Stack<String>();
        for (String s: "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.empty())
            System.out.println(stack.pop());
        System.out.println();
        java.util.Stack<String> stack2 = new java.util.Stack<String>();
        for (String s: "my dog has fleas".split(" "))
            stack2.push(s);
        while (!stack.empty())
            System.out.println(stack2.pop());
    }
}
