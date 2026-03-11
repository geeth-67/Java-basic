package Day04;

import java.util.Scanner;


public class Activity01 {
    public static void main(String[] args) {
        displaySum(sumNaturalNumber(getNumber()));
    }

    public static int getNumber(){

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int sumNaturalNumber(int n){
        int sum = 0;
        for(int i = 1; i <= n ; i ++){
            sum += i;
        }
        return sum;
    }

    public static void displaySum(int sum){
        System.out.println(sum);
    }
}