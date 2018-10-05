/*
 * Copyright (c) Team 7, CMPUT301, University of Alberta - All Rights Reserved. You may use distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Mood
 *
 * @author Justin Mah
 * @version 1.0
 * @see HappyMood
 * @see SadMood
 * @since 1.0
 */
public abstract class Mood {
    private Date date;

    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMoodString();

}
