package factory_pattern.traditional;

import factory_pattern.pizza.CheesePizza;
import factory_pattern.pizza.ChinesePizza;
import factory_pattern.pizza.GreekPizza;
import factory_pattern.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza(){
        Pizza pizza=null;
        String ordertype;
        while (true){
            ordertype=gettype();//获取用户输入的pizza类型
            if (ordertype.equals("cheese")) {
                pizza = new CheesePizza();
            } else if (ordertype.equals("greek")) {
                pizza = new GreekPizza();
            } /*else if (ordertype.equals("pepper")) {
                pizza = new PepperPizza();
            } */else if (ordertype.equals("chinese")) {
                pizza = new ChinesePizza();
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
    private String gettype() {
        try {
            BufferedReader string = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println("input pizza type:");
            String str = string.readLine();

            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
