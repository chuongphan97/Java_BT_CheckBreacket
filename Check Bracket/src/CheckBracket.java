import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expression: ");
        String str = sc.nextLine();
        String[] strArr = str.split("");

        Stack<String> result = new Stack<>();

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("(")) {
                result.add("(");
            }
            if (result.size() != 0 && strArr[i].equals(")")) result.pop();
            else if (result.size() == 0 && strArr[i].equals(")")) result.add("1");
        }

        if (result.isEmpty()) System.out.println("Well");
        else System.out.println("Bad");



    }
}
