package com.kodilla.stream.beautifier;

public class PoemBeautifier {

        public void beautify (String txt0, String txt1, PoemDecorator poemDecorator){
            String result = poemDecorator.textBeauty(txt0, txt1);
            System.out.println("Result: " + result);
        }
}
