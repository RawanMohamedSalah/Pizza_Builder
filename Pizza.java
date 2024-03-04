package pizza_pro;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private String size;
    private String crustType;
    private List<String> toppings;

    // Constructor that takes a builder and constructs the pizza
    public Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crustType = builder.crustType;
        this.toppings = builder.toppings;
    }

    // Getter methods for pizza properties
    public String getSize() {
        return size;
    }

    public String getCrustType() {
        return crustType;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crustType=" + crustType + ", toppings=" + toppings + "]";
    }
}



