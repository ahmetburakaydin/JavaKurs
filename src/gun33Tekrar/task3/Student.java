package gun33Tekrar.task3;

import java.util.ArrayList;

public class Student {
    String ogrName;
    int maxLessonCredit;
    ArrayList<Lesson> studentLessons=new ArrayList<>();

    @Override
    public String toString() {
        return "Ogrenci"+ogrName+" Alabileceği Kredi = "+maxLessonCredit;
    }

    public void createStudent(String ogrName, int maxLessonCredit){
        this.ogrName=ogrName;
        this.maxLessonCredit=maxLessonCredit;
    }
    public void lessonAdd(Lesson choosenOne){
        int count =0;
        for (Lesson l1: studentLessons) {
            count+=l1.lessonCredit;
        }
        if( count+choosenOne.lessonCredit<= maxLessonCredit){
            studentLessons.add(choosenOne);
        }else{
            System.out.println(ogrName+" => "+choosenOne.name+" Dersini Ekleme İşlemi Başarısız ");
            System.out.println("*****Maximum Kredi Sayısını Aşımı !!! *****");
        }
    }
    public void lessonArray(ArrayList<Lesson> lessons){

        System.out.println("Ogrenci "+ogrName+" Toplam Kredi Sayısı : "+maxLessonCredit+" saat ");
        System.out.println("Ogrenci "+ogrName+" Aldığı Dersler ; ");
        for (Lesson d1:lessons) {
            System.out.println(d1);
        }
        System.out.println("-----");
    }


}
