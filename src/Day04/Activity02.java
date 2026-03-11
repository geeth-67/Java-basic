package Day04;

import java.util.Scanner;

public class Activity02 {

    public static void main(String[] args) {
        int first = getSecondNumber();
        int second = getFirstNumber();
        int third = getThirdNumber();
        int results = findMaxNumber(first , second , third);
        displayResult(results);
    }

    public static int getFirstNumber(){

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int getSecondNumber(){

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int getThirdNumber(){

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int findMaxNumber(int a , int b , int c) {
        if (a>b && a>c) return a;
        if (c>a && b>c) return b;
        return c;
    }

    public static void displayResult(int max){
        System.out.println(max);
    }
}
