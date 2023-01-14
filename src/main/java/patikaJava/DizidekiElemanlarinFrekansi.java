package patikaJava;

import java.util.HashMap;

public class DizidekiElemanlarinFrekansi {

    /*
    Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yaziniz

     Senaryo
        Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
        Tekrar Sayıları
        10 sayısı 3 kere tekrar edildi.
        20 sayısı 4 kere tekrar edildi.
        5 sayısı 1 kere tekrar edildi.
     */
    public static void main(String[] args) {

        int[] sayilar = {10, 20, 20, 10, 10, 20, 5, 20};

        HashMap<Integer, Integer> frekans = new HashMap<>();

        for (int sayi : sayilar)
        {
            if (frekans.containsKey(sayi))
            {
                int count = frekans.get(sayi);
                frekans.put(sayi, count + 1);
            }
            else
            {
                frekans.put(sayi, 1);
            }
        }

        System.out.println("Tekrar eden sayilar");

        for (int key : frekans.keySet())
        {
            System.out.println(key + " sayisi " + frekans.get(key) + " defa tekrar etti");
        }

    }

}
