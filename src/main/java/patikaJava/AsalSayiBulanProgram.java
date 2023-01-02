package patikaJava;

import java.util.Scanner;

public class AsalSayiBulanProgram {

    /*
    Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup
     olmadığını bulan programı yazın.

        Senaryo
        Sayı Giriniz : 22
        22 sayısı ASAL değildir !

        Sayı Giriniz : 2
        2 sayısı ASALDIR !

        Sayı Giriniz : 39
        39 sayısı ASAL değildir !

        Sayı Giriniz : 17
        17 sayısı ASALDIR !
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int num = sc.nextInt();

        if (asalMi(num, 2))
        {
            System.out.println(num + " sayısı asaldir!");
        }
        else
        {
            System.out.println(num + " sayısı asal degil!");
        }
    }

    public static boolean asalMi(int n, int i) {
        if (n <= 2) {
            return n == 2;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return asalMi(n, i + 1);
    }
}
