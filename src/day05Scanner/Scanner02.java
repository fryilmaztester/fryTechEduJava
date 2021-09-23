package day05Scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //1.Step:
        Scanner scan = new Scanner(System.in);

        //2.Step
        System.out.println("Alfabeden bir harf giriniz");

        //3.Step
        char letter = scan.next().charAt(0);

   /*
        String name = "fatih";

        System.out.println(name.charAt(0));//f

    */


        System.out.println("Girilen Harf: " + letter);
        //4.step
        scan.close();
    }
}
