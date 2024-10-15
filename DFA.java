import java.util.Scanner;

public class DFA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String state = "q0";
        String input;

        System.out.print("Please enter your string: ");
        input = sc.nextLine();

        for (int x = 0; x < input.length(); x++) {
            char currentChar = input.charAt(x);

            switch (state) {
                case "q0":
                    if (currentChar == '0') {
                        state = "q1";
                    } else {
                        state = "q0";
                    }
                    break;
                case "q1":
                    if (currentChar == '0') {
                        state = "q1";
                    } else {
                        state = "q2";
                    }
                    break;
                case "q2":
                    if (currentChar == '0') {
                        state = "q1";
                    } else {
                        state = "q0";
                    }
                    break;
            }
        }
        if (state.equals("q2")) {  
            System.out.println("String is accepted");
        } else {
            System.out.println("String is not accepted");
        }
        sc.close();
    }
}