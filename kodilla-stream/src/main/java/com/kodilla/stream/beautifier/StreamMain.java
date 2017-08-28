package com.kodilla.stream.beautifier;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Beautifier number ", "1", (txt0, txt1) -> txt0 + txt1);
        poemBeautifier.beautify("A ", toUpperCase("AAA To reduce"), (txt0, txt1) -> txt0);
        poemBeautifier.beautify("ABC", toLowerCase("ABC"), (txt0, txt1) -> txt0 + txt1);
        poemBeautifier.beautify(toUpperCase("aAaA"), toLowerCase("aAaA"), (txt0, txt1) -> txt0 + txt1);
    }
}