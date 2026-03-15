package Day03;

public class nestedLoop {
    public static void main(String[] args) {
        loop();
        multiply();
    }

    public static void loop() {

        int i = 1;

        while(i <= 4) {
            int j = 1;

            while(j <= i) {
                System.out.print(i);
                j++;
            }

            System.out.println();
            i++;
        }
    }

    public static void multiply(){
        int i = 1;

        while(i <= 2) {
            int j = 1;

            while(j <= 5) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
