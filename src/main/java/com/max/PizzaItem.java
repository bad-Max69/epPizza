package com.max;

import java.util.HashMap;

public class PizzaItem {
    public PizzaItem(String namePizza, int numberPizza){
        numItem++;
        client++;
        if (namePizza.length() < 4 || namePizza.length() > 20) {
             namePizza = "Имя клиента "+Integer.toString(client)+ " " + String.valueOf(numberPizza);
        }
         this.namePizza = namePizza;
         this.numberPizza = numberPizza;
    }
    public void setNumberPizza(int numberPizza) {
        this.numberPizza = numberPizza;
    }

   private static int numItem = 10000;
   private static int client = 0;

  private int numberPizza;
  private boolean calzone = false;
  private HashMap<String, Integer> ingredients = new HashMap<String, Integer>(){{
        put("Tomato Paste", 1);
        put("Cheese", 1);
        put("Salami", (int) 1.5);
        put("Bacon", (int) 1.2);
        put("Garlic", (int) 0.3);
        put("Corn", (int) 0.7);
        put("Peperoni", (int) 0.6);
        put("Olives", (int) 0.5);
    }};
  private String namePizza;
  private Object[] pizza = {namePizza, ingredients, numberPizza, calzone};

    public void printItem(){
        System.out.println("Заказ "+numItem+"\nКлиент: "+client+"\nНазвание: "+namePizza+"\nКоличество: "+numberPizza);
    }


    public static void main(String[] args )
    {
        PizzaItem first = new PizzaItem("mat", 3);
        first.setNumberPizza(5);
        first.printItem();


    }
}
