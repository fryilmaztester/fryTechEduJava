package WeekendLambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {


    /*
        Lambda is functional programming

        Lambda were added by java 8

        Str. Prog ---> How to do ?
        Func. Prog --> What to do ?  --> Slect and Using


        Pre con:
        --Collections a sahip olmamaız gerekir.


     */

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        System.out.println(list1); // [2, 3, 4, 5, 6]
        printFunct(list1);
        printFunctMeth(list1);
        printEven(list1);
        printBiggerThanThree(list1);
    }

    //Task1: list1 elemanlarını aralarında birer boşluk bırakarak konsola yazdırınız.

    //Lambda Expressions Yontemi
    public static void printFunct(List<Integer> list){

        list.stream().forEach(t-> System.out.print(t + " "));
        System.out.println("-----------");
    }


    /*
    Method Reference

   1) Methodun bulunduğu class
   2) ::
   3) Methodun ismi

     */

    public static void printOne(int num){
        System.out.print(num + " ");
    }

    public static void printFunctMeth(List<Integer> list){
        list.
            stream().
            forEach(Lambda01::printOne);

    }

    //Task02: list1 elemanlarından çift sayi olanlari aynı satıra aralarında birer bosluk oalcak sekilde yazdiriniz.
    public static void printEven(List<Integer> list){

        System.out.println("-------");
        list.
            stream().
             filter(t->t%2==0).
             forEach(t-> System.out.print(t + " "));
    }

     //Task03: list1 elemanlarından 3 ten büyük olan sayilari aynı satıra aralarında birer bosluk oalcak sekilde yazdiriniz.

    public static void printBiggerThanThree(List<Integer> list){

        System.out.println("-------------");
        list.
           stream().
           filter(t->t>3).
           forEach(Lambda01::printOne);//4 5 6
    }





}
