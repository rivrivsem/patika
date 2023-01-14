package patikaJava;

import java.util.Arrays;
import java.util.Scanner;

public class MinVeMaxaEnYakinSayi {

    /*
            Ödev
        Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve
         en büyük en yakın sayıyı bulan programı yazınız.

        Dizi : {15,12,788,1,-1,-778,2,0}
        Girilen Sayı : 5
        Girilen sayıdan küçük en yakın sayı : 2
        Girilen sayıdan büyük en yakın sayı : 12
     */

        public static void main(String[] args) {

                int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
                Scanner input = new Scanner(System.in);
                System.out.print("sayiyi giriniz: ");
                int girilenSayi = input.nextInt();

                int kucugeYakin = Integer.MIN_VALUE;
                int buyugeYakin = Integer.MAX_VALUE;

                for (int number : numbers)
                {
                    if (number < girilenSayi)
                    {
                        kucugeYakin = Math.max(kucugeYakin, number);
                    }
                    else if (number > girilenSayi)
                    {
                        buyugeYakin = Math.min(buyugeYakin, number);
                    }
                }

                System.out.println("kucuge en yakin sayi : " + kucugeYakin);
                System.out.println("buyuge en yakin sayi : " + buyugeYakin);



        }
    }


