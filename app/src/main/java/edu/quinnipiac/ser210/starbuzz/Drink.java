package edu.quinnipiac.ser210.starbuzz;

public class Drink {
    private String name,description;
    private int imageResourceID;

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Higherst quality beans roasted and brewed fresh", R.drawable.filter),
    };

    private Drink(String name, String description, int imageResourceID){
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }

    public int getImageResourceID(){
        return this.imageResourceID;
    }

    public String toString() {
        return this.name;
    }
}
