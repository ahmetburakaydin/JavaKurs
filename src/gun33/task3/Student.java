package gun33.task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> lessons;


    public void createStudent(String name,int maxCredit){
        this.name=name;
        this.maxCredit=maxCredit;
        lessons=new ArrayList<>();
    }
    public void setLesson(Lesson lesson){
        if(getTotalCredit()+lesson.hour<maxCredit);
    }
    public int getTotalCredit(){
        int credit=0;
        for (Lesson lesson : lessons){
            credit+= lesson.hour;
        }
        return credit;
    }

    public Student(String name, int maxCredi) {
        this.name = name;
        this.maxCredit = maxCredi;
    }
    public void lessonAdd(Lesson lesson){
        lessons.add(lesson);

    }

    @Override
    public String toString() {
        return "Adı = " + name +
                "\nmaxCredi = " + maxCredit +
                "\nstudentLessons = " + lessons ;
    }
}
