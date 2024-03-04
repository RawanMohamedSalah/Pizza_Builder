package pizza_pro;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		Pizza pizza = new PizzaBuilder()
			    .setSize("Large")
			    .setCrustType("Thin")
			    .setToppings(Arrays.asList("Pepperoni", "Mushrooms"))
			    .build();
		
		System.out.println(pizza);
	}
}
