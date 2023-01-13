public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,
                   boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= -1 &&
                tonerLevel <= 100) ? tonerLevel : (this.tonerLevel = -1);
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount + tonerLevel;
        if((tonerAmount > 100) || (tonerAmount <= 0) ||
                (tempAmount > 100)) {
            return -1;
        } else {
             return tonerLevel += tonerAmount;
        }
    }

    public int printPages(int pages){
        if(pages < 0) {
            return -1;
        }
       int pagesToPrint = (duplex) ? (pages / 2) +
               (pages % 2) : pages;
       pagesPrinted += pagesToPrint;
       return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
