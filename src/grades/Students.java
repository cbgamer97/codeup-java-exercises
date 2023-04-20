package grades;

import java.util.ArrayList;

public class Students {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students(String name) {
        this.name = name;
        ArrayList<Integer> grades = new ArrayList<>();
    }


    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double gradeTotal = 0;
        for(Integer grade : grades){
            gradeTotal += grade;
        }
        return gradeTotal / grades.size();
    }

}
