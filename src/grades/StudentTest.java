package grades;


public class StudentTest {
    public static void main(String[] args) {
        Students student1 = new Students("Con");
        student1.addGrade(60);
        student1.addGrade(90);
        student1.addGrade(75);
        System.out.println(student1.getGradeAverage());
    }
}
