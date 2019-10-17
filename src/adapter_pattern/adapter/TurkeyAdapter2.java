package adapter_pattern.adapter;


import adapter_pattern.duck.Duck;
import adapter_pattern.turkey.WildTurkey;
//对象适配器和类适配器都需要实现目标对象的接口
public class TurkeyAdapter2 extends WildTurkey implements Duck {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		super.gobble();
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
		super.fly();
		super.fly();
	}
}
