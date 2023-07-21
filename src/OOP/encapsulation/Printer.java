package OOP.encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = ((tonerLevel > -1) && (tonerLevel <= 100) ? tonerLevel : -1);
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){

        if (tonerAmount > 0 && tonerAmount <= 100){
            if ((this.tonerLevel + tonerAmount) > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
        } else {
            return -1;
        }
        return this.tonerLevel;
    }

    public int printPages(int pagesPoint){

        int pagesToPrint = pagesPoint;

        if(this.duplex) {
            pagesToPrint = (pagesPoint / 2) + (pagesPoint % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
