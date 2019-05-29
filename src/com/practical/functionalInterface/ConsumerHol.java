package com.practical.functionalInterface;


/**
 * A functional interface is:
 * * An interface
 * *With one abstract method
 * *Methods from Object do not count
 * *Maybe annoted with @FunctionalInterface
 *
 */

@FunctionalInterface
public interface ConsumerHol<T> {

    /**
     * One Abstract Method
     */
    public void accept(T t);
}
