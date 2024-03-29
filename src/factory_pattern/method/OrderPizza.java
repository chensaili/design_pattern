package factory_pattern.method;

import factory_pattern.pizza.Pizza;
import factory_pattern.simplefactory.SimplePizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    public OrderPizza(){
        Pizza pizza=null;
        String ordertype;
        while(true){
            ordertype=gettype();
            pizza=createPizza(ordertype);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

    abstract  Pizza createPizza(String ordertype);

    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();

            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
