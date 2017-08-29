package com.kodilla.stream.beautifier;

public class PoemBeautifier {

        public void beautify (String txt, PoemDecorator poemDecorator){
            String result = poemDecorator.textBeauty(txt);
            System.out.println("Result: " + result);
        }
}
