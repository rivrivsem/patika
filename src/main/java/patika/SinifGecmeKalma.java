package patika;

import java.util.Scanner;

public class SinifGecmeKalma {
    /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

                    Geçme Notu : 55

        Ödev:
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
     */
    public static void main(String[] args) {

        int math, fizik, turkce,kimya,muzik,alinanDersSayisi=5;

        Scanner input= new Scanner(System.in);

        System.out.println("Matematik notunu giriniz : ");
        math=input.nextInt();
        System.out.println("Fizik notunu giriniz : ");
        fizik=input.nextInt();
        System.out.println("Turkce notunu giriniz : ");
        turkce=input.nextInt();
        System.out.println("Kimya notunu giriniz : ");
        kimya=input.nextInt();
        System.out.println("Muzik notunu giriniz : ");
        muzik=input.nextInt();


        if (math<0 || math>100)
        {
            math=0;
        }
        if(fizik<0 || fizik>100)
        {
            fizik=0;
        }
        if (turkce<0 || turkce>100)
        {
            turkce=0;
        }
        if (kimya<0 || kimya>100)
        {
            kimya=0;
        }
        if (muzik<0 || muzik>100)
        {
            muzik=0;
        }

        double ort= (math+fizik+turkce+kimya+muzik)/alinanDersSayisi;
        if (ort >= 55 && ort <= 100)
        {
            System.out.print("hadi baham sadijjjj gectin Ortalaman = " + ort);
        }
        else if (ort < 55 && ort >= 0)
        {
            System.out.print("Kaldın be sadijjj Ortalaman = " + ort);
        }








    }
}
