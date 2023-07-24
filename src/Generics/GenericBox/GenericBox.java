package Generics.GenericBox;

public class GenericBox <T>{

    private T data;

    public GenericBox(T data) {
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
