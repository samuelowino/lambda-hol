package com.practical.functionalInterface;

/**
 * A predicate negates or determines a positive {boolean}
 * declares a single method test(T t)
 */
@FunctionalInterface
public interface PredicateHol<T> {

    public boolean test(T t);
}
