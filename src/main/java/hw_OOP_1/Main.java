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
�� ������ ���� � ����� �������� ��� ���� ����� ��������,
 (������, ������� ,� �.�., ����� �������� ��������� �������),
  ��� ������ ������������� �� ������ Product,
  ���� �������������� ����� toString � ����������� �������� ��� ������ � VendingMachine,
  ������� ������ ������� �� VendingMachine

(*) ������� �������� �������� �������, ������� � �������� ������ ��������� ��������� ������: ������������, �����, �����������, ����. ������������������� ��������� �������� � ������ main � �������� �������, ������������� ������ ������� ��������. ������� �� ������ ���


     */
}
