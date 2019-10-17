package adapter_pattern;


import adapter_pattern.adapter.TurkeyAdapter;
import adapter_pattern.adapter.TurkeyAdapter2;
import adapter_pattern.duck.Duck;
import adapter_pattern.duck.GreenHeadDuck;
import adapter_pattern.turkey.WildTurkey;

public class MainTest {
	public static void main(String[] args) {
		GreenHeadDuck duck=new GreenHeadDuck();
		
		WildTurkey turkey=new WildTurkey();
		
		Duck duck2turkeyAdapter=new TurkeyAdapter(turkey);
		turkey.gobble();
		turkey.fly();
		duck.quack();
		duck.fly();
		duck2turkeyAdapter.quack();
		duck2turkeyAdapter.fly();
		
	
	}
}
