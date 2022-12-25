package patikaJava;

import java.util.Scanner;

public class ChineZodyagıHesaplama {

    /*
        Çin Zodyağı nedir?
        -->4000 bin yıldır kullanılan bir astroloji çeşididir
        Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
        Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı
        bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

        Çin Zodyağı nasıl hesaplanır?

        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        Doğum Tarihi %12 = 0 ➜ Maymun

        Doğum Tarihi %12 = 1 ➜ Horoz

        Doğum Tarihi %12 = 2 ➜ Köpek

        Doğum Tarihi %12 = 3 ➜ Domuz

        Doğum Tarihi %12 = 4 ➜ Fare

        Doğum Tarihi %12 = 5 ➜ Öküz

        Doğum Tarihi %12 = 6 ➜ Kaplan

        Doğum Tarihi %12 = 7 ➜ Tavşan

        Doğum Tarihi %12 = 8 ➜ Ejderha

        Doğum Tarihi %12 = 9 ➜ Yılan

        Doğum Tarihi %12 = 10 ➜ At

        Doğum Tarihi %12 = 11 ➜ Koyun

        Senaryo

        Doğum Yılınızı Giriniz : 1990
        Çin Zodyağı Burcunuz : At
     */
    public static void main(String[] args) {
        int dogumTarihi,chineZodyagi;
        String zodiacH = "";
        Scanner input =new Scanner(System.in);
        System.out.println("lutfen dogum yilinizi giriniz...");
        dogumTarihi=input.nextInt();
        chineZodyagi = dogumTarihi%12;

        switch (chineZodyagi)
        {
            case 0:
                zodiacH = "Maymun";
                break;
            case 1:
                zodiacH = "Horoz";
                break;
            case 2:
                zodiacH = "Kopek";
                break;
            case 3:
                zodiacH = "Domuz";
                break;
            case 4:
                zodiacH = "Fare";
                break;
            case 5:
                zodiacH ="Okuz";
                break;
            case 6:
                zodiacH ="Kaplan";
                break;
            case 7:
                zodiacH ="Tavsan";
                break;
            case 8:
                zodiacH ="Ejderha";
                break;
            case 9:
                zodiacH ="Yilan";
                break;
            case 10:
                zodiacH ="At";
                break;
            case 11:
                zodiacH ="Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz :" + zodiacH);






    }

}
