package com.ecut.optional;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * @author Amy
 * @date 2019-07-03 16:13
 * @description:
 */
public class OptionalTest1 {
    public static void main(String[] args) {
        Integer i = 1;
        Integer j = null;
        //of方法如果为空会抛出空指针
        Optional<Integer> integerOptional = Optional.of(i);
        //ofNullable方法允许为空
        Optional<Integer> integerNullOptional = Optional.ofNullable(j);
        //get方法需要值存在，不然会抛出NoSuchElementException异常
        System.out.println("integerOptional值：" + integerOptional.get());
        //isPresent判断值是否存在，存在返回true，不存在返回返回false
        System.out.println("integerOptional值是否存在：" + integerOptional.isPresent());
        System.out.println("integerNullOptional值是否存在：" + integerNullOptional.isPresent());
        Predicate<Integer> predicate = k -> k.equals(1);
        //如果值存在，并且这个值匹配给定的 predicate，返回一个Optional用以描述这个值，否则返回一个空的Optional。
        System.out.println("值存在并且匹配给定的predict，返回一个非空Optional：" + integerOptional.filter(predicate));
        System.out.println("值不存在，返回一个空的Optional：" + integerNullOptional.filter(predicate));
        //生成一个空的Optional
        Optional emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
        //如果存在该值，返回值，否则返回 other。
        int orElseRes = integerOptional.orElse(1);
        int orElseNullRes = integerNullOptional.orElse(1);
        System.out.println("如果存在该值，返回值:" + orElseRes);
        System.out.println("不存在返回other：" + orElseNullRes);
    }
}
