package Day05;

public class arrayCreation {

    public static void main(String[] args) {

        array(new int[]{11, 22, 33, 44, 55});

        maxVal(new int[]{ 111, 22, 33, 474, 55 });

    }

    public static void array(int[] scores){

        int sum = 0;
        for (int i = 0 ; i < scores.length; i++) {

            sum += scores[i];
        }

//      FOR EACH LOOP

//        for (int score : scores) {
//
//            sum += score;
//        }
//
        System.out.println(sum);
    }

    public static void maxVal(int[] scores){

        int max = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("The maximum value is: " + max);
    }
}