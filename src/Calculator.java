import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

            
            int[] input = {1, 2, 3, 4};
            for (var i : input) {
                    System.out.println(i + ":");
                }


        String choose_num = "For addition choose 1, " +
                        "For substraction choose 2, " +
                        "For multiplication choose 3, " +
                        "For division choose 4, " +
                        "0 for Termination: ";
        // System.out.println(choose_num);

        Scanner scan = new Scanner(System.in);
        int user_input;
        int num1, num2;

        while (true) {

                try{
            System.out.println(choose_num);
            System.out.print("Choose (0-4): ");
            user_input = scan.nextInt();

            if (user_input == 0) {
                System.out.println("Terminating the program...");
                break;
            }

            if (user_input >= 1 && user_input <= 4) {
                System.out.print("Enter first number: ");
                num1 = scan.nextInt();
                System.out.print("Enter second number: ");
                num2 = scan.nextInt();

                if (user_input == 1) {
                    System.out.println("You chose Addition.");
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                } else if (user_input == 2) {
                    System.out.println("You chose Substraction.");
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                } else if (user_input == 3) {
                    System.out.println("You chose Multiplication.");
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                } else {
                    System.out.println("You chose Division.");
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
            } else {
                System.out.println("Invalid input, please choose a number between 0 and 4.");
            }

                } catch (Exception e) {
                    System.out.println("Invalid input, please enter a valid number." + "\n");
                    scan.next();
                }
        }

        scan.close();
    }
}