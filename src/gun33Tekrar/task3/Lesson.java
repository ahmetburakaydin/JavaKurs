package gun33Tekrar.task3;

public class Lesson {
    String name;
    int lessonCredit;


    public Lesson(String name, int lessonCredit) {
        this.name = name;
        this.lessonCredit = lessonCredit;
    }

    @Override
    public String toString() {
        return name+", Kredisi : "+lessonCredit;
    }
}
