package patikaJava;

import java.util.Scanner;

public class TersUcgenYapimi {
    /*
    ==> Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
        yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

        Örnek
        Basamak Sayısı : 10

         *******************
          *****************
           ***************
            *************
             ***********
              *********
               *******
                *****
                 ***
                  *
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısıni giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++)
        {
            //boşluk icin
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            //asterisk icin
            for (int j = 1; j <= (n - i) * 2 + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
    //@author semra

}
