package com.oprotsen.JavaSTART;

public class SymbolsInTextFinder {
    // Найти, сколько раз в следующем тексте встречаются буквы “a”, “e”, “i”.

    public static void main(String[] args) {
        findSymbols("Treating objects as service providers is a great simplifying tool. " +
                "This is useful not only during the design process, " +
                "but also when someone else is trying to understand your code or reuse an object. " +
                "If they can see the value of the object based on what service it provides, " +
                "it makes it much easier to fit it into the design.");
    }
    public static void findSymbols(String text) {
        char a = 'a';
        char e = 'e';
        char i = 'i';
        int counter = 0;
        for (char letter: text.toCharArray()) {
            if (letter == a || letter == e || letter == i)
                counter++;
        }
        System.out.println(counter);
    }
}
