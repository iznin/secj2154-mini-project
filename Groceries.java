public abstract class Groceries implements Convertible {
    private String description;
    private double price;

    public Groceries() {}

    public Groceries(String desc, double price) {
        this.description = desc;
        this.price = price;
    }

    public String getDecription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double calcPriceInMYR() {
        return price * USDToMYR;
    }

    public abstract String displayInfo();
}
