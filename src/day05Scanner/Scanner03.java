package day05Scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        /*

        Kullanıcıdan bir dikdörgenin kenar uzunluklarını alınız
        Diktörgenin alanını hesaplayınız
        Dikdörtgenin çevresini hesaplayınız.

        Output:
        Alan: 12
        Çevre: 14

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdörgenin uzun kenarini giriniz :");
        int uzun = scan.nextInt();
        System.out.println("uzun kenar: " + uzun);

        System.out.println("Lutfen dikdörgenin kisa kenarini giriniz :");
        int kisa = scan.nextInt();
        System.out.println("kisa kenar: " + kisa);


       // System.out.println("alan = kisa*uzun :");//alan = kisa*uzun :
        System.out.println("alan: " + (kisa*uzun));//alan: 12
        System.out.println("cevre: " + ((2*kisa) + (2*uzun)));

        scan.close();


    }
}
