public class CastingExample {   // Use Pascal naming convention

    public static void main(String[] args) {
        castingDemo();
        explicitCasting();
    }

    public static void castingDemo() {
        System.out.println("hello");

        byte byteAge = 30;
        short shortAge = 25;

        shortAge = byteAge;
        System.out.println( shortAge);

        int intValue = 20000;
        long longValue;
        double doubleVal;

        longValue = intValue;       // implicit casting int -> long

        doubleVal = longValue;

        System.out.println(longValue);
        System.out.println(doubleVal);
    }

    public static void explicitCasting(){

        double doubleVal = 22.3434;

        int intVal;

        intVal = (int) doubleVal;
        System.out.println(intVal);

        int val2 = 28828;
        byte val3 = (byte) val2;

        System.out.println(val3);

        short val4 = (short) val2;
    }
}