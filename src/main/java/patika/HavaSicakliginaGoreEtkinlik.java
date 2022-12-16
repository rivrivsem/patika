package patika;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("bugunun hava sicaklik derecesini giriniz...");
        double derece=input.nextDouble();
        
        if (derece<5 && derece>-20)
        {
            System.out.println("kayak yapabilirsin");
        }
        else if (derece>5 && derece<16)
        {
            System.out.println("Sinema guzel fikir olabilir...");
        }
        else if (derece>15 && derece<26)
        {
            System.out.println("cikar mangalii cikarr... piknige gidiyoruz");
        } else if (derece>25 && derece<50)
        {
            System.out.println("Yüzmek guzel fikir olabilir...");
        }else
        {
            System.out.println("bahhh isine kardisiimm bu derecede birsey yapilmaz,hayatta kalmaya cali$ :))");
        }

    }
}
