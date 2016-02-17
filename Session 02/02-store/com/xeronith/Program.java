package com.xeronith;

class Program {

    public static void main(String[] args) {

        int maxProducts = 100;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int[] productCounts = new int[maxProducts];
        int current = 0;

        String[] menu = {
            "Add Product",
            "List Products",
            "Exit"
        };

        while (true) {
            Console.clear();

            for (int i = 0; i < menu.length; i++)
                Console.writeLine((i + 1) + ". " + menu[i]);

            int choice = Console.readInt();
            switch (choice) {
                case 1:
                    if (current < maxProducts) {
                        Console.write("Name: ");
                        String name = Console.readLine();
                        Console.write("Price: ");
                        int price = Console.readInt();
                        Console.write("Count: ");
                        int count = Console.readInt();

                        productNames[current] = name;
                        productPrices[current] = price;
                        productCounts[current] = count;
                        current++;

                        Console.writeLine("Product successfully added!");
                    } else
                        Console.writeLine("Out of memory!");
                    break;
                case 2:
                    if (current == 0) {
                        Console.writeLine("No products to show.");
                    } else {
                        for (int i = 0; i < current; i++) {
                            Console.writeLine("Name: " + productNames[i]);
                            Console.writeLine("Price: " + productPrices[i] + "$");
                            Console.writeLine("Count: " + productCounts[i]);
                            Console.writeLine("-----------------------------");
                        }
                    }
                    break;
                case 3:
                    Console.exit();
                    break;
                default:
                    Console.writeLine("Invalid choice!");
                    break;
            }

            Console.readLine();
        }
    }
}
