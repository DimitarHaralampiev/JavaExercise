package OOP.Abstraction;

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
    public boolean addItem(ListItem item) {

        if(root == null){
            root = item;
            return true;
        }

        ListItem currentItem = root;

        while (currentItem != null){

            int comparison = currentItem.compareTo(item);

            if(comparison == 0){
                return false;
            } else if(comparison > 0){
                ListItem prevItem = currentItem.previous();
                if(prevItem == null){
                    item.setNext(root);
                    root.setPrevious(item);
                    root = item;
                } else {
                    prevItem.setNext(item);
                    item.setPrevious(prevItem);
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                }
                return true;
            } else {

                ListItem nextItem = currentItem.next();
                if(nextItem == null){
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                }
            }
            currentItem = currentItem.next();
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
