package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("tekst do powiększenia", txt -> txt.toUpperCase());
        poemBeautifier.beautify("TEKST DO ZMNIEJSZENIA", txt -> txt.toLowerCase());
        poemBeautifier.beautify("Tekst pomiędzy literami ", txt -> "ABC "+ txt +"ABC");
        poemBeautifier.beautify("Tekst w nowej lini", txt -> '\n'+ txt);
    }
}
