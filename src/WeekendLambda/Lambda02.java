package WeekendLambda;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.List;

public class Lambda02 {


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(9);
        list1.add(10);

        sqrAllElement(list1);
        printOddSqr(list1);
        System.out.println(printSum(list1));
        System.out.println(printSumWithInt(list1));
        System.out.println(maksElement(list1));



    }

    //Task05: list1 in içerinde bulunan her elamnın karesini alıp konsola aynı satırda aarlarında birer boşluk olacak şekilde yazıdırınız

    public static void sqrAllElement(List<Integer> list){

        list.
           stream().
           map(t->t*t).
           forEach(Lambda01::printOne);

    }

    //list1 de bulunan elemntlerden tek sayi olanalrin karesini alarak ayni satira aralarinda birebosluk oalcak sekilde yazdirniz.
    public static void printOddSqr(List<Integer> list){

        System.out.println("---------------------");
        list.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(Lambda01::printOne);

        System.out.println("----------------------");
    }

    //list1 elemanlarinin toplamlarini bulunuz.

    public static int printSum(List<Integer> list){

        return list.
                stream().
                reduce(0,(x,y)->x+y);


    }

    public static int printSumWithInt(List<Integer> list){

        return list.
                stream().
                reduce(0,Integer::sum);


    }

    //list1 icinde maksimum elamanı bulunuz
    public static int maksElement(List<Integer> list){

        return list.
                stream().
                reduce(Integer.MIN_VALUE,(x,y)-> x > y ? x : y); //10
    }










}
