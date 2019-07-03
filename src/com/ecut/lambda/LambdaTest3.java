package com.ecut.lambda;

import com.ecut.entity.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Amy
 * @date 2019-07-03 15:53
 * @description: 利用函数式接口包和用Iterable.forEach()取代foreach loop
 */
public class LambdaTest3 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1, "Amy", "Zheng"),
                new Person(2, "Amanda", "Zheng"),
                new Person(3, "Saber", "Tang")
        );

        Predicate<Person> checkName = p -> p.getLastName().startsWith("Z");
        Consumer<Person> printName = p -> System.out.println(p.getFirstName());

        people.forEach(person -> {
            if (checkName.test(person)) {
                printName.accept(person);
            }
        });
    }
}
