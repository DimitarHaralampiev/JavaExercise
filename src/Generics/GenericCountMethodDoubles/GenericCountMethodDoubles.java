package Generics.GenericCountMethodDoubles;

import java.util.List;

public class GenericCountMethodDoubles<T extends Comparable<T>> {
    private T data;

    public GenericCountMethodDoubles(T data) {
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
