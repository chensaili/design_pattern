package decorator_pattern;


import decorator_pattern.coffee.Decaf;
import decorator_pattern.coffee.LongBlack;
import decorator_pattern.decorator.Chocolate;
import decorator_pattern.decorator.Milk;

public class CoffeeBar {
	public static void main(String[] args) {
		
		Drink order=new Decaf();
		System.out.println("order1 price:"+order.cost());
		System.out.println("order1 desc:"+order.getDescription());
		
		System.out.println("****************");
		order=new LongBlack();
		order=new Milk(order);
		order=new Chocolate(order);
		order=new Chocolate(order);
		System.out.println("order2 price:"+order.cost());
		System.out.println("order2 desc:"+order.getDescription());
		
	}
}
