public class javaStar {

    public static void main(String[] args) {
        pattern();
        System.out.println();
        triangle();
        System.out.println();
        triangle2();
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
}