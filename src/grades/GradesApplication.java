package grades;

import rpg.Monster;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;


public class GradesApplication {

    public static void main(String[] args) {
        Students student2 = new Students("Codeguru");
        Students student3 = new Students("Codererer");
        Students student4 = new Students("GRR");
        student2.addGrade(80);
        student2.addGrade(70);
        student2.addGrade(96);
        student3.addGrade(80);
        student3.addGrade(70);
        student3.addGrade(96);
        student4.addGrade(80);
        student4.addGrade(70);
        student4.addGrade(96);

        Map<String, Students> studentsMap = Map.ofEntries(
                entry("Codeguru", student2),
                entry("Codererer", student3),
                entry("GRR", student4)
        );

        Map<String, Students> studentHashMap = new HashMap<>(studentsMap);

//        studentsMap.forEach((name, students)->{
//            System.out.printf("%s has a grade average of %s.%n", name, students.getGradeAverage());
//        });

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see info on a student?");
        String userConfirmation = scanner.nextLine();
        String studentConfirm;
        if (userConfirmation.equalsIgnoreCase("y")) {
            do {
                System.out.println("Which student would you like to see more info on?");
                studentConfirm = scanner.nextLine();
                switch (studentConfirm) {
                    case "Codeguru":
                        System.out.printf("%s has a grade average of %s.%n", student2.getName(), student2.getGradeAverage());
                        System.out.println("Would you like to see info on another student?");
                        studentConfirm = scanner.nextLine();
                        break;
                    case "Codererer":
                        System.out.printf("%s has a grade average of %s.%n", student3.getName(), student3.getGradeAverage());
                        System.out.println("Would you like to see info on another student?");
                        studentConfirm = scanner.nextLine();
                        break;
                    case "GRR":
                        System.out.printf("%s has a grade average of %s.%n", student4.getName(), student4.getGradeAverage());
                        System.out.println("Would you like to see info on another student?");
                        studentConfirm = scanner.nextLine();
                        break;
                    default:
                        System.out.println("Student not found.");
                }

            } while (studentConfirm.equalsIgnoreCase("y"));
        }
    }
}
