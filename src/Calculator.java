import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        String choose_num = "For addition choose 1, " +
                "For substraction choose 2, " +
                "For multiplication choose 3, " +
                "For division choose 4: ";
        System.out.println(choose_num);

        int[] input = {1, 2, 3, 4};
//        for (var i : input) {
//            System.out.println(i + ":");
//        }

        int user_input;
        Scanner scan = new Scanner(System.in);
        user_input = scan.nextInt();
//        System.out.println("You choose " + user_input + ": ");

        int num1, num2;
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scan1.nextInt();

        System.out.print("Enter second number: ");
        num2 = scan1.nextInt();

//        System.out.print("Enter first number: ");
//        System.out.println(num1);
//
//        System.out.print("Enter second number: ");
//        System.out.println(num2);


        switch (user_input) {

            case 1:
//                int input1, input2;
//                input1 = scan.nextInt();
//                input2 = scan.nextInt();
//
//                System.out.print("Enter first number: ");
//                System.out.println(input1);
//                System.out.print("Enter second number: ");
//                System.out.println(input2);
                System.out.println("You chose addition");
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;


            case 2:
//                int input3, input4;
//                input3 = scan.nextInt();
//                input4 = scan.nextInt();
//
//                System.out.print("Enter first number: ");
//                System.out.println(input3);
//                System.out.print("Enter second number: ");
//                System.out.println(input4);
                System.out.println("You chose substraction");
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case 3:
//                int input5, input6;
//                input5 = scan.nextInt();
//                input6 = scan.nextInt();
//
//                System.out.print("Enter first number: ");
//                System.out.println(input5);
//                System.out.print("Enter second number: ");
//                System.out.println(input6);
                System.out.println("You chose multiplication");
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;

            case 4:
//                int input7, input8;
//                input7 = scan.nextInt();
//                input8 = scan.nextInt();
//
//                System.out.print("Enter first number: ");
//                System.out.println(input7);
//                System.out.print("Enter second number: ");
//                System.out.println(input8);
                System.out.println("You chose division");
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
        }
    }
}
