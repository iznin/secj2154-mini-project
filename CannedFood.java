public class CannedFood extends Groceries {
    private String expiredDate;
    private String type;

    public CannedFood(String desc, double price, String expiredDate, String type) {
        super(desc, price);
        this.expiredDate = expiredDate;
        this.type = type;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public String getType() {
        return type;
    }

    @Override
    public String displayInfo() {
        return "Grocery description: " + getDecription() + "\n" + "Canned Food Type: " + type + "\n" + "Expiry date: "
                + expiredDate + "\n" + "Price: USD " + String.format("%.2f", getPrice()) + "\n"
                + "Price converted to Malaysian: MYR " + String.format("%.2f", calcPriceInMYR()) + "\n";
    }

}
