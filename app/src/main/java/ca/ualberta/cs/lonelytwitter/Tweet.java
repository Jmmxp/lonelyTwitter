package ca.ualberta.cs.lonelytwitter;

/* This code demonstration was given by the CMPUT 301 lab TAs
Link: https://github.com/Rosevear/lonelyTwitter/tree/master/app/src/main/java/ca/ualberta/cs/lonelytwitter
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tweet implements Tweetable {
    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;
    private List<Mood> moods;

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= MAX_CHARS) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public String getMessage() {
        return message;
    }

    public void setDate(Date date) {
        this.date = date;

    }

    public Date getDate() {
        return date;
    }

    public List<Mood> getMoods() {
        return moods;
    }

    public void setMoods(List<Mood> moods) {
        this.moods = moods;
    }

    public void addMood(Mood mood) {
        this.moods.add(mood);
    }

    public Boolean isImportant() {
        return false;
    }

    @Override
    public String toString() {
        return this.date.toString() + " | " + this.message;
    }
}
