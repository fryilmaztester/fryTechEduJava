package WeekendLambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda03 {


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(3);
        list1.add(14);
        list1.add(5);
        list1.add(11);
        list1.add(6);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(10);

        sortedNatural(list1);
        System.out.println("--------------");
        sortedNanNatural(list1);
        System.out.println("-----------------");
        System.out.println(greaterThanFour(list1));
        System.out.println("-----------------");
        System.out.println(greaterThanFourSet(list1));

    }


    //Natural Order a göre sıralıyınız.

    public static void sortedNatural(List<Integer> list){

        list.
           stream().
           sorted().//Bu method natural order a göre sıralar
           forEach(t->System.out.print(t + " ")); //1 2 3 3 4 5 6 9 9 9 10 11 14

    }

    //NanNatural Order a göre sıralıyınız.
    public static void sortedNanNatural(List<Integer> list){

        list.
            stream().
            sorted(Comparator.reverseOrder()).
            forEach(t->System.out.print(t + " "));//14 11 10 9 9 9 6 5 4 3 3 2 1

    }


    //4 ten büyük olan sayıları başka bir list in içine yazdırıalım birer tane
    public static List greaterThanFour(List<Integer> list){

        return list.stream().
                        filter(t->t>4).
                        sorted().
                        distinct().///tekrar eden elemanları çıkartıyor.
                        collect(Collectors.toList());//[14, 5, 11, 6, 9, 10]
    }

    public static Set greaterThanFourSet(List<Integer> list) {
        return list.stream().
                filter(t -> t > 4).
                collect(Collectors.toSet()); //[5, 6, 9, 10, 11, 14]
    }




}
