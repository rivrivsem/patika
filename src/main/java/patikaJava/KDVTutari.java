package patikaJava;

import java.util.Scanner;

public class KDVTutari {
    /*
          Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını
           hesaplayıp ekrana bastıran programı yazın.

        (Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 11.8;

        KDV tutarı = 1.8;

        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
             */
    public static void main(String[] args) {

        int miktar;
        Scanner scan =new Scanner(System.in);
        System.out.println("islem yapmak istediginiz miktari giriniz...");
        miktar=scan.nextInt();
        System.out.println("KDV siz miktar = "+ miktar);
        if (miktar>0 && miktar<=1000)
        {
            double value =miktar * 1.18;
            System.out.println("KDV li miktar ="+value+"\n"+"KDV tutarı ="+(value-miktar));
        }
        else if (miktar>1000) {
            double value2= miktar*1.08;
            System.out.println("KDV li miktar ="+value2 +"\n"+"KDV tutarı ="+(value2-miktar));

        }
        else
        {
            System.out.println("gecerli tutar giriniz...");
        }

        scan.close();
    }
}
