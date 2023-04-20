public class ExceptionsHandlingLecture {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[99]);
            throw new Exception("Something happened");
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("After the error happens...");
        }
    }
}
