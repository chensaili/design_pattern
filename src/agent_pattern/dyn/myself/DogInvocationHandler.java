package agent_pattern.dyn.myself;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DogInvocationHandler implements InvocationHandler {

    Dog dog;
    public DogInvocationHandler(Dog dog){
        this.dog=dog;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("乔乔is lovely");
        return method.invoke(dog,args);
    }
}
