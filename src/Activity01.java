import java.util.Scanner;

public class Activity01 {

    public static void main(String[] args) {
        marks();
        vote();
        number();
        testNum();
        purchase();
    }

    private static void marks() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks : ");
        int marks = sc.nextInt();

        if (marks >= 50){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    private static void vote() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter vote : ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("Eligible for vote");
        } else {
            System.out.println("not eligible");
        }
    }

    private static void number() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter num : ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    private static void testNum() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter num : ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("Positive");
        } else {
            System.out.println("negative");
        }
    }

    private static void purchase() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount : ");
        int amount = sc.nextInt();

        if (amount > 5000){
            System.out.println("Discount applied");
        } else {
            System.out.println("not discount");
        }
    }
}