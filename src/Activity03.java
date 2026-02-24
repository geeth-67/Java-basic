import java.util.Scanner;

public class Activity03 {

    public static void main(String[] args) {
        calculator();
    }

    private static void calculator(){

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter num 1 = ");
        int num1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter num 2 = ");
        int num2 = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter Operation = ");
        String operation = sc3.nextLine();

        int numbers;

        switch (operation){
            case "+" :
                numbers = num1 + num2;
                System.out.println(numbers);
                break;

            case "-":
                numbers = num1 - num2;
                System.out.println(numbers);
                break;

            case "*":
                numbers = num1 * num2;
                System.out.println(numbers);
                break;

            case "/":
                numbers = num1 / num2;
                System.out.println(numbers);
                break;

            default:
                System.out.println("Unexpected");
        }
    }
}
