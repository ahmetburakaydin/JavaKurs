package gun33Tekrar.task3;

public class Main {
    public static void main(String[] args) {
         /*
    Üniversitede Öğrencilere Ders kaydı programı yapılmak isteniyor.
    Önce ders tanımlamaları yapılacak, sonra her öğrenci için alabileceği ders saatini geçmeyecek şekilde, dersler
    öğrencilere eklenecek.
    1.	Yeni ders oluşturmak için Lesson adında bir sınıf tanımlayınız :
		fields: name, hour
    2.	3 adet ders tanımlayınız.
		mat101 6 saat,  fiz101 4 saat, java101 6 saat, gibi
    3.	Student isminde yeni bir class tanılayınız:
        fields : name, maxAlabilecegiDersSaatMiktari
    4.	Öğrenci oluşturmayı bir metod ile yazınız.createStudent
    5.	2 adet öğrenci oluşturunuz:
        Adı: Mehmet, maxAlabilecegiDersSaatMiktari=20 olsun
        Adı: Ayşe, maxAlabilecegiDersSaatMiktari=12
    6.	Öğrenciye ders Eklemek için bir dersListesi tutacak bir
		field ekleyiniz: studentLessons adında
    7.	Öğrenciye ders ekleyen LessonAdd isimli bir metod yazınız;
		fakat ders eklenirken toplam ders saat miktarı öğrencinin alabileceği saat
		miktarını aşmasın, aşarsa uyarı versin.
		yani öğrencinin alabileceği max saat miktarına baksın, geçmeyecekse eklesin.
    8.	Her öğreninin aldığı dersleri yazan bir metod yazınız.ve
		dersleri yazdırınız. printLesson
     */
        Lesson d1 = new Lesson("Mat101",6);
        Lesson d2 = new Lesson("Fiz101",4);
        Lesson d3 = new Lesson("Java101",6);

        Student s1 = new Student();
        s1.createStudent("Mehmet",20);
        Student s2= new Student();
        s2.createStudent("Ayşe",12);

        s1.lessonAdd(d1);
        s1.lessonAdd(d2);
        s1.lessonAdd(d3);
        s2.lessonAdd(d1);
        s2.lessonAdd(d2);
        s2.lessonAdd(d3);

        s1.lessonArray(s1.studentLessons);
        s2.lessonArray(s2.studentLessons);

    }
}
