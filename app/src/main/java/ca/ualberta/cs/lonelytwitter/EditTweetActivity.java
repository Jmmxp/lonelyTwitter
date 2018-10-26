package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    public static String EXTRA_TWEET = "ca.ualberta.cs.lonelytwitter.tweet";

    private TextView messageTextView;
    private TextView dateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        messageTextView = (TextView) findViewById(R.id.tweet_message_text_view);
        dateTextView = (TextView) findViewById(R.id.tweet_date_text_view);

        Tweet tweet = (Tweet) getIntent().getSerializableExtra(EXTRA_TWEET);
        if (tweet != null) {
            messageTextView.setText(tweet.getMessage());
            dateTextView.setText(tweet.getDate().toString());
        }





    }
}
