package patikaJava;

public class PalindromSayilar {

    /*
        Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

    Palindrom Sayı Nedir ?
    Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

        Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     */

    public static void main(String[] args) {
        System.out.println(isPolindrom(2442));

    }

    static boolean isPolindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {

            lastNumber = temp % 10;
            //System.out.println("son basamak = " + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            //System.out.println("yeni ters sayi = " + reverseNumber);

            temp/=10;
            //System.out.println("yeni temp = " + temp);
        }

        if (number==reverseNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}








