package com.binod.uitesting;


import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DivInstrumentedTest {

    @Rule
    public ActivityTestRule<InstrumentedTesting>
            testRule = new ActivityTestRule<>(InstrumentedTesting.class);



    String excepted = "2.0";

    @Test
    public void divNo(){
        onView(withId(R.id.etFirstI))
                .perform(typeText("20"));
        onView(withId(R.id.etSecondI))
                .perform(typeText("10"));
        onView(withId(R.id.btnDiv))
                .perform(click());

        onView(withId(R.id.tvOutPut))
                .check(matches(withText(excepted)));
    }

}
