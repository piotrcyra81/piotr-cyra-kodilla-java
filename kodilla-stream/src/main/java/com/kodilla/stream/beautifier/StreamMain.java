package com.kodilla.stream.beautifier;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("ABC", "ABC",  (txt0, txt1) -> txt0 +" between "+ txt1);
        poemBeautifier.beautify("abc", toUpperCase("ABC"), (txt0, txt1) -> txt0 +" To upper: "+ txt1);
        poemBeautifier.beautify(toUpperCase("aAa"), toLowerCase("AaA"), (txt0, txt1) -> txt0 +" To lower: "+ txt1);
    }
}