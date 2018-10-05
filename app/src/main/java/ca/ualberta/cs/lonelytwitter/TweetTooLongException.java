/*
 * Copyright (c) Team 7, CMPUT301, University of Alberta - All Rights Reserved. You may use distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

/* This code demonstration was given by the CMPUT 301 lab TAs
Link: https://github.com/Rosevear/lonelyTwitter/tree/master/app/src/main/java/ca/ualberta/cs/lonelytwitter
 */

/**
 * Exception that is thrown whenever a Tweet's message is longer than the limit (140 characters)
 */
public class TweetTooLongException extends Exception {
    TweetTooLongException() {
        super("The message is too long! Please keep your tweets within 140 characters.");
    }
}
