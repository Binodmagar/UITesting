import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import com.binod.uitesting.InstrumentedTesting;
import com.binod.uitesting.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withInputType;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class test {
    @Rule
    public ActivityTestRule<InstrumentedTesting>
    testRule = new ActivityTestRule<>(InstrumentedTesting.class);

    String excepted = "24.0";

    @Test
    public void checkNo(){
        onView(withId(R.id.etFirstI))
                .perform(typeText("12"));
        onView(withId(R.id.etSecondI))
                .perform(typeText("12"));
        onView(withId(R.id.btnAdd))
                .perform(click());

        onView(withId(R.id.tvOutPut))
                .check(matches(withText(excepted)));
    }
}
