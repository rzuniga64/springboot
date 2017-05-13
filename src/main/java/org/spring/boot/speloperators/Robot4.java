package org.spring.boot.speloperators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *  Robot class.
 */
@Component
public class Robot4 {

    /** ID. */
    private String id = "Default robot";
    /** Speech. */
    private String speech = "hello";

    /** Speak method. */
    public void speak() {
        System.out.println(id + ": " + speech);
    }

    /**
     * Set ID.
     * @param newId newId
     */
    @Autowired
    public void setId(final @Value("#{randomText.getText()?.length()}") String newId) {
        this.id = newId;
    }

    /**
     * Set speech.
     * @param newSpeech newSpeech
     */
    @Autowired
    // new java.util.Date().toString()
    public void setSpeech(final @Value("#{T(Math).sin(T(Math).PI/4) ^ 2 le 0.8 ? 'yes':'no'}") String newSpeech) {
        this.speech = newSpeech;
    }
}
