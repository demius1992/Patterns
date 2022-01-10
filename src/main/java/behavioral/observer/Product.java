package behavioral.observer;

import java.util.Vector;

class Product {
    // name
    private String name;
    // price
    private double price;
    private Vector<Buyer> buyers;

    public Product(String pName, double pPrice) {
        name = pName;
        price = pPrice;
        buyers = new Vector<Buyer>();
    }

    // adding a specific customer
    public void Attach(Buyer pBuyer) {
        buyers.add(pBuyer);
    }

    // deleting a specific customer
    public void Detach(Buyer pBuyer) {
        int index = buyers.indexOf(pBuyer);
        if (index != -1) {
            buyers.remove(index);
        }
    }

    // notifying all buyers of the status change
    public void Notify() {
        for (int i = 0; i < buyers.size(); i++) {
            buyers.get(i).Update(this);
        }
        System.out.print("\n");
    }

    public String GetName() {
        return name;
    }

    double GetPrice() {
        return price;
    }

    // setting a new price and informing buyers about it
    void SetPrice(double pPrice) {
        if (price != pPrice) {
            price = pPrice;
            Notify();
        }
    }
}
