package com.ecut.funcinterface;

import java.util.function.Predicate;

/**
 * @author Amy
 * @date 2019-07-03 19:41
 * @description:
 */
public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        Predicate<Integer> predicate1 = n -> true;
        Predicate<Integer> predicate2 = n -> n % 2 == 0;
        Predicate<Integer> predicate3 = n -> n > 3;
        show(nums, predicate1);
        show(nums, predicate2);
        show(nums, predicate3);
    }

    private static void show(int[] nums, Predicate<Integer> predicate) {
        for (int n : nums) {
            if (predicate.test(n)) {
                System.out.println(n);
            }
        }
    }
}
