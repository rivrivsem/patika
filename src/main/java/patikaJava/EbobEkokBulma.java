package patikaJava;

import java.util.Scanner;

public class EbobEkokBulma {
    /*
    patika.dev
     Ödev
     Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
     */

    public static void main(String[] args) {

        int n1,n2,ebob,ekok;
        Scanner input = new Scanner(System.in);
        System.out.println("küçük sayıyı gire misin haci: ");
        n1 = input.nextInt();
        System.out.println("büyük sayiyı da giree misin : ");
        n2 = input.nextInt();


        ebob = 0;
        int i = 1;
        while (i <= n1)
        {
            if (n1 % i == 0 && n2 % i == 0)
            {
                ebob = i;
            }
            i++;
        }

        System.out.println("ebob : " + ebob);

        ekok = (n1 * n2) / ebob;

        System.out.println("ekok : " + ekok);
        
    }
}
