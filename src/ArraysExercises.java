import rpg.Monster;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        Person legolas = new Person("Legolas", "Greenleaf", "Mirkwood");
        Person frodo = new Person("Frodo", "Baggins", "Hobbiton");
        Person marry = new Person("Marry", "Brandybuck", "Buckland");

        people[0] = legolas;
        people[1] = frodo;
        people[2] = marry;

        for (Person person : people) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        Person sam = new Person("Samwise", "Gamgee", "Hobbiton");

        Person[] newPersonArray = addPerson(people, sam);

        for (Person person : newPersonArray){
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

    }

    public static Person[] addPerson(Person[] personArray, Person newPerson){
        Person[] newPersonArray = Arrays.copyOf(personArray, personArray.length + 1);
        newPersonArray[newPersonArray.length - 1] = newPerson;
        return newPersonArray;
    }
}
