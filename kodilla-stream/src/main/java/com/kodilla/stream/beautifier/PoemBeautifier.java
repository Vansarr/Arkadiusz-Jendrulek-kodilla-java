package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify (String poem, PoemDecrator poemDecorator) {
        String beautyPoem = poemDecorator.decorate(poem);
        System.out.println(beautyPoem);
    }

}
