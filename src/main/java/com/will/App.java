package com.will;

import com.will.model.Email;
import com.will.model.Person;

public class App {
    public static void main(String[] args) {

        Email email = new Email("will@gmail.com");
        Person person = new Person("Will", email);
        Person personClone = (Person) person.clone();

        System.out.println(person == personClone); // false
        System.out.println(person.equals(personClone)); // true
    }
}
