import util.Input;

public class Person {
    public static void main(String[] args) {
        Person person1 = new Person();
        Input input = new Input();
        person1.setName(input.getString("What is your first name?"));
        person1.setLastName(input.getString("What is your last name?"));
        person1.setLocation(input.getString("Where are you from?"));
        person1.sayHello();
    }
    private String firstName;
    private String lastName;
    private String location;

    public String getName(String input) {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getLastName(String input) {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation(String input) {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Person(){

    }

    public void sayHello(){
        System.out.printf("Hello, %s %s. I loved visiting %s!%n", firstName, lastName, location);
    }
}
