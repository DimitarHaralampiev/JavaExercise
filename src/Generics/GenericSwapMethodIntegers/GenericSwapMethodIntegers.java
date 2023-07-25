package Generics.GenericSwapMethodIntegers;

public class GenericSwapMethodIntegers<T>{

    private T data;

    public GenericSwapMethodIntegers(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.getClass().getPackageName() + ": " + this.data;
    }

    public T getDate() {
        return data;
    }
}
