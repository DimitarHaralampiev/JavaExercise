package Generics.GenericCountMethodStrings;

import Generics.GenericSwapMethodStrings.GenericSwapMethodStrings;

import java.util.List;

public class GenericCountMethodStrings<T extends Comparable<T>> {

    private T data;

    public GenericCountMethodStrings(T data) {
        this.data = data;
    }

    public int counterGreaterThan(List<T> list, T element){

        int count = 0;
        for (T data : list){
            if (data.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return this.getClass().getPackageName() + ": " + this.data;
    }
}
