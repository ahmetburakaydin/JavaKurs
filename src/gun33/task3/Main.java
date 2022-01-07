package gun33.task3;

public class Main {
    public static void main(String[] args) {
        Lesson d1 = new Lesson("mat101", 6);
        Lesson d2 = new Lesson("fiz101", 4);
        Lesson d3 = new Lesson("java101", 6);

        Student s1 = new Student("mehmet", 20);
        Student s2 = new Student("ayşe", 12);

        s1.lessons.add(d1);
        s1.lessons.add(d2);
        s1.lessons.add(d3);
        s2.lessons.add(d1);
        s2.lessons.add(d2);
        s2.lessons.add(d3);

    }

}
