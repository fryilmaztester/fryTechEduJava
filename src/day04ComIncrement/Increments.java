package day04ComIncrement;

public class Increments {

    public static void main(String[] args) {

        /*
        Increments

        Artırma islemidir.
        Biz artırma islemini ya toplayarak ya da carparak yapabiliriz.

         */

        int i1 = 12;
        System.out.println("i1 = " + i1); //12

        //1. Yol (Cok fazla tercih edilen bir yontem degildir)
        i1 = i1 + 5;
        System.out.println("5 artirilimis i1: " + i1); // 17

        //2.yol
        //i1 += deger şeklinde artırım yapılır.
        i1 += 10;
        System.out.println("i1 e 2. yol ile artirma islemi yapilmisitir:  " + i1); //27

        //3.yol
        //Sadece 1 artırmak istedigimizde kullanilir.
        i1++;
        System.out.println("3.yol ile artirma islemi yapilmistir: " + i1); //28

        int i2  =8;

        //1. yol ile 3 artiriniz
        System.out.println(i2 = i2 + 3);
        //2.yol ile 2 cikartiniz
        System.out.println(i2-=2);
        //3.yol ile artirma islemi yapiniz
        i2++;
        System.out.println(i2);
        System.out.println(++i2);//11





    }
}
