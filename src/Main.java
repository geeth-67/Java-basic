public class Main {

    public static void test() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        test();    // calling method test

        //Primitive data types

        byte byteSizeNumber = 12;
        short shortSizeNumber = 20000;
        int LargeNumber = 200000;
        long VeryLongNumber = 20000000000000000L;

        System.out.println(byteSizeNumber);
        System.out.println(shortSizeNumber);
        System.out.println(LargeNumber);
        System.out.println(VeryLongNumber);

        //Decimal primitive datatypes

        float floatingDecimalNumber = 2.43f;
        double preciseDecimalNumber = 3.23232323232323232323;

        boolean isHoliday = false;
        char singleCharacter = 'A';

        System.out.println(floatingDecimalNumber);
        System.out.println(preciseDecimalNumber);
        System.out.println(isHoliday);
        System.out.println(singleCharacter);


        String institute= "C-Clarke";
        System.out.println(institute);

        //Arithmetic operators

        int x = 42;
        int y = 33;

        System.out.println("addition -" + (x + y));
        System.out.println("subtraction -" + (x - y));
        System.out.println("multiplication -" + (x * y));
        System.out.println("division -" + (x / y));
        System.out.println("modulus -" + (x % y));

        //Comparison operator

        System.out.println("Greater than " + (x > y));
        System.out.println("Less than " + (x < y));
        System.out.println(" == " + (x == y));
        System.out.println("Not equal " + (x != y));

        //Logical operator

        boolean firstCondition = true;
        boolean secondCondition = false;

        System.out.println("AND Operator" + (firstCondition && secondCondition));
        System.out.println("OR Operator" + (firstCondition || secondCondition));
        System.out.println("NOT Operator" + !firstCondition);

        //Increment/Decrement operators

        int val = 5;
        int val2 = 6;

        System.out.println("Pre increment " + ++val);
        System.out.println("Pre decrement " + --val2);

        int cal1 = 10;
        int cal2 = 20;

        System.out.println("post increment " + cal1++);
        System.out.println("post decrement " + cal2--);
        System.out.println(cal1);
        System.out.println(cal2);
    }
}