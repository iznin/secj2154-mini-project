public class Fruit extends Groceries {
    private double weight;

    public Fruit(String desc, double price, double weight){
        super(desc, price);
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public double calcWeightInGram(){
        return weight * poundToGram;
    }

    @Override
    public String displayInfo() {

        return "Grocery description: " + getDecription() + "\n" + "Weight in pound: " + weight + "\n" + "Weight in gram: " + calcWeightInGram() + "\n" + "Price: USD " + String.format("%.2f", getPrice()) + "\n" + "Price converted to Malaysian: MYR " + String.format("%.2f", calcPriceInMYR()) +"\n";

    }
}
