package com.example.calculator1;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;



import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class UITest {

    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityActivityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);
    @Test
    public void clicking_one(){
        onView(withId(R.id.bb1)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_two(){
        onView(withId(R.id.bb2)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_three(){
        onView(withId(R.id.bb3)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_four(){
        onView(withId(R.id.bb4)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_five(){
        onView(withId(R.id.bb5)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_six(){
        onView(withId(R.id.bb6)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_seven(){
        onView(withId(R.id.bb7)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_eight(){
        onView(withId(R.id.bb8)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_nine(){
        onView(withId(R.id.bb9)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_0(){
        onView(withId(R.id.bb0)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_bequal(){
        onView(withId(R.id.bequal)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_bdot(){
        onView(withId(R.id.bdot)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_bmin(){
        onView(withId(R.id.bmin)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_bplus(){
        onView(withId(R.id.bplus)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_bmul(){
        onView(withId(R.id.bmul)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_bsqrt(){
        onView(withId(R.id.bsqrt)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_bdiv(){
        onView(withId(R.id.bdiv)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_bc(){
        onView(withId(R.id.bc)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    public void clicking_bac(){
        onView(withId(R.id.bac)).perform(click()).check(matches(isDisplayed()));

    }



}