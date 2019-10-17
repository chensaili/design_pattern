package decorator_pattern.decorator;

import decorator_pattern.Drink;

public  class Decorator extends Drink {
	//传入一个被封装的对象，这个对象可能是咖啡单品，也可能是已经被封装过的咖啡
	private Drink Obj;

	//在装饰者对象的构造方法中，必须传入超类
	public Decorator(Drink Obj){
		this.Obj=Obj;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		//自己的价格+被装饰对象的价格
		return super.getPrice()+Obj.cost();
	}
	@Override
	public String getDescription() {
		return super.description+"-"+super.getPrice()+"&&"+Obj.getDescription();
	}
}
