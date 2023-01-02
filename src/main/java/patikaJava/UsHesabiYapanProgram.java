package patikaJava;

import java.util.Scanner;

public class UsHesabiYapanProgram {

    /*
        Recursive Metotlar ile Üslü Sayı Hesaplama
         Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
         "Recursive" metot kullanarak yapan programı yazınız.

        Senaryo

        Taban değeri giriniz :2
        Üs değerini giriniz : 0
        Sonuç : 1
        Taban değeri giriniz : 2
        Üs değerini giriniz : 3
        Sonuç : 8
        Taban değeri giriniz : 5
        Üs değerini giriniz : 3
        Sonuç : 125
     */



    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int base = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exponent = input.nextInt();

        int result = power(base, exponent);
        System.out.println("Sonuç: " + result);
    }



}
