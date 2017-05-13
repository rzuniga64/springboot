package org.spring.boot.props;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *  Robot class.
 */
@Component
public class Robot5 {

    /** ID. */
    //@Value("${jdbc.username}")
    private String id;

    /** Speech. */
    //@Value("${jdbc.password}")
    private String speech;

    /** Speak method. */
    public void speak() {
        System.out.println(id + ": " + speech);
    }

    /**
     *  Set ID.
     *  @param newId newId
     */
    public void setId(final String newId) {
        this.id = newId;
    }

    /**
     *  Set speech.a
     *  @param newSpeech newSpeech
     */
    public void setSpeech(final String newSpeech) {
        this.speech = newSpeech;
    }
}
