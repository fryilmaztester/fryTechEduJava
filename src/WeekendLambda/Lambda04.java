package WeekendLambda;

import jdk.internal.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda04 {

    public static void main(String[] args) {


        List<String> listStr = new ArrayList<>();
        listStr.add("Ali");
        listStr.add("Mark");
        listStr.add("Jackson");
        listStr.add("Jackson");
        listStr.add("Tucker");
        listStr.add("Christ");
        listStr.add("FRY");

        printUpperCaseAllElement(listStr); //ALİ MARK JACKSON JACKSON TUCKER CHRİST FRY
        System.out.println("------------------");
        System.out.println(ddd(listStr));//[ALİ, MARK, JACKSON, JACKSON, TUCKER, CHRİST, FRY]
       // printUpperCaseAllElementWithReplaceAll(listStr);//[ALİ, MARK, JACKSON, JACKSON, TUCKER, CHRİST, FRY]



    }

    //Butun elemanları buyuk yazdırınız
    public static void printUpperCaseAllElement(List<String> list) {

        list.stream().map(t -> t.toUpperCase()).forEach(t -> System.out.print(t + " "));
    }

    public static List ddd(List<String> list){
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    /*
    public static void printUpperCaseAllElementWithReplaceAll(List<String> list){

        list.replaceAll(t->t.toUpperCase()); //replaceAll() btün list i gunceller.
        System.out.println(list);
    }

     */






}
