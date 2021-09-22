package day04ComIncrement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //Kullanidan data almak için kullnıyoruz.

        //1.step Scanner classından object create ediyoruz.

        Scanner scan  =new Scanner(System.in);

        //2.step Kullanıcıdan ne istediğini sor

        System.out.println("!!!Lutfen yasinizi giriniz!!!");

        //3.step Kullanıcının verdiği datayı saklamak icin bir variable olusturma

        int age = scan.nextInt();

        System.out.println("age: " + age);

        //4. step scan objesini kapat.
        scan.close();
    }



}
