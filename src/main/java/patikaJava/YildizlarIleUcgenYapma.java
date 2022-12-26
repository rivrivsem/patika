package patikaJava;

import java.util.Scanner;

public class YildizlarIleUcgenYapma {
    /*
    Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

                        *
                       ***
                      *****
                     *******
                    *********
                     *******
                      *****
                       ***
                        *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi =input.nextInt();

        for (int i = 1; i <= sayi; i++)
        {
            for (int j = 1; j <= sayi - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = sayi - 1; i >= 1; i--)
        {
            for (int j = 1; j <= sayi - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //extra bombastikk yeayyy :)))
        //@author semra

        System.out.println("satir sayisini veri misin");
        int s = input.nextInt();
        for (int i =1 ; i<=s ; i++)
        {
            System.out.print(" ".repeat(s-i));
            System.out.println("* ".repeat(i));
        }
        for (int i = s-1 ; i >= 1 ; i--){
            System.out.print(" ".repeat(s-i));
            System.out.println("* ".repeat(i));
        }
    }
}
