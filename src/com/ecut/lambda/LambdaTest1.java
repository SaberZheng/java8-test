package com.ecut.lambda;

/**
 * @author Amy
 * @date 2019-07-03 11:20
 * @description: Lambda表达式测试类
 */
public class LambdaTest1 {

    /**
     * lambda 表达式只能引用标记了 final 的外层局部变量，
     */
    final private static int K = 1;

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
        //lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
        final int j = 2;
        //通过lambda表达式实现接口
        SayHello sayHello = s -> System.out.println("hello " + s);
        sayHello.say("lambda");
        //通过lambda表达式实现接口
        ShowNum showNum = i -> System.out.println(i + j + K);
        //Lambda可以作为参数来传递给函数
        LambdaTest1.print(showNum, 3);
    }

    private static void print(ShowNum showNum, int num) {
        showNum.show(num);
    }
}


