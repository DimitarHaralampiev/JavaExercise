package OOP.Abstraction.MyLinkedList;

import OOP.Abstraction.MyLinkedList.ListItem;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {

        rightLink = item;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {

        leftLink = item;
        return leftLink;
    }

    @Override
    int compareTo(ListItem item) {

        if(item != null){
            String superValue = (String) super.getValue();
            String value = (String) item.getValue();
            return superValue.compareTo(value);
        } else {
            return -1;
        }
    }
}
