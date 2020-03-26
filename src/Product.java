public class Product {
    /*
     * Voor een product zijn naam en prijs relevant.
     */
    private String naam;
    private double prijs;

    /*
     * Er kan een product met een naam worden aangemaakt. Die naam kan niet
     * meer worden aangepast. De prijs wordt in eerste instantie € 0,00.
     */
    public Product (String naam) {
        this.naam = naam;
        this.prijs = prijs;
    }

    /*
     * De prijs van een product is variabel en kan worden aangepast.
     */
    public void setPrijs (double prijs) {
        this.prijs = prijs;
    }

    /*
     * De prijs van een product kan worden opgevraagd.
     */
    public double getPrijs () {
        return prijs;
    }

    /*
     * De naam van een product kan worden opgevraagd.
     */
    public String getNaam () {
        return naam;
    }
}
