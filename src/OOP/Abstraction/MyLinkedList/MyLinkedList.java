package OOP.Abstraction.MyLinkedList;

public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;

        while (currentItem != null) {

            int comparison = (currentItem.compareTo(newItem));

            if (comparison < 0) {

                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious( currentItem );
                    return true;
                }
            } else if (comparison > 0) {

                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    currentItem.setPrevious(newItem);
                    newItem.setNext( currentItem );
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if(item == null){
            return false;
        }

        ListItem currentItem = root;

        while (currentItem != null) {

            int comparison = currentItem.compareTo(item);

            if (comparison == 0) {
                ListItem prevItem = currentItem.previous();
                ListItem nextItem = currentItem.next();

                if (prevItem == null) {
                    root = nextItem;
                } else {
                    prevItem.setNext(nextItem);
                    if (nextItem != null) {
                        nextItem.setPrevious(prevItem);
                    }
                }
                return true;
            } else if (comparison > 0) {
                return false;
            }
            currentItem = currentItem.next();
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if(root == null){
            System.out.print("The list is empty");
        }

        while (root != null){

            System.out.println(root.getValue());
            root = root.next();
        }
    }
}
