package patika;

import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        /*
            Not Ortalaması Hesaplayan Program
            Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
             ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

            Ödev:
              Aynı program içerisinde koşullu ifadeler kullanılarak,
              eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
              küçük ise "Sınıfta Kaldı" yazsın.

            Not : If ve Else kullanılmayacak...
         */
int math,fizik,kimya,turkce,tarih,muzik;
        Scanner input =new Scanner(System.in);
        System.out.println("Math notunuzu giriniz: ");
        math = input.nextInt();
        System.out.println("fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.println("tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.println("muzik notunuzu giriniz: ");
        muzik = input.nextInt();

        int sum=math+fizik+kimya+turkce+tarih+math+muzik;
        String ort = sum/6>60 ? "Sinifi gecti" : "sinifta kaldi";
        System.out.println(ort+ " hadi baham");

    input.close();
    }

}
