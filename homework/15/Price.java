package flower;

abstract class Price {

    private int price;

     Price(int price) {

        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
