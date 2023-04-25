import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        int[] numbers = new int[] {5, 5, 5, 5};
        System.out.println(average(numbers));
    }

    public static int subtractTen(int num1){
        return num1 - 10;
    }

    public static double average (int[] arr1){
        double sum = 0;
        double average = 0;
        for (int j : arr1) {
            sum += j;
            average = sum / arr1.length;
        }
        return average;
    }

    static ArrayList<Integer> multiplyAll (int num1, ArrayList<Integer> arr1){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int num : arr1){
            num *= num1;
            newArray.add(num);
        }
        return newArray;
    }
}
