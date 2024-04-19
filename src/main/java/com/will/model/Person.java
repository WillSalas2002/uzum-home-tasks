package com.will.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Cloneable {
    private String name;
    private Email email;

    @Override
    public Object clone() {
        return new Person(this.name, new Email(this.email.getValue()));
    }
}
