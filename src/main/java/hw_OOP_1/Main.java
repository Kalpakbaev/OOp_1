package hw_OOP_1;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addCoffeeToList(coffeeMachine.cappuccino)
                .addCoffeeToList(coffeeMachine.latte)
                .addCoffeeToList(coffeeMachine.macchiato)
                .addCoffeeToList(coffeeMachine.espresso)
                .showCoffeeList();

        System.out.println("-------------------------------------------------");
        coffeeMachine.chooseCoffee();





    }


    /*
Ќа основе кода с урока добавить еще один класс продукта,
 (ћолоко, шоколад ,и т.п., можно добавить несколько классов),
  они должны наследоватьс€ от класса Product,
  надо переопределить метод toString и попробовать включить эти классы в VendingMachine,
  вывести список товаров из VendingMachine

(*) —оздать торговый кофейный автомат, напитки в автомате должны содержать следующие данные: наименование, объем, температура, цена. ѕроинициализировать несколько напитков в классе main и торговый автомат, воспроизвести логику продажи напитков. —делать на основе ќќѕ


     */
}
