package com.xeronith;

class Program {

    public static void main(String[] args) {
        
        Category category1 = new Category(82745, "Computer & Electronics");
        
        Product product1 = new Product(27846, "Logitech Wireless Mouse & Keyboard");
        Product product2 = new Product(27847, "Samsung LED Monitor", 1000, 20);
        
        category1.add(product1);
        category1.add(product2);
        
        Console.writeLine();
        Console.writeLine("----------- " + category1.getTitle() + " -----------");
        
        for (int i = 0; i < category1.getProductsCount(); i++) {
            Product product = category1.getProducts()[i];
            Console.write(i + 1 + ". ");
            Console.writeLine(product.getName());
        }
        
        Console.writeLine();
    }
}
