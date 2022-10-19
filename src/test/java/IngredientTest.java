import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTest extends BaseTest {
    private final IngredientType ingredientType;
    private final String ingredientName;
    private final float ingredientPrice;

    public IngredientTest(IngredientType ingredientType, String ingredientName, float ingredientPrice) {
        this.ingredientType = ingredientType;
        this.ingredientName = ingredientName;
        this.ingredientPrice = ingredientPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {IngredientType.FILLING, "Мясо бессмертных моллюсков Protostomia", 1337},
                {IngredientType.SAUCE, "Соус с шипами Антарианского плоскоходца", 88},
        };
    }

    @Test
    public void getIngredientType() {
        ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        assertEquals(ingredientType, ingredient.getType());
    }

    @Test
    public void getIngredientName() {
        ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        assertEquals(ingredientName, ingredient.getName());
    }

    @Test
    public void getIngredientPrice() {
        ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        assertEquals(ingredientPrice, ingredient.getPrice(), 0);
    }
}
