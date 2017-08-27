package com.kodilla.stream.beautifier;

public class PoemBeautifier {
        public void beautify (String a, String b, PoemDecorator poemDecorator){
            String result = poemDecorator.textBeauty(a, b);
            System.out.println("Result: " + result);
        }
}
