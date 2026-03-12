package Day02;

public class javaStar {

    public static void main(String[] args) {
        pattern();
        System.out.println();
        triangle();
        System.out.println();
        triangle2();
        System.out.println();
        pyramid();
        System.out.println();
        invertedPyramid();
        System.out.println();
        diamond();
    }

    private static void pattern(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangle(){
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangle2(){
        for(int i = 5; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramid(){
        int n = 5;

        for(int i = 1; i <= n; i++) {

            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void invertedPyramid() {
        int n = 5;

        for(int i = n; i >= 1; i--) {

            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void diamond() {
        int n = 5;

        // Top pyramid
        for(int i = 1; i <= n; i++) {

            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom inverted pyramid
        for(int i = n-1; i >= 1; i--) {

            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}