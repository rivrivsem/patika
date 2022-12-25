package patikaJava;

import java.util.Scanner;

public class DaireninAlaniVeCevresi {

    public static void main(String[] args) {
        /*
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        double pi = 3.14,r,a;

        Scanner input =new Scanner(System.in);
        System.out.println("yaricapi giriniz...");
        r=input.nextDouble();
        System.out.println("merkez acinin olcusunu giriniz");
        a=input.nextDouble();

        double daireDilimAlan = (pi*(r*r)*a)/360;
        System.out.println("daireDilimAlan = " + daireDilimAlan);


        input.close();


    }
}
