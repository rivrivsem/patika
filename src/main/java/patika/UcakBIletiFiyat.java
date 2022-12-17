package patika;

import java.util.Scanner;

public class UcakBIletiFiyat {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Mesafe (km) giriniz: ");
                int mesafe = sc.nextInt();

                System.out.print("Yaş giriniz: ");
                int yas = sc.nextInt();

                System.out.print("Yolculuk Tipi seciniz (1==>Tek Yön, 2==>Gidiş-Dönüş): ");
                int yolculukTipi = sc.nextInt();

                if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
                    System.out.println("Hatalı Veri Girdiniz !");
                    return;
                }

                double fiyat = mesafe * 0.10;


                if (yas < 12)
                {
                    fiyat *= 0.50;
                }
                else if (yas >= 12 && yas < 24)
                {
                    fiyat *= 0.90;
                }
                else if (yas >= 65)
                {
                    fiyat *= 0.70;
                }

                if (yolculukTipi == 2)
                {
                    fiyat *= 0.80;
                }
                System.out.println("Uçak Bileti Fiyatı: " + fiyat + " TL");
            }
        }



