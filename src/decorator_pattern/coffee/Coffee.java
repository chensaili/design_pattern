package decorator_pattern.coffee;


import decorator_pattern.Drink;

public  class Coffee extends Drink {
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}
}
