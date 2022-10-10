package i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test
    void localeTest() {
        String msg = "Добро пожаловать";
        Country country = Country.RUSSIA;
        LocalizationService loc = new LocalizationServiceImpl();
        final String msg_checked = loc.locale(country);
        Assertions.assertEquals(msg, msg_checked);
    }

    @Test
    void locale2Test() {
        String msg = "Welcome";
        Country country = Country.USA;
        LocalizationService loc = new LocalizationServiceImpl();
        final String msg_checked = loc.locale(country);
        Assertions.assertEquals(msg, msg_checked);
    }

    @Test
    void locale3Test() {
        String msg = "Welcome";
        Country country = Country.RUSSIA;
        LocalizationService loc = new LocalizationServiceImpl();
        final String msg_checked = loc.locale(country);
        Assertions.assertNotEquals(msg, msg_checked);
    }
}