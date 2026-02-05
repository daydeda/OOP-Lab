public class KidsMagazine extends Publication {

    private int rec_age;

    public KidsMagazine() {
        super();
    }

    public KidsMagazine(int rec_age) {
        super();
        this.rec_age = rec_age;
    }

    public KidsMagazine(int rec_age, String publisher, int page_no, double price, String title) {
        super(publisher, page_no, price, title);
        this.rec_age = rec_age;
    }

    public int getRec_age() {
        return rec_age;
    }

    public void setRec_age(int rec_age) {
        this.rec_age = rec_age;
    }

    @Override
    public String pubPrint() {
        String base = super.pubPrint();
        return base + "\nRecommended age: " + rec_age + ".";
    }

}
