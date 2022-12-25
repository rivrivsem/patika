package patika;

import java.util.Scanner;

public class BasamakSayilarininToplami {
    /*
    Ödev
    Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
    Örnek : 1643 = 1 + 6 + 4 + 3 = 14
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi =input.nextInt();
        int bastopl=0;

        while (sayi!=0)
        {
            bastopl += sayi % 10;

            sayi /= 10;
        }
        System.out.println("toplam ="+bastopl);





    }
}
