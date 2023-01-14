package patikaJava;

import java.util.Scanner;

public class PalindromikKelimleriBulma {

    //1.yontem
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;

        System.out.println("Palindrome kontrol etmek icin kelime girin:");
        word = input.nextLine();

        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--)
        {
            reversedWord += word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversedWord))
        {
            System.out.println("kelime bir Palindrome'dur");
        }
        else
        {
            System.out.println("kelime bir Palindrome degildir");
        }


        System.out.println("===============");

        //2.yontemin sout 
        System.out.println(isPalindrome("abba"));
    }




    //2.yontem
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
}
