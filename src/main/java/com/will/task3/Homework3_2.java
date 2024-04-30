package com.will.task3;


import com.will.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Homework3_2 {

    /**
     * Реализовать метод при помощи {@link java.util.stream.Stream} который:
     * - группирует заданых персон по возрасту
     * - фильтрует по минимальному возрасту
     * - Убирает дубликаты персон по имени
     * @param persons - заданный список персон
     * @param minimalAgeFilter - указанный минимальный возраст
     * @param removeDupes - флаг отвечающий за исключение дубликатов из результата
     * @return словарь где ключ возраст а значение лист персон с этим хобби
     */
    public Map<Integer, List<Person>> groupByAge(List<Person> persons, int minimalAgeFilter, boolean removeDupes) {
        return persons.stream()
                .filter(person -> person.getAge() >= minimalAgeFilter)
                .collect(Collectors.groupingBy(Person::getAge,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> removeDupes ?
                                        list.stream()
                                                .collect(Collectors.toMap(Person::getName, p -> p, (p1, p2) -> p1))
                                                .values().stream()
                                                .toList() : list)));
    }
}
