/*
 * Copyright (c) Team 7, CMPUT301, University of Alberta - All Rights Reserved. You may use distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

/* This code demonstration was given by the CMPUT 301 lab TAs
Link: https://github.com/Rosevear/lonelyTwitter/tree/master/app/src/main/java/ca/ualberta/cs/lonelytwitter
 */

import java.util.Date;

/**
 * Interface that represents if an object is Tweetable, specifically if it has a message and date
 * to be tweeted
 */
public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
