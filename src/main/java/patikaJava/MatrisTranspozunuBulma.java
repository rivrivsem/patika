package patikaJava;

public class MatrisTranspozunuBulma {
    /*
    Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
     */

        public static void main(String[] args) {
            int[][] matrix = {{2, 3, 4}, {5, 6, 4}};
            int[][] transpose = new int[matrix[0].length][matrix.length];

            for (int i = 0; i < matrix.length; i++)
            {
                for (int j = 0; j < matrix[0].length; j++)
                {
                    transpose[j][i] = matrix[i][j];
                }
            }

            System.out.println("Transpoze : ");
            for (int[] row : transpose)
            {
                for (int eleman : row)
                {
                    System.out.print(eleman + " ");
                }
                System.out.println();
            }
        }
}
