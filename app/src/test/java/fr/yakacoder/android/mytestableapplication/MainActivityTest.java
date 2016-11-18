package fr.yakacoder.android.mytestableapplication;

import android.os.Build;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static junit.framework.Assert.assertEquals;

/**
 * Created by odenier on 18/11/2016.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, application = MyTestableApplication.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class MainActivityTest {

    private ActivityController<MainActivity> controller;
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);

//        controller = Robolectric.buildActivity(MainActivity.class);
//        activity = controller.create().get();
    }

    @Test
    public void click_on_ValidButton_should_update_DataTextView() {
        activity.mDataEditText.setText("");
        assertEquals(0, activity.mDataTextView.getText().length());

        activity.mDataEditText.setText("android");

        activity.mValidButton.performClick();

        assertEquals(activity.mDataEditText.getText().toString(), activity.mDataTextView.getText().toString());
    }

    @After
    public void tearDown() {
        // Destroy activity after every test
//        controller.pause().stop();
    }
}