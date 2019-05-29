package com.practical.functionalInterface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaHolTest<T> {

    public static void consumer2(){
        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        Consumer<List<String>> consumer; //todo

        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));

        Consumer<List<String>> c3 = c1.andThen(c2);

        c3.accept(list);

        System.out.println(list);
    }

    private static void predicate1() {
        Predicate<String> isStringNotEmpty = (String t) -> t.isEmpty();

        String userName = ""; //user forgot to type in username

        boolean isUserNameEmpty = isStringNotEmpty.test(userName);

        assert(isUserNameEmpty);

        System.out.println("user name is empty | " + isUserNameEmpty);
    }

    public static void main(String[]args){
        consumer2();
        predicate1();
    }
}