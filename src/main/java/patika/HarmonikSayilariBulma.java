package patika;

import java.util.Scanner;

public class HarmonikSayilariBulma {
    /*
    Java ile girilen sayının harmonik serisini bulan program yazacağız.

    1+1/2+1/3+1/4.....
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi =input.nextInt();
        double result=0;
        for (double i = 1; i<=sayi; i++ )
        {
            result=result+(1/i);
        }
        System.out.println(result);

        
    }
}
