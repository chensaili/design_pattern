package factory_pattern.pizza;

public class PepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated traditional stub
		super.setname("PepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
