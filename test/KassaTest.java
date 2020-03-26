import org.junit.*;
import static org.junit.Assert.assertEquals;

class KassaTest {

    @Test
    public void testDeToepassingVanKortingNaToevoegenVanProducten () {
        Kassa kassa = new Kassa ();
        assertEquals (0.0, kassa.getTotaalprijsMetKorting(), 0.1);
        kassa.voegProductToe(10.0);
        assertEquals (10.0, kassa.getTotaalprijsMetKorting(), 0.1);
        kassa.voegProductToe(20.0);
        assertEquals (30.0, kassa.getTotaalprijsMetKorting(), 0.1);
        kassa.voegProductToe(20.0);
        assertEquals (50.0, kassa.getTotaalprijsMetKorting(), 0.1);
        kassa.voegProductToe(60.0);
        assertEquals (99.0, kassa.getTotaalprijsMetKorting(), 0.1);
        kassa.resetKassa();
        assertEquals (0.0, kassa.getTotaalprijsMetKorting(), 0.1);
    }
}