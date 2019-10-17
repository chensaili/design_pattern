package factory_pattern.pizza;

public class CheesePizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated traditional stub
		super.setname("CheesePizza");
		
		System.out.println(name+" preparing;");
	}
}
