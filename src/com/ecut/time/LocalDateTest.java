package com.ecut.time;

import java.time.LocalDate;

/**
 * @author Amy
 * @date 2019-07-12 17:52
 * @description:
 */
public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("当前时间为："+localDate);
        //with修改日期
        System.out.println(localDate.withMonth(12).withDayOfMonth(31).getDayOfYear());
        System.out.println("当前年份为"+localDate.getYear()+"当前月份为"+localDate.getMonth()+",当前日期为"+localDate.getDayOfMonth());
        System.out.println(LocalDate.of(2019,9,12));
    }
}
