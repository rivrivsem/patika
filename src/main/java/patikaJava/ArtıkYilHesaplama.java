package patikaJava;

import java.util.Scanner;

public class ArtıkYilHesaplama {

    /*
            Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.


        Artık Yıl Nasıl Hesaplanır?

        Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

        1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

        Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
        Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni,
         bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.

        Senaryo

        Yıl Giriniz : 2020
        2020 bir artık yıldır !


        Yıl Giriniz : 2021
        2021 bir artık yıldır değildir !
     */

    public static void main(String[] args) {
        int yil;
        Scanner scan = new Scanner(System.in);
        System.out.println("bir yil giriniz");
        yil=scan.nextInt();

        if (yil%100==0)
        {
            if (yil%400==0)
            {
                System.out.println("girdiginiz yil "+ yil+ " artik yildir");
            }
            else
            {
                System.out.println("girdiniz yil " + yil + " artik yil degildir");
            }
        }
        else if (yil%4==0)
        {
            System.out.println("girdiginiz yil "+ yil+ " artik yildir");
        }else
        {
            System.out.println("girdiniz yil " + yil + " artik yil degildir");
        }


        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }

        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }
//

//

//        for (int i = 1; i <= 2; ++i) {
//            for (int j = 1; j < 4; ++j) {
//                if (i == 1) continue;
//                System.out.print(i + j);
//            }
//        }
    }
}
