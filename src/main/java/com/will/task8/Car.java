package com.will.task8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private int id;
    private Engine engine;

    public Car(int id) {
        this.id = id;
    }
}


