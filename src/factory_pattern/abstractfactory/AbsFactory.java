package factory_pattern.abstractfactory;

import factory_pattern.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String ordertype);
}
