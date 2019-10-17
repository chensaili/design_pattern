package factory_pattern.pizza.more_category;

import factory_pattern.pizza.Pizza;

public class LDPepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("LDPepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
