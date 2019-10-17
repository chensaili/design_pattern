package factory_pattern.simplefactory;

import factory_pattern.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    SimplePizzaFactory simplePizzaFactory;

    public OrderPizza(SimplePizzaFactory simplePizzaFactory){
        setFactory(simplePizzaFactory);
    }

    public void setFactory(SimplePizzaFactory simplePizzaFactory) {
        Pizza pizza = null;
        String ordertype;

        this.simplePizzaFactory = simplePizzaFactory;

        while (true){
            ordertype = gettype();
            pizza = simplePizzaFactory.createPizza(ordertype);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }

    }
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
