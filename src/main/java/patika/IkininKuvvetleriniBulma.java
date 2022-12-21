package patika;

import java.util.Scanner;

public class IkininKuvvetleriniBulma {
    /*
         Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("bir sayi giriniz: ");
        int sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            int powerOfFour = (int) Math.pow(4, i);
            int powerOfFive = (int) Math.pow(5, i);
            System.out.println("4^" + i + " = " + powerOfFour + ", 5^" + i + " = " + powerOfFive);
        }



    }
}
