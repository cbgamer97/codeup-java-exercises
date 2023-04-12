public class Recursion {

    private static int sumOfNumbersMethod(int number) {
        if (number == 0) {
            return number;
        } else {
            return number + sumOfNumbersMethod(number - 1);
        }
    }

    private static boolean isPalindromeMethode(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)){
            return isPalindromeMethode(word.substring(1, word.length() - 1));
        }
        return false;
    }

    public static int multiplication (int num1, int num2){
        int total = num1;
        if(num2 == 0){
            return 0;
        }
        return total + multiplication(num1, num2 - 1);
    }
}
