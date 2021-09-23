package day05Scanner;

import java.awt.*;
import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Kenar uzunlukları kullanıcıdan alınan bir ücgenin cevresini hesaplayınız.
        //Data type byte olacaktır.
        //Output:
        //Ucgenin Cevresi: 12


        Scanner scan  =new Scanner(System.in);

        /*
        System.out.println("1. kenari giriniz :");
        int birinci = scan.nextByte();
        System.out.println("2.kenari kenari giriniz :");
        int ikinci = scan.nextByte();
        System.out.println("3.kenari kenari giriniz :");
        int ücüncü = scan.nextByte();
        System.out.println("cevre = " +(birinci+ikinci+ücüncü));

         */
        System.out.println("Ucgenin kenar uzunluklarini giriniz: ");

        byte a = scan.nextByte();
        byte b = scan.nextByte();
        byte c = scan.nextByte();

        int cevre = a + b + c; //Eger cevrenin degeri byte in disina cikarsa diye int data type ını kullandık.

        System.out.println("Ucgenin Cevresi: " + cevre);

scan.close();


    }
}
