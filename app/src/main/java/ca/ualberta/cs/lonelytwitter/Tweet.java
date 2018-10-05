/*
 * Copyright (c) Team 7, CMPUT301, University of Alberta - All Rights Reserved. You may use distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

/* This code demonstration was given by the CMPUT 301 lab TAs
Link: https://github.com/Rosevear/lonelyTwitter/tree/master/app/src/main/java/ca/ualberta/cs/lonelytwitter
 */


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Represents a Tweet
 *
 * @author Justin Mah
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public class Tweet implements Tweetable {
    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;
    private List<Mood> moods;

    /**
     *
     * @param message the new message to set for the Tweet
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= MAX_CHARS) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     *
     * @return the message for this Tweet
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param date the new date to set for this tweet
     */
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
