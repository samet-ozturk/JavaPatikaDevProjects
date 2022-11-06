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
    public void verbalNote(int verbalMat, int verbalFizik, int verbalKimya) {

        if (verbalMat >= 0 && verbalMat <= 100) {
            this.mat.verbalNote = verbalMat;
        }

        if (verbalFizik >= 0 && verbalFizik <= 100) {
            this.fizik.verbalNote = verbalFizik;
        }

        if (verbalKimya >= 0 && verbalKimya <= 100) {
            this.kimya.verbalNote = verbalKimya;
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
        double matAverage = (this.mat.note * 0.8 + this.mat.verbalNote*0.2);
        double fizikAverage = (this.fizik.note * 0.8 + this.fizik.verbalNote*0.2);
        double kimyaAverage = (this.kimya.note * 0.8 + this.kimya.verbalNote*0.2);
        double avarageAll = (matAverage+fizikAverage+kimyaAverage)/3;
        this.avarage = Math.round(avarageAll*100)/100d;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("Öğrenci   : " + this.name);
        System.out.println("Matematik , Sınav notu : " + this.mat.note   +" , Sözel notu : "+ this.mat.verbalNote   +"   Oran ==> sınav %80  sözlü %20");
        System.out.println("Fizik     , sınav notu : " + this.fizik.note +" , Sözel notu : "+ this.fizik.verbalNote +"   Oran ==> sınav %80  sözlü %20");
        System.out.println("Kimya     , sınav notu : " + this.kimya.note +" , Sözel notu : "+ this.kimya.verbalNote +"   Oran ==> sınav %80  sözlü %20");
    }

}




