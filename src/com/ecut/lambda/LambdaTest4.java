package com.ecut.lambda;

import com.ecut.entity.Person;

import java.util.Arrays;
import java.util.List;

/**
 * @author Amy
 * @date 2019-07-03 16:02
 * @description: 利用stream()
 */
public class LambdaTest4 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1, "Amy", "Zheng"),
                new Person(2, "Amanda", "Zheng"),
                new Person(3, "Saber", "Tang")
        );

        people.stream().filter(p -> p.getLastName().startsWith("Z")).forEach(p -> System.out.println(p.getFirstName()));

    }
}
