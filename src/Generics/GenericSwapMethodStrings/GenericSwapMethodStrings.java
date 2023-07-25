package Generics.GenericSwapMethodStrings;

public class GenericSwapMethodStrings <T>{

    private T data;

    public GenericSwapMethodStrings(T data) {
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
