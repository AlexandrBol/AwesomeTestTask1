import java.util.Scanner;

public class App {
    public static String getString() {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String: ");
        s = sc.nextLine();
        sc.close();
        return s;
    }

    public static void main(String[] args) {

        Validator.validate(getString());
    }
}
