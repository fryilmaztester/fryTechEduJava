package day05Scanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");

        scan.nextInt(); //nextInt() metodu kullanıcıdan int bir deger alındığı zaman kullanılır.

        scan.close();

 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Isminizi Giriniz");

       // String name = scan.nextLine(); // next();

        String name = scan.next();

        System.out.println("Isminiz: " + name);

        /*
        Data type ı String oldugu zaman nextLine() ve next() metodu ile veriyi alabiliriz.
        Ama next() metodu yalnızca ilk kelimeyi alır
        nextLine() metodu ise bütün string ifadeyi alır.

         */
scan.close();

    }
}
