package patika;

import java.util.Scanner;

public class TekSayilarinToplaminiBul {

    public static void main(String[] args) {

        /*
        !!!Ödev!!!
    ==> Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */

        Scanner scan = new Scanner(System.in);
        int sayi, sum = 0, sum2 = 0;

        do {
            System.out.print("lutfen bir sayi giriniz.");
            sayi = scan.nextInt();

            if (sayi % 2 == 0)
            {
                sum += sayi;
            }
            if (sayi % 4 == 0)
            {
                sum2 += sayi;
            }

        } while (sayi % 2 == 0);

        System.out.println("cift sayilarin toplami :" + sum);
        System.out.println("dordun katlari toplami :" + sum2);

        scan.close();
    }

}
