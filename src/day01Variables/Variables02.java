package day01Variables;

public class Variables02 {



    // Tek satırlık Comment -> Java bunu kod olarak görmez


    /*

    Çok satırlı Commet uygulaması
    Java bunu kod satırı olarak görmez.


     */






    public static void main(String[] args) {

        //Variable Oluşturmak


    /*
    1) Data type yaza
    2) Variable ismi yaz
    3) "=" koy
    4) Değer ataması
    5) ";" koy
     */
        int number = 2362;

        System.out.println("number: " + number); //number: 2362




        /*
        Java da iki tür data type vardır

        1) Primitive data type

        boolean --> true, false  için kullanılır.
        int --> Tam sayılar için kullanılır.
        float --> Ondalık sayılar için kullanılır >> 23.45f, 23.45F
        double --> Ondalık sayılar için kullanlırı >>> 23.45
        long--> Daha çok bilimsel çalışmalarda kullanılır.
        short-->Tam syılar için kullanılır
        byte--->Tam syılar için kullanılır
        char --> Tek karakterler için kullanılır. >>>>> "?, a,  , .... "

        2) non-primitve data type
        String --> Textler ve metinsel ifadeler için kullanılır.



         */

        boolean emekli = false;
        boolean engelli = true;

        System.out.println(emekli); //false
        System.out.println(engelli); //true

        int sayi = 21312;
        int sayi2 = 123123;

        char ch = 'a';

        System.out.println(ch); //a

        char ch01 = ' ';//Boşlukta bir karakterdir.

        //char ch02 = ''; // Yanlış bir kullanımdır.
        //char ch02 = 'ads';  // sıfır ve ya birden fazla karakter kabul etmez

        double piSayisi = 3.14;

        float area = 14.533f;
        float area02 = 14.5343F;
















    }






}
