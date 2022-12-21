package patika;

import java.util.Scanner;

public class GirilenSayiyaKadarCiftSayi {
    /*
            Java döngüler ile kullanıcının girdiği sayıya kadar çift olan
            sayıları bulan programı yazıyoruz.

           */
    public static void main(String[] args) {
        int sayi;
        Scanner scan =new Scanner(System.in);
        System.out.println("pozitif bir sayi giriniz");
        sayi=scan.nextInt();
        for (int i =0 ; i<=sayi;i++)
        {
            if (i%2==0)
            {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
           /*
          Ödev
            Java döngüler ile 0'dan girilen sayıya kadar
            olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
             */
        System.out.println("=============================");

        int k;

        System.out.println("Sayi giriniz : ");
        k = scan.nextInt();

        double sum=0;
        int cnt=0;
        for(int h=1; h <=k; h++)
        {
            if((h % 3 == 0) && (h % 4 == 0)){
                sum+=h;
               cnt++;
            }
        }
        System.out.println("ortalama : "+sum/cnt);

        scan.close();
    }

}
