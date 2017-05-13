package org.spring.boot.spel;

import java.util.Random;

/**
 *  RandomText class.
 */
public class RandomText {

    /** Array of strings. */
    private static String[] texts = {
            "I'll be back",
            "Get out!",
            "I want your clothes, boots and motorcycle."
    };

    /**
     *  Get the text.
     *  @return text
     */
    public String getText() {
        Random random = new Random();

        return texts[random.nextInt(texts.length)];
    }
}
