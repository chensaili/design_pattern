package agent_pattern.dyn.myself;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        MyDog myDog=new MyDog();
        //这里使用的必须的接口对象，而不是接口的实现类
        Dog qiaoqiao=(Dog)Proxy.newProxyInstance(
                myDog.getClass().getClassLoader(),
                myDog.getClass().getInterfaces(),
                new DogInvocationHandler(myDog));
        qiaoqiao.eat();
        qiaoqiao.run();
    }
}
