import java.util.ArrayDeque;
import java.util.Deque;

public class Validator {

    public static boolean validate(String s) {

        Deque<Character> stack = new ArrayDeque<Character>();
        for ( char c : s.toCharArray() ) {
            switch ( c ) {
                case '(' :
                case '[' :
                case '{' :
                    stack.addFirst(c);
                    break;
                case ')' :
                    if ( stack.isEmpty() || ! stack.removeFirst().equals('(') )
                        return false;
                    break;
                case ']' :
                    if ( stack.isEmpty() || ! stack.removeFirst().equals('[') )
                        return false;
                    break;
                case '}' :
                    if ( stack.isEmpty() || ! stack.removeFirst().equals('{') )
                        return false;
                    break;
                default :
                    break;
            }
        }
        return stack.isEmpty();
    }
}

