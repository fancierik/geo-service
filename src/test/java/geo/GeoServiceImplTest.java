package geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {

    @Test
    public void byIpTest1() {
        final Location target = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        final String someIp = "172.0.32.11";
        GeoService geo = new GeoServiceImpl();

        final Location result = geo.byIp(someIp);

        Assertions.assertEquals(target.getStreet(), result.getStreet());

    }

    @Test
    public void byIpTest2() {
        final Location target = new Location("New York", Country.USA, "10th Avenue", 32);
        final String someIp = "172.0.32.11";
        GeoService geo = new GeoServiceImpl();

        final Location result = geo.byIp(someIp);

        Assertions.assertNotEquals(target.getStreet(), result.getStreet());

    }

    @Test
    public void byIpTest3() {
        final Location target = new Location("Moscow", Country.RUSSIA, null, 0);
        final String someIp = "96.44.183.149";
        GeoService geo = new GeoServiceImpl();

        final Location result = geo.byIp(someIp);

        Assertions.assertNotEquals(target.getStreet(), result.getStreet());

    }
}