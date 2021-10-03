package day05Scanner;

import java.util.Scanner;

public class Scanner06 {

    /*
    Kullanıcıdan dört basamaklı bir sayı alınız. Sayını ilk ve son rakamının toplamını yazdırınız.

    Output:
    İlk Rakam: 2
    Son Rakam: 4
    İlk Rakam
     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = scan.nextLine().replace(" ", "").toUpperCase();


        System.out.println(s1);

        if (s1.length() == 3) {
            if (s1.charAt(0) == s1.charAt(2) && s1.charAt(1) == s1.charAt(1) && s1.charAt(2) == s1.charAt(0)) {
                System.out.println("Palindrome");
            } else {
            }
            System.out.println("Not palindrome");
        } else {
            if (s1.charAt(0) == s1.charAt(s1.length() - 1)) {
                System.out.println("Like palindrome");
            } else {
                System.out.println("Not like palindrome");
            }
        }
        scan.close();

    }


}
