import java.util.Scanner;

public class Main {
    public static int calculator() {
        Scanner scanner = new Scanner(System.in);
        int input;
        String op;
        int[] numbers;
        String[] operations;
        int amount;
        int answer = 0;

        System.out.println("How many numbers do you want to enter?");
        amount = scanner.nextInt();
        numbers = new int[amount];
        operations = new String[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter operation: (+, -, *, /, =)");
            op = scanner.next();
            operations[i] = op;

            System.out.println("Enter number: ");
            input = scanner.nextInt();
            numbers[i] = input;
        }

        for (int i = 0; i < amount; i++) {
            if (operations[i].equals("=")) {
                answer = numbers[i];
            } else if (operations[i].equals("+")) {
                answer += numbers[i];
            } else if (operations[i].equals("-")) {
                answer -= numbers[i];
            } else if (operations[i].equals("*")) {
                answer *= numbers[i];
            } else if (operations[i].equals("/")) {
                answer /= numbers[i];
            } else {
                System.out.println("ERROR Invalid operation: " + operations[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yn;

        do {
            int answer = Main.calculator();
            System.out.println(answer);

            System.out.println("Another calculation? Y/N");
            yn = scanner.next();
        } while (yn.equals("y") || yn.equals("Y"));
    }
}