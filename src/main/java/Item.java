public class Item {
    private double cost;
    private boolean twoForOneDiscount;

    public Item(double cost){
        this.cost = cost;
        this.twoForOneDiscount = false;
    }

    public double getCost(){
        return this.cost;
    }

    public boolean hasDiscount(){
        return this.twoForOneDiscount;
    }

    public boolean setTwoForOneOffer(){
        return this.twoForOneDiscount = true;
    }
}
