package Day04;

import java.util.Scanner;


public class Activity03 {

    public static void main(String[] args) {
        printTable(getNumber());
    }

    public static int getNumber(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num : ");
        return sc.nextInt();
    }

    public static void printTable(int n){

        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
