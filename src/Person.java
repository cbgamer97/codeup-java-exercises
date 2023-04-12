public class Person {
    public static void main(String[] args) {
        Person person1 = new Person("Connor");
        person1.sayHello();
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello, %s!%n", name);
    }

    public Person(String name){
        this.name = name;
    }
}
