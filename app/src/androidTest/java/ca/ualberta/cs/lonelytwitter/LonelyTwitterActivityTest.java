package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(LonelyTwitterActivity.class);
    }


    @Override
    public void setUp() {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() {
        solo.finishOpenedActivities();
    }

    // all of the test methods should be independent of the other. Before running every test,
    // setUp is automatically called and after finished running, tearDown is called

    public void testTweet() {
        // message is the message that prints when the test fails
        solo.assertCurrentActivity("wrong activity", "LonelyTwitterActivity");
    }

    public void testEquals() {
        assertEquals("not equal", "5", "5");
    }

    public void testAddTweet() {
        EditText body = (EditText) solo.getView(R.id.body);

        solo.enterText(body, "dont know");

        solo.clickOnButton("Save");
        solo.clearEditText(body);

        assertTrue((solo.waitForText("dont know")));
    }

}
