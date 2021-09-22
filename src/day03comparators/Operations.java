package day03comparators;

public class Operations {

    public static void main(String[] args) {

        //Operations

        int harf = 'a';
        System.out.println(harf); //ASCII Table Value ---> 97

        int harf2 = '?';
        System.out.println(harf2); //ASCII Table VALUE --->> 63


        //Java da matematiksel İşlemler --> Java matematik biliyor

        System.out.println(3 + 4); //7
        System.out.println(5/1); //5

        int a = 3;
        int b = 6;
        int c = 8;


        System.out.println(a+b); //11

        // int, int bir değere böldüğümüz zaman sonuç her zaman int çıkar. Java bu durumda yuvarlama işlemi yapmaz.

        System.out.println(c/a); //2


        /*
        İşlem Önceliği
        1) Parantez içi işlemler
        2) Çarpma ve bölme İşlemleri
        3) Toplama ve çıkarma İşlemleri
         */


        System.out.println(a + (b - c)); //1
        System.out.println(b - (c - 2 * b)/2);//8


        //Farklı data typelar ile matematiksel işlemler yapıldığınca sopnuç her zaman büyük olan
        //data type a göre verilir

        //byte<short<int<long<float<double

        System.out.println("=============================");

        int f = 4;
        double g = 10;

        System.out.println(g / f); //2.5

        //Modulus İslemi : Kalan bulma işlemi
        //İki sayının bir birine bölümünden kalanı bulmak için kullanırız.

        //Java da modulus işleminin sembolu ---> % işaretidir

        System.out.println("MODULUS ORNEKLERİ");
        System.out.println(15%3); //0
        System.out.println(15%2); //1
        // Eğer sonuc 1 ise TEK Sayı , 0 ise Çift sayı dır

        //Matematikte eşittir demek için "="
        //Java da eşittir demek "=="


        /*
        Concetanation --> Birleştirme İşlemi
         */

        String name = "Fatih";
        String sName = "Yılmaz";

        System.out.println(name + " " + sName); // Fatih Yılmaz

        //Concetanation her zaman string bir ifadedir. Matemekatiksel işlem olmaz.
        //Sembolu "+" dır.

        //Stringler de matematiksel işlem yapılmaz.

        int h = 2;
        int j = 3;
        String str = "java";

        System.out.println(str + h + j); //java23
        System.out.println(str + (j-h)); //java1


        //h, j ve str variable larını kullanarak 61java-1 yazdırınız

        System.out.println((h*j)+""+(j-h)+str+(h-j)); //61java-1
        System.out.println();

    }
}
