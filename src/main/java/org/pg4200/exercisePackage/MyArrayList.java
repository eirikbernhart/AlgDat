package org.pg4200.exercisePackage;

import org.pg4200.datastructure.delete.ArrayDeleteContainer;

/**
 * Created by eirik on 05.09.2017.
 */
public class MyArrayList<T> extends ArrayDeleteContainer<T>{

    private Object[] doubledArray;

    public MyArrayList() {
        super();
    }

    public MyArrayList(int capacity){
        super(capacity);
    }

    @Override
    public void add(T value) {
        if(size == data.length) {
            Object[] doubledArray = new Object[data.length * 2]; //New array to hold the old contents and get new
            for(int i = 0; i < data.length; i++) {
                doubledArray[i] = data[i];
            }
            data = doubledArray;
        }
        super.add(value);
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
