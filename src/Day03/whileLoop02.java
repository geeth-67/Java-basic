package Day03;

import java.util.Scanner;

public class whileLoop02 {
    public static void main(String[] args) {
//        number();
//        sumCal();
        reverseLoop();
    }

    public static void number (){
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter 0 to stop");

        number = sc.nextInt();

        while (number != 0){
            System.out.println("You entered: " + number);
            number = sc.nextInt();

        }

        System.out.println("loop Ended");
    }

    public static void sumCal() {
        int i = 1;
        int sum = 0;

        while (i <= 50) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }

    public static void reverseLoop(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}
