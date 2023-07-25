package Generics.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        elements.add(element);
    }

    public T remove(int index){
        return (index > elements.size()) ? null : elements.remove(index);
    }

    public boolean contains(T element){
        return elements.contains(element);
    }

    public void swap(int indexOne, int indexTwo){
        T temp = elements.get(indexOne);
        elements.set(indexOne, elements.get(indexTwo));
        elements.set(indexTwo, temp);
    }

    public int getGreaterThan(T element){
        int count = 0;
        for (T el : elements){
            if (el.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    public T getMax(){
        sort();
        return elements.get(elements.size() - 1);
    }

    public T getMin(){
        sort();
        return elements.get(0);
    }

    public List<T> sort(){
        Collections.sort(elements);
        return elements;
    }

    public void print(){
        for (T element : elements){
            System.out.println(element);
        }
    }
}
