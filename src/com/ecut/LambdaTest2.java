package com.ecut;

import com.entity.Person;

import java.util.Arrays;
import java.util.List;

/**
 * @author Amy
 * @date 2019-07-03 15:29
 * @description: 原生态的Lambda表达式输出所有姓氏以z开头的名字
 */
public class LambdaTest2 {

    @FunctionalInterface
    interface CheckName {
        boolean filterLastName(Person person);
    }

    @FunctionalInterface
    interface PrintName {
        void printFirstName(Person person);
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1, "Amy", "Zheng"),
                new Person(2, "Amanda", "Zheng"),
                new Person(3, "Saber", "Tang")
        );

        CheckName checkName = p -> p.getLastName().startsWith("Z");
        PrintName printName = p -> System.out.println(p.getFirstName());

        for (Person person : people) {
            if (checkName.filterLastName(person)) {
                printName.printFirstName(person);
            }
        }
    }
}
