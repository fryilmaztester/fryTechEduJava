package WeekendLambda;

import java.util.ArrayList;
import java.util.List;

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

    }


    //Natural Order a göre sıralıyınız.

    public static void sortedNatural(List<Integer> list){

        list.
                stream().
                sorted().
                forEach(t->System.out.print(t + " "));
    }
}
