package com.kodilla.stream.beautifier;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Beautifier number ", "1", (a, b) -> a + b);
        poemBeautifier.beautify("A ", toUpperCase("To Upper"), (a, b) -> a + b);
        poemBeautifier.beautify("ABC", toLowerCase("ABC"), (a, b) -> a + b);
        poemBeautifier.beautify(toUpperCase("aAaA"), toLowerCase("aAaA"), (a, b) -> a + b);
    }
}