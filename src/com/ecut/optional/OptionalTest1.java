package com.ecut.optional;

import com.ecut.entity.Person;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * @author Amy
 * @date 2019-07-03 16:13
 * @description:
 */
@SuppressWarnings("unchecked")
public class OptionalTest1 {
    public static void main(String[] args) {

        Integer i = 1;
        Integer j = null;

        //of构造方法不允许为空，如果为空会抛出空指针
        Optional<Integer> integerOptional = Optional.of(i);

        //ofNullable构造方法允许为空
        Optional<Integer> integerNullOptional = Optional.ofNullable(j);

        //empty方法构造一个空的Optional
        Optional emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //get方法需要值存在，不然会抛出NoSuchElementException异常
        System.out.println("integerOptional值：" + integerOptional.get());

        //isPresent判断值是否存在，存在返回true，不存在返回返回false
        System.out.println("integerOptional值是否存在：" + integerOptional.isPresent());
        System.out.println("integerNullOptional值是否存在：" + integerNullOptional.isPresent());
        Predicate<Integer> predicate = k -> k.equals(1);

        //filter方法如果值存在，并且这个值匹配给定的 predicate，返回一个Optional用以描述这个值，否则返回一个空的Optional。
        System.out.println("filter方法值存在并且匹配给定的predict，返回一个非空Optional：" + integerOptional.filter(predicate));
        System.out.println("filter方法值不存在，返回一个空的Optional：" + integerNullOptional.filter(predicate));

        //orElse方法如果存在该值，返回值，否则返回 other。
        Integer orElseRes = integerOptional.orElse(1);
        Integer orElseNullRes = integerNullOptional.orElse(1);
        System.out.println("orElse方法如果存在该值，返回值:" + orElseRes);
        System.out.println("orElse方法不存在返回other：" + orElseNullRes);

        //orElseGet方法如果存在该值，返回值，否则返回通过方法获取。
        Optional<Person> person = Optional.of(new Person(4, "Edward", "Tang"));
        Person orElseGetRes = person.orElseGet(() -> new Person(0, "Unknown", "Unknown"));
        System.out.println("orElseGet存在该值，返回值:" + orElseGetRes.getFirstName());
        Optional<Person> personNull = Optional.empty();
        Person orElseNullGetRes = personNull.orElseGet(() -> new Person(0, "Unknown", "Unknown"));
        System.out.println("orElseGet方法不存在值，通过方法获取" + orElseNullGetRes.getFirstName());

        //map方法如果为空，返回一个空的Optional，如果不为空则根据入参获取到的结果生成一个新的Optional
        Optional<String> mapRet = person.map(p -> p.getFirstName()).map(name -> name.toLowerCase());
        System.out.println("map方法不为空执行结果为：" + mapRet);
    }
}
