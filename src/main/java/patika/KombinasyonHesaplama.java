package patika;

import java.util.Scanner;

public class KombinasyonHesaplama {
    /*
    @patika.dev
    @author : semra
        Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı
        grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
     */
    public static void main(String[] args) {
        int n,r;
        int sum=1,sum1=1,toplam=1;
        Scanner input=new Scanner(System.in);
        System.out.println("n sayiyini gireee misin...");
        n= input.nextInt();
        System.out.println("r sayiyini giree misin...");
        r=input.nextInt();
        for (int i=1;i<=n;i++)
        {
            sum*=i;
        }

        for (int t=1;t<=r;t++)
        {
            toplam*=t;
        }

        for (int k=1;k<=(n-r);k++)
        {
            sum1*=k;
        }

        System.out.println("C("+n+","+r+")="+n+"!"+"/("+r+"!*("+n+"-"+r+")!) ="+ sum/(toplam*sum1));

    }
}
