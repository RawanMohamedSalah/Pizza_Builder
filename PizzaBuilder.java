package pizza_pro;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
	  protected String size;
	    protected String crustType;
	    protected List<String> toppings = new ArrayList<>();

	    // Setter methods for pizza properties
	    public PizzaBuilder setSize(String size) {
	        this.size = size;
	        return this;
	    }

	    public PizzaBuilder setCrustType(String crustType) {
	        this.crustType = crustType;
	        return this;
	    }

	    public PizzaBuilder setToppings(List<String> toppings) {
	        this.toppings = new ArrayList<>(toppings);
	        return this;
	    }

	    // The build method creates a new Pizza instance with the current state of the builder
	    public Pizza build() {
	        return new Pizza(this);
	    }
	}

	   
	   
	   

