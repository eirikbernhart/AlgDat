package org.pg4200.exercisePackage;

import org.pg4200.datastructure.delete.ArrayDeleteContainer;

/**
 * Created by eirik on 05.09.2017.
 */
public class MyArrayList<T> extends ArrayDeleteContainer<T>{

    public MyArrayList() {
        super();
    }

    public MyArrayList(int capacity){
        super(capacity);
    }

    @Override
    public void add(T value) {
        //int temp = data.length;
        if(size == 0) {
            data[size] = value;
            size++;
        }

        Object[] doubledArray;


        if(size >= data.length) {
            size *= 2;
            System.out.println("Doubling array, size is now: " + size);
            System.out.println("Data.length: " + data.length);

            doubledArray = new Object[size];
            doubledArray[size-1] = value;
            data = doubledArray;
            add(value);
        }

        //size++;
    }

    @Override
    public void delete(int index) {
        super.delete(index);
    }

    @Override
    public T get(int index) {
        return super.get(index);
    }

    @Override
    public int size() {
        return super.size();
    }
}
