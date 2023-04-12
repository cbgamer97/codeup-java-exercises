public class MethodsLecture {
    public static void main(String[] args) {
        System.out.println(sayHello("Connor"));
//        System.out.println(returnThree());
        System.out.println(highFive("jason", "javier"));
        String myName = "Connor";
        System.out.println(changeName(myName));
    }

    public static String sayHello(){
        String message = "Hello... I have no idea who you are...";
        return message;
    }

    public static String sayHello(String name){
        String message = "Hello " + name + "!";
        return message;
    }

    public static int returnThree() {
        return 3;
    }

    public static String highFive(String name) {
        return name + " gives no-one a high five. He has no friends.";
    }

    public static String highFive(String name1, String name2){
        return name1 + " gives " + name2 + " a high five!";
    }

    public static String changeName(String name){
        name = "Roberto";
        return name;
    }

    public static void count(int n){
        if (n <= 0){
            System.out.println("All done");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }
}
