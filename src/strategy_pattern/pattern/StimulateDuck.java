package strategy_pattern.pattern;


import strategy_pattern.pattern.duck.Duck;
import strategy_pattern.pattern.duck.GreenHeadDuck;
import strategy_pattern.pattern.duck.RedHeadDuck;
import strategy_pattern.pattern.flybehavior.NoFlyBehavior;
import strategy_pattern.pattern.quackbehavior.NoQuackBehavior;

public class StimulateDuck {
	public static void main(String[] args) {

		Duck mGreenHeadDuck = new GreenHeadDuck();
		Duck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.Fly();
		mGreenHeadDuck.Quack();
		mGreenHeadDuck.swim();

		mRedHeadDuck.display();
		mRedHeadDuck.Fly();
		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();
		mRedHeadDuck.display();
		mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
		mRedHeadDuck.Fly();
		mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
		mRedHeadDuck.Quack();
	}

}
