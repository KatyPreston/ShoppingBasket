public class Item {
    private double cost;
    private boolean twoForOneDiscount;

    public Item(double cost, boolean twoForOneDiscount){
        this.cost = cost;
        this.twoForOneDiscount = twoForOneDiscount;
    }

    public double getCost() {
        return this.cost;
    }

    public boolean hasDiscount(){
        return this.twoForOneDiscount;
    }

    public boolean setTwoForOneOffer(){
        return this.twoForOneDiscount = true;
    }
}
