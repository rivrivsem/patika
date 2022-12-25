package patikaJava;

import java.util.Scanner;

public class ManavKasaProgramı {
    /*
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
    değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
     */

    public static void main(String[] args) {

        double armutFyt =2.14,elmaFyt=3.67,domatesFyt=1.11,muzFyt=0.95,patlicanFyt=5.00;
        int armut,elma,domates,muz,patlican;

        Scanner input =new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armut=input.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        elma=input.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        domates=input.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        muz=input.nextInt();
        System.out.print("Patlican Kaç Kilo ? :");
        patlican=input.nextInt();

        double toplamTutar = (armut*armutFyt)+(elma*elmaFyt)+(domates*domatesFyt)+(muz*muzFyt)+(patlican*patlicanFyt);
        System.out.println("Toplam Tutar : " + toplamTutar);

        input.close();

    }


}
