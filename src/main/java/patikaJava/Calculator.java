package patikaJava;

import java.util.Scanner;
//@author semra
//patika.dev

public class Calculator {
    public static void main(String[] args) {


        int secim;
        double n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz: ");
        n1 = input.nextDouble();
        System.out.print("2.sayıyı giriniz: ");
        n2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiniz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.print(n1 + "+" + n2 + "=" + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + "x" + n2 + "=" + (n1 * n2));
                break;
            case 4:
                System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
                break;
            default:
                System.out.print("Tekrar deneyiniz. Yanlis secim yaptiniz...");
        }

    }
}
