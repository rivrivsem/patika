package patika;

import java.util.Scanner;

public class DikUcgenHIpotenus {
    /*
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */
    public static void main(String[] args) {

//        Dik Üçgende Hipotenüs Bulan Program
//        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        Scanner input =new Scanner(System.in);
        int a,b;
        System.out.println("dik ucgenin bir kenar uzunlugunu giriniz...");
        a=input.nextInt();
        System.out.println("dik ucgenin ikinci kenar uzunlugunu giriniz...");
        b=input.nextInt();

        double hipo = Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenus = " + hipo);



        //        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.Formül
        //        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //
        //        𝑢 = (a+b+c) / 2
        //
        //        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        double x,y,z;
        System.out.println("ucgenin ilk kenar uzunlugunu giriniz...");
        x=input.nextInt();
        System.out.println("ucgenin ikinci kenar uzunlugunu giriniz...");
        y=input.nextInt();
        System.out.println("ucgenin ucuncu kenar uzunlugunu giriniz...");
        z=input.nextInt();
         double u =(x+y+z)/2;
         double cevre = 2*u;
         double alan = Math.sqrt(u * (u - x) * (u - y) * (u - z));
        System.out.println("alan = " + alan);


        input.close();

    }
}
