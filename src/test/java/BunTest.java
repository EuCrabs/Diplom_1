import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest extends BaseTest {

    private final String bunNamePositive = "Флюоресцентная булка R2-D3";
    private final String bunLongName = "Очень длинное составное название булки из нескольких наименований Флюоресцентная булка R2-D3 и Краторная булка N-200i";
    private final String bunEmptyName = "";
    private final String bunNullName = null;
    private final String bunNameNegative = "Булка со спецсимволами !?#$%^&*()~";
    private final float bunPricePositive = 988F;
    private final float bunPriceNegative = -1F;
    private final float bunZeroPrice = 0;
    private final float bunWithDecimalPartPrice = 10.0001F;

    @Test
    public void getBunNamePositive() {
        bun = new Bun(bunNamePositive, bunPricePositive);
        assertEquals(bunNamePositive, bun.getName());
    }
    @Test
    public void getBunLongName() {
        bun = new Bun(bunLongName, bunPricePositive);
        assertEquals(bunLongName, bun.getName());
    }
    @Test
    public void getBunEmptyName() {
        bun = new Bun(bunEmptyName, bunPricePositive);
        assertEquals(bunEmptyName, bun.getName());
    }
    @Test
    public void getBunNullName() {
        bun = new Bun(bunNullName, bunPricePositive);
        assertEquals(bunNullName, bun.getName());
    }
    @Test
    public void getBunNameNegative() {
        bun = new Bun(bunNameNegative, bunPricePositive);
        assertEquals(bunNameNegative, bun.getName());
    }

    @Test
    public void getBunPricePositive() {
        bun = new Bun(bunNamePositive, bunPricePositive);
        assertEquals(bunPricePositive, bun.getPrice(), 0);
    }
    @Test
    public void getBunPriceNegative() {
        bun = new Bun(bunNamePositive, bunPriceNegative);
        assertEquals(bunPriceNegative, bun.getPrice(), 0);
    }
    @Test
    public void getBunZeroPrice() {
        bun = new Bun(bunNamePositive, bunZeroPrice);
        assertEquals(bunZeroPrice, bun.getPrice(), 0);
    }
    @Test
    public void getBunWithDecimalPartPrice() {
        bun = new Bun(bunNamePositive, bunWithDecimalPartPrice);
        assertEquals(bunWithDecimalPartPrice, bun.getPrice(), 0);
    }
}
