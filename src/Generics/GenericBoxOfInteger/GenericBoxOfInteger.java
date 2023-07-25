package Generics.GenericBoxOfInteger;

public class GenericBoxOfInteger <T> {

    private T data;

    public GenericBoxOfInteger(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.getClass().getPackageName() + ": " + this.getText();
    }

    public T getText() {
        return data;
    }
}
