;
import stack.Stack;
import stack.StackImpl;

public class MainClass {

    public static void main(String[] args) {


        String s = "abcdefghijkl";
        System.out.println(reverseString(s));

    }

    public static String reverseString(String s) {
        if (s == null)
            return null;

        Stack<Character> stack = new StackImpl<>(s.length());
        for (Character c : s.toCharArray()
             ) {
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0, size = stack.size(); i < size; i++) {
            sb.append(stack.pop());
        }

        return sb.toString();

    }
}
