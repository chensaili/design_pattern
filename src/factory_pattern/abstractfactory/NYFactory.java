package factory_pattern.abstractfactory;


import factory_pattern.pizza.Pizza;
import factory_pattern.pizza.more_category.NYCheesePizza;
import factory_pattern.pizza.more_category.NYPepperPizza;

public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
