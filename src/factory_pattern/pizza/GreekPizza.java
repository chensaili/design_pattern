package factory_pattern.pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated traditional stub
		super.setname("GreekPizza");
		
		System.out.println(name+" preparing;");
	}

}
