package factory_pattern.method;

import factory_pattern.pizza.more_category.NYCheesePizza;
import factory_pattern.pizza.more_category.NYPepperPizza;
import factory_pattern.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
