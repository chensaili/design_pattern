package agent_pattern.dyn.myself;

public class MyDog implements Dog {
    @Override
    public void eat() {
        System.out.println("eat meat");
    }

    @Override
    public void run() {
        System.out.println("love run");
    }
}
