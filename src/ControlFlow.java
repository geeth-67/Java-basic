import java.util.Scanner;


public class ControlFlow {

    public static void main(String[] args) {
        //ageIdentifier();
        controlFlowExample();
    }

    private static void controlFlowExample(){

        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        String grade;

        if (mark >= 75){
            grade = "A";
        }

        else if (mark >= 65){
            grade = "B";
        }

        else if (mark >= 55){
            grade = "C";
        }

        else if (mark > 35){
            grade = "S";
        }
        else {
            grade = "F";
        }

        System.out.println("Your Grade is "+ grade);


        switch (grade){
            case "A":
                System.out.println("Chocolate Box");
                break;

            case "B":
                System.out.println("Chocolate");
                break;
            case "C":
                System.out.println("Choco");
                break;

            case "S":
                System.out.println("Box");
                break;
            case "F":
                System.out.println("Be");
                break;
            default:
                System.out.println("Unexpected");
        }

        for (int i = 0; i <= 10; i ++){
            System.out.println(i);
        }
        int i = 0;

        while (i < 10){
            System.out.println(i);
            i ++ ;
        }
    }

    private static void ageIdentifier() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Age - : ");

        int x = scanner.nextInt();
        System.out.println("Entered number = " + x);

        if (x > 50){
            System.out.println("You are and Older");
        }
        else if (x > 18){
            System.out.println("You are and Adult");
        }
        else {
            System.out.println("You are and Child");
        }
    }
}