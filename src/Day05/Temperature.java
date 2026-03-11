package Day05;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        welcome();

        System.out.println("1.  to covert Celsius to Fahrenheit press 1" );

        System.out.println( "2.  to covert Fahrenheit to Celsius press 2");

        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();

        if (option == 1){
            System.out.println("Enter Your Celsius Temperature :");
            Scanner input = new Scanner(System.in);
            float temp = input.nextFloat();
            System.out.println(temp + celsiusToFahrenheit(temp));

        } else if (option ==2){
            System.out.println("Enter Your Fahrenheit Temperature :");
            Scanner input = new Scanner(System.in);
            float temp = input.nextFloat();
            System.out.println(temp + FahrenheitCelsiuses(temp));

        }else{
            System.out.println("Invalid input");
        };



    }
    public static void welcome(){

        System.out.println("Welcome to Temp convertor ");
    }

    public static float celsiusToFahrenheit (float temp ){

        return (temp * 9/5) + 32;

    }

    public static float FahrenheitCelsiuses(float temp ){

        return (temp -32) *5/9 ;

    }
}