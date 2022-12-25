package patikaJava;

import java.util.Scanner;

public class SayiSiralama {
    /*
    Ödev
    Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
     */

    public static void main(String[] args) {

        int x,y,z;
        Scanner input= new Scanner(System.in);
        System.out.println("1.sayiyi giriniz : ");
        x=input.nextInt();
        System.out.println("2.sayiyi giriniz : ");
        y=input.nextInt();
        System.out.println("3.sayiyi giriniz : ");
        z=input.nextInt();

        if (x<y && x<z) {
            if (y < z)
            {
                System.out.println("x<y<z");
            }else
            {
                System.out.println("x<z<y");
            }


        }
        else if (y<x && y<z)
        {
            if (x<z)
            {
                System.out.println("y<x<z");
            }else
            {
                System.out.println("y<z<x");
            }

        }
        else if (z<x && z<y)
        {
            if (x<y)
            {
                System.out.println("z<x<y");
            }else
            {
                System.out.println("z<y<x");
            }

        }

        input.close();

    }
}
