package factory_pattern.simplefactory;

import factory_pattern.pizza.CheesePizza;
import factory_pattern.pizza.GreekPizza;
import factory_pattern.pizza.PepperPizza;
import factory_pattern.pizza.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String ordertype){
        Pizza pizza=null;
        if (ordertype.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (ordertype.equals("greek")) {
            pizza = new GreekPizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
