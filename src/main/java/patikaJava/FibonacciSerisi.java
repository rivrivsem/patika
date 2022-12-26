package patikaJava;

import java.util.Scanner;

public class FibonacciSerisi {
    /*
    Java döngüler ile fibonacci serisi bulan program yazıyoruz.
    Fibonacci serisinin eleman sayısını kullanıcıdan alın.

    Fibonacci Serisi Nedir ?
    Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
    Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
    yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

    Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
    Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

    9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi icin bir sayi giriniz: ");
        int numElements = input.nextInt();

        int[] series = new int[numElements];
        series[0] = 0;
        series[1] = 1;

        for (int i = 2; i < numElements; i++)
        {
            series[i] = series[i - 1] + series[i - 2];
        }

        System.out.println("Fibonacci serisi karsinizda effeniimmm :");
        for (int i = 0; i < numElements; i++)
        {
            System.out.print(series[i] + " ");
        }

        input.close();
    }
}
