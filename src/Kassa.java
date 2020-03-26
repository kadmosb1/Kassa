public class Kassa {
    /*
     * Om de totaalprijs (incl. korting) te kunnen bepalen heb je een aantal
     * producten (minimaal 3) nodig en moet de totaalprijs worden bijgehouden
     * (minimaal € 100).
     */
    private int aantalProducten;
    private double totaalprijsZonderKorting;

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
    public void voegProductToe (double prijs) {
        totaalprijsZonderKorting =+ prijs;
        aantalProducten++;
    }

    /*
     * Als zowel het totale bedrag voor alle producten € 100 of meer is en als
     * ook het aantal producten groter of gelijk is aan 3, dan wordt een korting
     * van 10% toegepast. Anders niet.
     */
    public double getTotaalprijsMetKorting () {

        double totaalprijsMetKorting = totaalprijsZonderKorting;

        if ((aantalProducten >= 3) && (totaalprijsZonderKorting >= 100.0)) {
            totaalprijsMetKorting *= 0.9;
        }

        return totaalprijsMetKorting;
    }

    /*
     * Het moet mogelijk zijn om een kassa leeg te maken, zodat de prijs
     * voor een volgende klant vastgesteld kan worden.
     */
    public void resetKassa () {
        aantalProducten = 0;
        totaalprijsZonderKorting = 0.0;
    }
}
