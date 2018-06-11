import java.util.ArrayList;

public class Basket {
    private ArrayList<Item> items;

    public Basket(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void emptyBasket() {
        this.items.clear();
    }

    public double totalCost() {
        double total = 0;
        for (Item item : items) {
            total += item.getCost();
        }
        if(total > 20){
            double reduction = total * 0.1;
            return total -= reduction;
        }
        else{
        return total;
        }
    }

}




