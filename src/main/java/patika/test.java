package patika;

public class test {
    public static void main(String[] args) {
        int not=67;
        if (not>45)
            System.out.println("gecti");
        else System.out.println("kaldi");


        System.out.println(not>45?"gecrti":"kaldi");


        int x=10,y=20;
        boolean compare =x==y;

        if (compare)
        {
            System.out.println("A sayisi = " + x);
            System.out.println("esittir");
        }else
        {
            System.out.println("esit degildir");
        }


        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(++var2);


        int a = 20, b = 10;
        if ((a < b) && (b++ < 25)){
            System.out.println(a);
        }else{
            System.out.print(a);
        }
        System.out.println(b);


        int points=6;
        switch(points)
        {
            case 6: ;
            case 7: System.out.println("Java");break;
            case 8: ;
            case 9: System.out.println("101");break;
            case 10: System.out.println("Patika"); break;
            default: System.out.println("Dev");
        }

    }

}
