/*
 * Copyright (c) Team 7, CMPUT301, University of Alberta - All Rights Reserved. You may use distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A mood that represents a happy emotion
 */
public class HappyMood extends Mood {
    public HappyMood() {
        super();
    }

    public HappyMood(Date date) {
        super(date);
    }

    public String getMoodString() {
        return ":)";
    }
}
