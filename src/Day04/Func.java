package Day04;

public class Func {

    public static void main(String[] args) {
        sum(10,29);

        multi(10,29);

        System.out.println(sum2(20,233));
    }

    public static void sum( int a, int b){

       int tot = a + b ;
       System.out.println(tot);

    }

    public static void multi( int a, int b){

        int tot = a * b ;
        System.out.println(tot);

    }
    public static int sum2(int a, int b){

        return  a + b ;

    }
}
