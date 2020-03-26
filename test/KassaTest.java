import org.junit.Test;

import static org.junit.Assert.*;

public class KassaTest {

    @Test
    public void testDeToepassingVanKortingNaToevoegenVanProducten () {
        Kassa kassa = new Kassa ();
        Product product1 = new Product ("Product 1");
        product1.setPrijs(10.0);
        Product product2 = new Product ("Product 2");
        product2.setPrijs(20.0);
        Product product3 = new Product ("Product 3");
        product3.setPrijs(20.0);
        Product product4 = new Product ("Product 4");
        product4.setPrijs(60.0);
        assertEquals (0.0, kassa.getTotaalprijsMetKorting(), 0.1);
        kassa.voegProductToe(product1);
        assertEquals (10.0, kassa.getTotaalprijsMetKorting(), 0.1);
        kassa.voegProductToe(product2);
        assertEquals (30.0, kassa.getTotaalprijsMetKorting(), 0.1);
        kassa.voegProductToe(product3);
        assertEquals (50.0, kassa.getTotaalprijsMetKorting(), 0.1);
        kassa.voegProductToe(product4);
        assertEquals (99.0, kassa.getTotaalprijsMetKorting(), 0.1);
        kassa.resetKassa();
        assertEquals (0.0, kassa.getTotaalprijsMetKorting(), 0.1);
    }
}