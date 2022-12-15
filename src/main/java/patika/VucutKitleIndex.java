package patika;

import java.util.Scanner;

public class VucutKitleIndex {

    //www.patika.dev
    //@author semra

    /*
    Vücut Kitle İndeksi Hesaplama
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
    Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
      Formül
      Kilo (kg) / Boy(m) * Boy(m)
     */

    public static void main(String[] args) {

        double kilo,boy, BMI;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Your Height In Meters : ");
        boy = input.nextDouble();

        System.out.print("Enter Your Weight : ");
        kilo = input.nextDouble();

        BMI = kilo / (boy * boy);
        System.out.print("Your Body Mass Index : " + BMI);

        input.close();

    }
}
