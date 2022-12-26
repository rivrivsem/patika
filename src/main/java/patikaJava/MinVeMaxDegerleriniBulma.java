package patikaJava;

import java.util.Scanner;

public class MinVeMaxDegerleriniBulma {
    /*
        Java ile klavyeden girilen N tane sayma sayısından
        en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

        Senaryo
        Kaç tane sayı gireceksiniz: 4
        1. Sayıyı giriniz: 16
        2. Sayıyı giriniz: -22
        3. Sayıyı giriniz: -15
        4. Sayıyı giriniz: 100
        En büyük sayı: 100
        En küçük sayı: -22
     */
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("kaç tane sayı gireceksiniz gire misiniz : ");
            int n = input.nextInt();

            int enByk = Integer.MIN_VALUE;
            int enKck = Integer.MAX_VALUE;

            for (int i = 1; i <= n; i++)
            {
                System.out.print(i + ". sayıyı giriniz: ");
                int sayi = input.nextInt();


                if (sayi > enByk)
                {
                    enByk = sayi;
                }
                if (sayi < enKck)
                {
                    enKck = sayi;
                }
            }

            System.out.println("En büyük sayı: " + enByk);
            System.out.println("En küçük sayı: " + enKck);

            //yippi yippi kihkihkih nihnihnih :)))
            input.close();
        }
    }


