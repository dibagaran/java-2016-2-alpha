package com.xeronith;

class Program {
	public static void main(String[] args) {
            
            String[] words = { "book", "computer", "programming" },
                     translations = { "کتاب", "رایانه", "برنامه نویسی" };
            
            Console.write("Please enter a word: ");
            String input = Console.readLine();
            
            boolean found = false;
            for(int i = 0; i < words.length; i++) {
                if(input.equals(words[i])) {
                    Console.writeLine(translations[i]);
                    found = true;
                    break;
                }
                
                if(input.equals(translations[i])) {
                    Console.writeLine(words[i]);
                    found = true;
                    break;
                }
            }
            
            if(!found)
                Console.writeLine("Not found!");
	}
}
