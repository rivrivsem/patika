package patikaJava;

import java.util.Scanner;

public class TaksimetreHesaplama {
    /*
        Taksimetre Programı
    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
     */
    public static void main(String[] args) {

        double km,tutar=2.20;
        int acilisUcreti = 10, minMiktar=20;
        Scanner scan =new Scanner(System.in);
        System.out.println("kac km gidildi...");
        km=scan.nextDouble();
        double taxiUcret= acilisUcreti+(km*tutar);

        if (taxiUcret<20)
        {
            System.out.println("tutar = " + minMiktar);
        }else
        {
            System.out.println("taxiUcret = " + taxiUcret);
        }
        scan.close();



    }
}
