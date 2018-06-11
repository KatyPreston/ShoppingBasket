import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BasketTest {
    Basket basket;
    Item item;
    ArrayList<Item> items;

    @Before
    public void before(){
        item = new Item(10);
        items = new ArrayList<>();
        basket = new Basket(items);
    }

    @Test
    public void canAddItem(){
        basket.addItem(item);
        assertEquals(1, items.size());
    }

    @Test
    public void canRemoveItem(){
        basket.addItem(item);
        basket.removeItem(item);
        assertEquals(0, items.size());
    }

    @Test
    public void canEmptyBasket(){
        basket.addItem(item);
        basket.addItem(item);
        assertEquals(2, items.size());
        basket.emptyBasket();
        assertEquals(0, items.size());
    }

    @Test
    public void canGetTotalCostOfBasket(){
        basket.addItem(item);
        basket.addItem(item);
        assertEquals(20, basket.totalCost(), 0.1);
    }

    @Test
    public void cangetTenPercentOffForOverTwenty(){
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        assertEquals(27, basket.totalCost(), 0.1);
    }
}
