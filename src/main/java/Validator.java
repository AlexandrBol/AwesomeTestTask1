import java.util.Scanner;

public class Validator {

    public static boolean validate(String s) {
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        boolean result = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                counter1++;
            } else if (s.charAt(i) == ')') {
                counter1--;
            }
            if (s.charAt(i) == '[') {
                counter2++;
            } else if (s.charAt(i) == ']') {
                counter2--;
            }
            if (s.charAt(i) == '{') {
                counter3++;
            } else if (s.charAt(i) == '}') {
                counter3--;
            }
        }

        if ((counter1 == 0) && (counter2 == 0) && (counter3 == 0)) {
            System.out.println("String correct");
            return true;

        } else {
            System.out.println("String incorrect");
            return false;
        }
    }
}

