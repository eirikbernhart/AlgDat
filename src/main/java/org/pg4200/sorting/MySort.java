package org.pg4200.sorting;

/**
 * Created by arcuri82 on 21-Aug-17.
 */
public interface MySort {

    <T extends Comparable<T>> void sort(T[] array);
}
