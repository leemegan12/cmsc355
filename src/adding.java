import java.util.Scanner;

public class adding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We will add two numbers. Let's see if we get the same answer.");

        System.out.print("Give me a first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Give me a second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.print("Give me your answer: ");
        int userAnswer = scanner.nextInt();

        if (userAnswer == sum){
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

        scanner.close();
    }
}
