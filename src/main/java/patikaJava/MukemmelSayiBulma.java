package patikaJava;

import java.util.Scanner;

public class MukemmelSayiBulma {
    /*
    Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve
    sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
    ifadelerini ekrana yazan programı Java dilinde yazınız.

        Mükemmel Sayı Nedir ?
        Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
        toplamı kendisine eşit olan sayıya mükemmel sayı denir.

        Senaryolar
        Bir sayı giriniz: 28
        28 Mükemmel sayıdır
        Bir sayı giriniz: 1
        1 Mükemmel sayı değildir.
        Bir sayı giriniz: 496
        496 Mükemmel sayıdır
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz misiniz mi : ");
        int sayi = input.nextInt();

        int sum = 0;
        for (int i = 1; i < sayi; i++)
        {
            if (sayi % i == 0)
            {
                sum += i;
            }
        }

        if (sum == sayi)
        {
            System.out.println(sayi + " mikiimmel bir sayıdır");
        }
        else
        {
            System.out.println(sayi + " mikimmel sayı değildir");
        }

        input.close();

        //cok mikimmill bir urrniikkkmis :)
    }
}
