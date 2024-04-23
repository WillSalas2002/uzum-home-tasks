package com.will.task1;

import com.will.task1.model.Email;
import com.will.task1.model.Person;

public class App {
    public static void main(String[] args) {

        Email email = new Email("will@gmail.com");
        Person person = new Person("Will", email);
        Person personClone = (Person) person.clone();

        System.out.println(person == personClone); // false
        System.out.println(person.equals(personClone)); // true
    }
}
