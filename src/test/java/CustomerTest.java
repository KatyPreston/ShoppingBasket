import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    Basket basket;
    Item item;
    ArrayList<Item> items;

    @Before
    public void before(){
        item = new Item(10);
        items = new ArrayList<>();
        basket = new Basket(items);
        customer = new Customer(basket, false);
    }

    @Test
    public void canSeeIfHaveLoyaltyCard(){
        assertEquals(false, customer.hasLoyaltyCard());
    }
}
