package hw_OOP_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMachine {

    Coffee latte = new Coffee("Latte", 4.59);
    Coffee cappuccino = new Coffee("Cappuccino",4.99);
    Coffee macchiato = new Coffee("Macchiato",5.99);

    Coffee espresso = new Coffee("Espresso",3.99);

    public Integer getCount() {
        return count;
    }

    public ArrayList<Coffee> getCoffeeList() {
        return coffeeList;
    }

    ArrayList<Coffee> coffeeList = new ArrayList<>();
    public Integer count;
    public CoffeeMachine addCoffeeToList(Coffee coffeeName){
        coffeeList.add(coffeeName);
        return this;
    }


    public CoffeeMachine showCoffeeList(){
        for (var item: coffeeList) {
            System.out.println(item);
        }
        return this;
    }

    public CoffeeMachine chooseCoffee(){
        System.out.println("Introduce a number to choose your coffee:\n"+
                "1 for Cappuccino:\n"+
                "2 for Latte:\n"+
                "3 for Macchiato:\n"+
                "4 for Espresso:");
        Scanner myScan = new Scanner(System.in);
        int myNumber = myScan.nextInt();
        if (myNumber<=this.coffeeList.size() & myNumber>0){
            for (int i = 0; i < this.coffeeList.size(); i++) {
                if (myNumber == i+1){
                    System.out.println("---------------------------------------");
                    System.out.println(this.coffeeList.get(i));
                    System.out.println("Enjoy your drink");;
                }
            }
        }
        return this;
    }

}
