package factory_pattern.method;

import factory_pattern.pizza.more_category.LDCheesePizza;
import factory_pattern.pizza.more_category.LDPepperPizza;
import factory_pattern.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
