package patikaJava;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {

    /*
    Ödev - Dizideki Elemanları Sıralama
            Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
            Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

            Senaryo
            Dizinin boyutu n : 5
            Dizinin elemanlarını giriniz :
            1. Elemanı : 99
            2. Elemanı : -2
            3. Elemanı : -2121
            4. Elemanı : 1
            5. Elemanı : 0
            Sıralama : -2121 -2 0 1 99


            Dizinin boyutu n : 6
            Dizinin elemanlarını giriniz :
            1. Elemanı : 1000221
            2. Elemanı : 22
            3. Elemanı : -1
            4. Elemanı : 999
            5. Elemanı : 0
            6. Elemanı : 254
            Sıralama : -1 0 22 254 999 1000221
                 */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz (n): ");
        int n = input.nextInt();

        int[] sayilar = new int[n];
        System.out.println("Dizinin elemanlarini giriniz:");
        for (int i = 0; i < n; i++)
        {
            System.out.print((i + 1) + ". elemani: ");
            sayilar[i] = input.nextInt();
        }

        Arrays.sort(sayilar);
        System.out.print("Siralama: ");
        for (int sayi : sayilar)
        {
            System.out.print(sayi + " ");
        }
    }
}
