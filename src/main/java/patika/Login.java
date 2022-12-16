package patika;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {


        //patika.dev
        //@author semra
        /*Ödev
         ==> Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
         ==> eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
         ==> unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
         ==> şifreler aynı ise ekrana "Şifre oluşturulamadı,
         ==> lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

           */

        String userName,password,newPassword,answer;

        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName= input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password= input.nextLine();

        if(userName.equals("patika") && password.equals("javaguzeldir"))
        {
            System.out.println("Giriş Yaptınız !");
        }
        else
        {
            System.out.println("Hatalı Giriş Yaptınız.Şifrenizi Değiştirmek İster Misiniz? (Evet/Hayır): ");
            answer= input.next().toUpperCase();

            if(answer.equals("EVET"))
            {
                System.out.println("Yeni Şifreyi Giriniz: ");
                newPassword = input.next();


                if (!newPassword.equals("java123")) {
                    System.out.println("Şifre Oluşturuldu.");
                }
                else
                {
                    System.out.println("Şifre Oluşturulamadı.Lütfen Başka Şifre Giriniz. ");
                }


            }
        }
        input.close();

    }
}