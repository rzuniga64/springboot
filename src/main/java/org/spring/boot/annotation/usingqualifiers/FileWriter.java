package org.spring.boot.annotation.usingqualifiers;

/**
 *  FileWriter class.
 */
public class FileWriter implements LogWriter {

    /**
     *  Write to a file.
     *  @param text text
     */
    public void write(final String text) {
        // Write to a file here.
        // Dummy implementation
        System.out.println("Write to file: " + text);
    }
}
