package maasHesaplayici;

public class Employee {

    /*
    Java'da "Employee" adında fabrika çalışanlarını temsil eden ve
     metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız.
      Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

        Sınıfın Nitelikleri

        name         : Çalışanın adı ve soyadı
        salary       : Çalışanın maaşı
        workHours    : Haftalık çalışma saati
        hireYear     : İşe başlangıç yılı


        Sınıfın Metotları

        Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.

        tax() : Maaşa uygulanan vergiyi hesaplayacaktır.

        Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.

        Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.

        bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
        her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.

        raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır.

        Şuan ki yılı 2021 olarak alın.

        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.

        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.

        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.

        toString() : Çalışana ait bilgileri ekrana bastıracaktır.
     */

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    // constr.
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Maasa vergi hesaplama
    public double tax() {
        if (salary < 1000)
        {
            return 0;
        }
        else
        {
            return salary * 0.03;
        }
    }

    // Bonus hesaplama
    public double bonus() {
        if (workHours > 40)
        {
            return (workHours - 40) * 30;
        }
        else
        {
            return 0;
        }
    }

    // maas artisi
    public double raiseSalary() {
        int years = 2021 - hireYear;
        if (years < 10)
        {
            return salary * 0.05;
        }
        else if (years < 20)
        {
            return salary * 0.1;
        }
        else
        {
            return salary * 0.15;
        }
    }
    // calisana ait bilgileri bastrm
    public String toString() {
        return "Adı: " + name + "\nMaaşı: " + salary + "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear + "\nVergi: " + tax() + "\nBonus: " + bonus() +
                "\nMaaş Artışı: " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş: " +
                (salary + tax() + bonus()) + "\nToplam Maaş: " + (salary + raiseSalary());
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Kemal", 2000, 45, 1985);
        System.out.println(employee);
    }
}
