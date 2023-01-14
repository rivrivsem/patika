package patikaJava;

public class HarmonikOrtalamaHesaplama {

    /*
             Ödev
        Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

        Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

     */

        public static double calculate(double[] sayilar) {
            int n = sayilar.length;
            double harmonicSum = 0.0;

            for (double sayi : sayilar)
            {
                harmonicSum += 1/sayi;
            }
            return n / harmonicSum;
        }

        public static void main(String[] args) {
            double[] sayilar = {1, 7, 9, 87, 95};
            System.out.println(calculate(sayilar));
        }

}
