package strategy_pattern.pattern.duck;


import strategy_pattern.pattern.flybehavior.GoodFlyBehavior;
import strategy_pattern.pattern.quackbehavior.GaGaQuackBehavior;

public class GreenHeadDuck extends Duck {

	//在子类里设定具体的行为对象
	public GreenHeadDuck() {
		mFlyBehavior = new GoodFlyBehavior();
		mQuackBehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**GreenHead**");
	}
}