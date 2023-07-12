package interview_prep;

import java.util.ArrayList;

public class JpMorganChase {

    public static void main(String[] args) {
        String s1 = "Hello my name is Connor";
        String s2 = "my is Connor";
        ArrayList<String> arr1 = new ArrayList<>();

        for (String sentence1 : s1.split(" ")) {
            boolean foundMatch = false;
            for (String sentence2 : s2.split(" ")) {
                if (sentence1.equals(sentence2)) {
                    foundMatch = true;
                    break;
                }
            }
            if (!foundMatch) {
                arr1.add(sentence1);
            }
        }
//        System.out.println(arr1);
    }

}
