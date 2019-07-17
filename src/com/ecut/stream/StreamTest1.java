package com.ecut.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Amy
 * @date 2019-07-12 15:47
 * @description:
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("佐助", "", "鸣人", "大蛇丸", "", "卡卡西", "小樱", "佐井", "小李", "自来也", "");
        //stream方法来创建串行流
        Stream<String> stream = stringList.stream();
        //filter方法用来设置条件过滤元素
        Predicate<String> predicate = s -> !s.isEmpty();
        stream = stream.filter(predicate);
        //map用于映射每一个元素的结果
        stream = stream.map(s -> s + ", ");
        //limit用来指定数量的流
        stream = stream.limit(6);
        //sorted用来对流进行排序
        stream = stream.sorted();
        //Collectors类实现了很多归约操作，例如将流转换成集合和聚合元素
        String mergedString = stream.collect(Collectors.joining());
        System.out.println("合并的字符串是：" + mergedString);

        List<Integer> integerList = Arrays.asList(1, 3, 4, 5, 5, 9, 24, 88);
        //parallelStream方法用来创建并行流
        Stream<Integer> parallelStream = integerList.parallelStream();
        //summaryStatistics可以用于统计
        IntSummaryStatistics intStream = parallelStream.mapToInt(i -> i + 5).summaryStatistics();
        System.out.println("最大值为" + intStream.getMax());
        System.out.println("最小值为" + intStream.getMin());
        System.out.println("平均值为" + intStream.getAverage());
        System.out.println("总个数为" + intStream.getCount());
        System.out.println("总数为" + intStream.getSum());


    }
}
