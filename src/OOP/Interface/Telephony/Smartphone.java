package OOP.Interface.Telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> phones;

    private List<String> urls;

    public Smartphone(List<String> phones, List<String> urls){
        this.phones = phones;
        this.urls = urls;
    }

    @Override
    public String browse() {
        return "Browsing... ";
    }

    @Override
    public String call() {
        return "Calling... ";
    }
}
