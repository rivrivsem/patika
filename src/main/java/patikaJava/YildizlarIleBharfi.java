package patikaJava;

public class YildizlarIleBharfi {

    /*
                Ödev
            Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.

             *  *  *  *
             *        *
             *        *
             *  *  *  *
             *        *
             *        *
             *  *  *  *
     */

    public static void main(String[] args) {

    //1.cozum yolu

    String[][] karakter = new String[7][4];

        for (int i = 0; i < karakter.length; i++)
        {
        for (int j = 0; j <karakter[i].length; j++)
        {
            if (i == 0 || i == 3|| i==6)
            {
                karakter[i][j] = " * ";
            }
            else if (j == 0 || j == 3)
            {
                karakter[i][j] = " * ";
            }
            else
            {
                karakter[i][j] = "   ";
            }
        }
    }

        for (String[] row : karakter){
        for (String col : row){
            System.out.print(col);
        }
        System.out.println();
    }


        System.out.println("===========================");

    //2.cozum yolu  :DDD bonus


        int[][] yildiz = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1}
        };
        for (int[] row : yildiz)
        {
            for (int star : row)
            {
                if (star == 1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



    }
}
