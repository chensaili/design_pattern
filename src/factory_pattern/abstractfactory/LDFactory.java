package factory_pattern.abstractfactory;


import factory_pattern.pizza.Pizza;
import factory_pattern.pizza.more_category.LDCheesePizza;
import factory_pattern.pizza.more_category.LDPepperPizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
