package day02Wrapper;

public class Wrapper {


    public static void main(String[] args) {


        char ch = 'a';
        char ch01 = 'A';

        System.out.println(ch);//a
        System.out.println(ch01);//A

        System.out.println(ch+ch01);// ASCII Table da ki değerleri oalcaktır. 162

        System.out.println(ch > ch01); // true


        // 'a' nın ASCII Table değerini nasıl buluruz.
        char ch02 = 'a';
        System.out.println(ch02 + 0); //97


        //Primitive data type larının küçüktüen büyüğe sıralanması

        //byte < short < int < long < float < double

        /*

        Her primitve data type ın Wrapper class ı üretilmiştir.

        int --> Integer
        short --> Short
        double --> Double
        boolean --> Boolean
        long --> Long
        char --> Character
        byte --> Byte

         */


        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt); //2147483647


        //String tc = "12345678908";
        //Integer.parseInt(tc);

        int a = 5;
        int b = 2;

        System.out.println(a/b); //2.5..... -->>>> 2

        int c = 5;
        double d = 2;
        System.out.println("c/d: " + c/d); //2.5

        double f = 32;
        double e = 3;

        double result = f/e;
       // String.valueOf(result).charAt();
















    }
}
