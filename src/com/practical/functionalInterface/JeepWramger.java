package com.practical.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @see {https://github.com/JosePaumard/lambda-master-class-part1}
 */
public class JeepWramger {

    public static void main(String[] args){
        Consumer<List<String>> clearListConsumer = (strings) -> strings.clear();

        List<String> list = new ArrayList<>(Arrays.asList("hello","peter","parne"));

        clearListConsumer.accept(list);

        assert(list).isEmpty();
    }
}
