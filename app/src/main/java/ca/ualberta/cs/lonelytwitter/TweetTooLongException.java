package ca.ualberta.cs.lonelytwitter;

/* This code demonstration was given by the CMPUT 301 lab TAs
Link: https://github.com/Rosevear/lonelyTwitter/tree/master/app/src/main/java/ca/ualberta/cs/lonelytwitter
 */

public class TweetTooLongException extends Exception {
    TweetTooLongException() {
        super("The message is too long! Please keep your tweets within 140 characters.");
    }
}
