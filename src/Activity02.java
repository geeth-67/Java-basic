import java.util.Scanner;

public class Activity02 {

    public static void main(String[] args) {
        person();
        Grade();
    }

    private static void person (){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur Age : ");
        int age = sc.nextInt();

        if (age <= 13){
            System.out.println("Child");
        } else if (age <= 18) {
            System.out.println("teenager");
        } else if (age <= 60) {
            System.out.println("adult");
        } else {
            System.out.println("Senior");
        }

    }

    private static void Grade(){

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
    }
}
