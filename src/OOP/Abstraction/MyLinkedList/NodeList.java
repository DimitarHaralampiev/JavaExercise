package OOP.Abstraction.MyLinkedList;

import OOP.Abstraction.MyLinkedList.ListItem;

public interface NodeList {

    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);
}
