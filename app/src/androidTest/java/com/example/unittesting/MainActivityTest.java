package com.example.unittesting;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.TypeTextAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.lang.reflect.Type;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity = activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {Log.d("TAG","onCreate()");
    }

    @Test
    public void btn_click() {Log.d("TAG","Button was clicked");
    }

    @Test
    public void testEditText(){
        Espresso.onView(withId(R.id.editText)).perform(ViewActions.clearText());
        Espresso.onView(withId(R.id.editText)).perform(ViewActions.typeText("123123"));
        Espresso.pressBack();
        Espresso.onView(withId(R.id.button)).perform(click());
    }




}