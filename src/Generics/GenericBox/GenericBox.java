package Generics.GenericBox;

public class GenericBox <T>{

    private String text;

    public GenericBox(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.getClass().getPackageName() + ": " + this.getText();
    }

    public String getText() {
        return text;
    }
}
