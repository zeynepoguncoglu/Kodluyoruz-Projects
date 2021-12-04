package P25;

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


public void addBulkWrittenExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
        this.mat.writtenExamNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
        this.fizik.writtenExamNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
        this.kimya.writtenExamNote = kimya;
        }

        }

public void addBulkOralExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
                this.mat.oralExamNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
                this.fizik.oralExamNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
                this.kimya.oralExamNote = kimya;
        }

        }

public void isPass() {
        if (this.mat.writtenExamNote == 0 || this.fizik.writtenExamNote == 0 || this.kimya.writtenExamNote == 0 ||
                this.mat.oralExamNote == 0 || this.fizik.oralExamNote == 0 || this.kimya.oralExamNote == 0 ) {
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
        this.avarage = (this.fizik.writtenExamNote*0.80 + this.fizik.oralExamNote*0.20
                        + this.kimya.writtenExamNote*0.90 + this.kimya.oralExamNote*0.10
                        + this.mat.writtenExamNote* 0.75 + this.mat.oralExamNote* 0.25 ) / 3;
        }

public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
        }

public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Yazılı Notu : " + this.mat.writtenExamNote + " - Etki Yüzdesi : %75" );
        System.out.println("Matematik Sözlü Notu : " + this.mat.oralExamNote + " - Etki Yüzdesi : %25" );
        System.out.println("Fizik Yazılı Notu : " + this.fizik.writtenExamNote + " - Etki Yüzdesi : %80 " );
        System.out.println("Fizik Sözlü Notu : " + this.fizik.oralExamNote + " - Etki Yüzdesi : %20" );
        System.out.println("Kimya Yazılı Notu : " + this.kimya.writtenExamNote + " - Etki Yüzdesi : %90 " );
        System.out.println("Kimya Sözlü Notu : " + this.kimya.oralExamNote + " - Etki Yüzdesi : %10" );
        }

        }