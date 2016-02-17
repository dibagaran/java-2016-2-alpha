package com.xeronith;

class Program {

    public static void main(String[] args) {

        Console.write("Shape Size? ");
        int size = Console.readInt();
        
        Console.write("Square or Triangle (s/t)? ");
        String choice = Console.readLine();

        switch (choice) {
            case "s":
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= size; j++)
                        Console.write("█ ");
                    Console.writeLine();
                }
                break;
            case "t":
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= i; j++)
                        Console.write("█ ");
                    Console.writeLine();
                }
                break;
            default:
                Console.writeLine("Your choice is not valid!");
                break;
        }
    }
}
