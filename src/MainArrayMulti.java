import models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainArrayMulti {
    public static void main(String[] args) {
        // Create on person at time
        Person person1 = new Person("Mirko", "Salus", 34);
        // Show person 1 data
        System.out.println(person1.getLastname() + " " + person1.getFirstname() + " " + person1.getAge());
        // Create new person
        Person person2 = new Person("Alar", "Karis", 65);
        // Persons age difference
        System.out.println("Age difference: " + (person2.getAge()-person1.getAge()));

        List<Person> persons = new ArrayList<>(); // Create empty Person list
        persons.add(person1);
        persons.add(person2);
        persons.add(new Person("Toomas Hendrik", "Ilves", 69));
        showListMulti(persons); // Näitab persoonide list koos järjekorra nr
        // Asenda persion1 andmed
        persons.get(0).setFirstname("Arnold");
        persons.get(0).setLastname("Rüütel");
        persons.get(0).setAge(94);
        System.out.println();// tühi rida paremaks lugema
        showListMulti(persons); // index 9 asendatud uued andmed
        System.out.println(); // tühi rida paremaks lugema
        persons.add(new Person("Lennart", "Meri", 76));
        // Sort by lastname
        // https://stackoverflow.com/questions/12542185/sort-a-java-collection-object-based-on-one-field-in-it
        Collections.sort(persons, (o1, o2) -> (o1.getLastname().compareTo(o2.getLastname()))); // netist võetud ja muudetud
        persons.sort(Comparator.comparing(Person::getLastname)); // Programmi soovitatud lühem
        showListMulti(persons);
        // Add into list Lennart Meri 76, before sort
        // V:rida 31




    }
    private static void showListMulti(List<Person> persons) {
        int x = 0; // for index
        for(Person p : persons) {
            System.out.println(x + " " + p.getFirstname() + " " + p.getLastname()+ " " + p.getAge());
            x++; // x = x+1 or x+= 1
        }
    }
}
