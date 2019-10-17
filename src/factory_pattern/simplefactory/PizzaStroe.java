package factory_pattern.simplefactory;


public class PizzaStroe {
	public static void main(String[] args) {
		OrderPizza mOrderPizza=new	OrderPizza(new SimplePizzaFactory());
	}
}
