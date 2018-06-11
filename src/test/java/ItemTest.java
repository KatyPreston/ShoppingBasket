import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    Item item;

    @Before
    public void before(){
        item = new Item(10, false);
    }

    @Test
    public void canGetCost(){
        assertEquals(10, item.getCost(), 0.1);
    }

    @Test
    public void canGetDiscount(){
        assertEquals(false, item.hasDiscount());
    }

    @Test
    public void canSetDiscount(){
        assertEquals(true, item.setTwoForOneOffer());
    }

}
