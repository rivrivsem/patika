package patikaJava;

import java.util.Scanner;

public class UsluSayilariHesaplama {
    /*
        Ödev
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
     */
    public static void main(String[] args) {
        int sayi,us,result=1;
        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        sayi=scan.nextInt();
        System.out.println("us olacak sayiyi giriniz");
        us=scan.nextInt();
        for (int i=1; i<=us;i++)
        {
            result*=sayi;
        }
        System.out.println("sonuc =" + result);

        scan.close();
    }
}
