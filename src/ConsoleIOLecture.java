public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Bigfoot";
        String timeOfDay = "afternoon";
        int week = 9;
        System.out.printf("Good %s, %s!%n", timeOfDay, cohort);
        System.out.printf("This is the %d week of %s cohort.%n", week, cohort);
        float myFloat = 123.456F;
        System.out.printf("The number is %f%n", myFloat);
        System.out.println("Will this be a new line?");
    }
}
