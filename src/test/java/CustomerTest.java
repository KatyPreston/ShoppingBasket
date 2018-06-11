import org.junit.Before;

import java.util.ArrayList;

public class CustomerTest {
    Customer customer;
    Basket basket;
    Item item;
    ArrayList<Item> items;

    @Before
    public void before(){
        item = new Item();
        items = new ArrayList<>();
        basket = new Basket(items);
        customer = new Customer(basket, false);
    }
}
