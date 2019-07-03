package com.ecut.methodref;

import com.ecut.entity.User;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Amy
 * @date 2019-07-03 18:45
 * @description:
 */
public class MethodReferenceTest {

    @FunctionalInterface
    interface UserFactory<U extends User> {
        U creat(int id, String name);
    }

    private static UserFactory<User> userFactory = User::new;

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(userFactory.creat(i, "user" + i));
        }
        users.stream().map(User::getName).forEach(System.out::println);
    }
}
