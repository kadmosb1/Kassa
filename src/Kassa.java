import java.util.ArrayList;

public class Kassa {

    /*
     * Er kan een lijst met producten worden bijgehouden. Op basis van de producten
     * in deze lijst wordt een totaalprijs bepaald en kan een korting worden
     * berekend.
     */
    ArrayList<Product> producten;

    /*
     * Een kassa moet leeg worden aangemaakt (aantal producten is gelijk aan 0
     * en de totaalprijs is € 0,00).
     */
    public Kassa () {
        resetKassa ();
    }

    /*
     * Als een product wordt toegevoegd, wordt de totaalprijsZonderKorting verhoogd
     * met de opgegeven prijs en wordt het aantal producten verhoogd met 1.
     */
    public void voegProductToe (Product product) {
        producten.add (product);
    }

    /*
     * Als zowel het totale bedrag voor alle producten € 100 of meer is en als
     * ook het aantal producten groter of gelijk is aan 3, dan wordt een korting
     * van 10% toegepast. Anders niet.
     */
    public double getTotaalprijsMetKorting () {

        int aantalProducten = producten.size ();
        double totaalprijsMetKorting = 0.0;

        for (Product product : producten) {
            totaalprijsMetKorting += product.getPrijs();
        }

        if ((aantalProducten >= 3) && (totaalprijsMetKorting >= 100.0)) {
            totaalprijsMetKorting *= 0.9;
        }

        return totaalprijsMetKorting;
    }

    /*
     * Het moet mogelijk zijn om een kassa leeg te maken, zodat de prijs
     * voor een volgende klant vastgesteld kan worden.
     */
    public void resetKassa () {
        producten = new ArrayList<Product> ();
    }
}
