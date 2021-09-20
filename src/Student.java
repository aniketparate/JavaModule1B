class Subject {
    float maths;
    float english;
    float science;
    float history;
    float hindi;
}

public class Student {
    public static void main(String[] args) {
        Subject s1 = new Subject();
        Subject s2 = new Subject();
        float avg1, avg2;

        s1.maths = 89;
        s1.english = 85;
        s1.science = 92;
        s1.history = 95;
        s1.hindi = 82;

        s2.maths = 92;
        s2.english = 80;
        s2.science = 96;
        s2.history = 91;
        s2.hindi = 85;

        avg1 = (s1.maths + s1.english + s1.science + s1.history + s1.hindi)/5;
        avg2 = (s2.maths + s2.english + s2.science + s2.history + s2.hindi)/5;

        System.out.println("AVERAGE " + avg1);
        System.out.println("AVERAGE " + avg2);
    }
}


