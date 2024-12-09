package inheritens;

public class Bicyle {
    private int numWheels;
    private double price;

    public Bicyle(int numWheels2, double price2, String bikeType) {
        //TODO Auto-generated constructor stub
    }

    public void Vehicle() {
        numWheels = 0;
        price = 0;
    }

    public void Vehicle(int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Number of wheels: " + numWheels);
        System.out.println("Price: " + price);
    }
}

