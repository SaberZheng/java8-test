package com.ecut;

/**
 * @author  Amy
 * @date 2019-07-03 11:20
 * @description: Lambda表达式测试类
 */
public class LambdaTest {

    /**
     * 函数式接口：只定义单一的抽象方法的接口
     */
    @FunctionalInterface
    interface ShowNum {
        void show(int num);
    }

    @FunctionalInterface
    interface SayHello {
        void say(String message);
    }

    public static void main(String[] args) {
        //通过lambda表达式实现接口
        SayHello sayHello = s -> System.out.println("hello " + s);
        sayHello.say("lambda");
        //通过lambda表达式实现接口
        ShowNum showNum = i -> System.out.println(i);
        //Lambda可以作为参数来传递给函数
        LambdaTest.print(showNum, 1);
    }

    private static void print(ShowNum showNum, int num) {
        showNum.show(num);
    }
}


