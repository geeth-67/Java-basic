import java.util.Scanner;

public class javaStar2 {
    public static void main(String[] args) {
        pattern();
    }

    private static void pattern() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur Rows : ");
        int rows = sc.nextInt();

        System.out.println("Enter ur columns : ");
        int columns = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}