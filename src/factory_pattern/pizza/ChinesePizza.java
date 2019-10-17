package factory_pattern.pizza;

public class ChinesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated traditional stub
		super.setname("ChinesePizza");
		
		System.out.println(name+" preparing;");
	}

}
