import util.Input;

public class Person {
    public static void main(String[] args) {
//        Person person1 = new Person();
//        Input input = new Input();
//        person1.setName();
//        person1.setLastName(input.getString("What is your last name?"));
//        person1.setLocation(input.getString("Where are you from?"));
//        person1.sayHello();
    }
    private String firstName;
    private String lastName;
    private String location;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Person() {

    }

    public Person(String firstName, String lastName, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }
}
