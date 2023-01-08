package ogrenciNotSistemi;

public class Student {

    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkSozluNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.sozlu = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozlu = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozlu = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
//        double fizikOrt = this.fizik.sozlu*this.fizik.sozluOrtEtki/100 +  this.fizik.note*(100-this.fizik.sozluOrtEtki)/100;
//        double kimyaOrt = this.kimya.sozlu*this.kimya.sozluOrtEtki/100 +  this.kimya.note*(100-this.kimya.sozluOrtEtki)/100;
//        double mathOrt = this.mat.sozlu*this.mat.sozluOrtEtki/100 +  this.mat.note*(100-this.mat.sozluOrtEtki)/100;

        this.avarage = (this.fizik.calculateAvarage()+ this.kimya.calculateAvarage()+ this.mat.calculateAvarage()) / 3;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.ortalama);
        System.out.println("Fizik Notu : " + this.fizik.ortalama);
        System.out.println("Kimya Notu : " + this.kimya.ortalama);
    }


}
