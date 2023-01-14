package patikaJava;

import java.util.HashSet;
import java.util.Set;

public class DizideTekrarEdenCiftSayi {

    /*
    Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yaz
     */

        public static void main(String[] args) {
            int[] sayilar = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 10, 0, 0};

            Set<Integer> tekrarlananSayi = new HashSet<>();
            Set<Integer> tekSayi = new HashSet<>();

            for (int sayi : sayilar)
            {
                if (sayi % 2 == 0)
                {
                    if (!tekSayi.add(sayi))
                    {
                        tekrarlananSayi.add(sayi);
                    }
                }
            }
            System.out.println("Tekrar eden cift sayilar: " + tekrarlananSayi);
        }
}
