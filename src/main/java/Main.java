import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Product("Milk", 300))
                .addProduct(new Product("vine", 500))
                .addProduct(new Product("water", 130))
                .addProduct(new Product("apple", 125))
                .addProduct(new Yogurt("Danone", 100, "Sweet"))
                .addProduct(new Drink("Kola", 500, 0.5))
                .addProduct(new Fruits("melon",230,"Collective farmer"));
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        Product found = vendingMachine.fineProduct("melon");
        System.out.println(found);
        System.out.println("Покупаем товар");
        Product sold = vendingMachine.sellProduct(found);
        System.out.println(sold);
        System.out.println("В автомате столько денег");
        System.out.println(vendingMachine.getAmount());
        System.out.println("________________");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println("Покупаем товар");
        Product yogurt = vendingMachine.sellProduct(vendingMachine.fineProduct("Danone"));
        System.out.println(yogurt);
        System.out.println("Осталось товаров");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println("Денег в автомате");
        System.out.println(vendingMachine.getAmount());
        try {
            Product yogurt1 = vendingMachine.sellProduct(vendingMachine.fineProduct("Danone"));
            System.out.println(yogurt1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
