import java.util.ArrayList;

public class Customer{
    private String name;
    private double totalPrice;
    private ArrayList<Groceries> groceriesList;

    public Customer() {}

    
    public Customer(String name){
        this.name = name;
        groceriesList = new ArrayList<Groceries>();

    }

    public String getName(){
        return name;
    }

    public void buy(Groceries item){
        groceriesList.add(item);
        for(int i = 0; i<groceriesList.size(); i++){
            totalPrice = totalPrice + groceriesList.get(i).getPrice();
        }
        
    }

    public String toString(){
        return "<<< " + name +"'s grocery shopping list >>>"; 
    }

    public void print(){
        System.out.println("Number of items purchased: " + calcItemPurchased()+ "\n");
        for (int i = 0; i<groceriesList.size(); i++){
            System.out.println("Item " + (i+1));
            System.out.println(groceriesList.get(i).displayInfo());
            System.out.println();
        }
        System.out.println("TOTAL PRICE: MYR " +  String.format("%.2f", totalPrice));
        
    }

    public int calcItemPurchased(){
        return groceriesList.size();
    }
}