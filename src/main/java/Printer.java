public class Printer {
    private int sheetsOfPaperLeft;
    private int tonerVolume;

    public Printer(int sheetsOfPaperLeft, int tonerVolume) {
        this.sheetsOfPaperLeft = sheetsOfPaperLeft;
        this.tonerVolume = tonerVolume;
    }

    public boolean print(int pages, int copies) {
        int sheetsToUse = pages * copies;
        if (sheetsToUse > sheetsOfPaperLeft)
            return false;
        sheetsOfPaperLeft -= sheetsToUse;
        tonerVolume -= sheetsToUse;
        System.out.printf("Printed %d pages%n", sheetsToUse);
        return true;
    }

    /*** GETTERS ***/
    public int getSheetsOfPaperLeft() {
        return sheetsOfPaperLeft;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }
}
