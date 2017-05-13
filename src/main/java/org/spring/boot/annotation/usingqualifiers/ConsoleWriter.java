package org.spring.boot.annotation.usingqualifiers;

/**
 * ConsoleWriter Class.
 */
public class ConsoleWriter implements LogWriter {

    /**
     *  Write to the console.
     *   @param text text
     */
    public void write(final String text) {
        System.out.println(text);
    }
}
