package com.vmetis.jackpark;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * @author: BG236650 on 2018/3/19.
 * ${todo}<请描述这个类是干什么的>
 * @Version:
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {
    private static final String STRING_TO_BE_TYPED = "Jack wen";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void interact(){
        //让 etInput 输入内容，并关上软键盘
        onView(withId(R.id.activity_main_et_input)).perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard());
        //让 btnInteract 执行点击事件
        onView(withId(R.id.activity_main_btn_interact)).perform(click());
        String welcome = "Hello " + STRING_TO_BE_TYPED + "!";
        //检查 tvTip 上的文字是否和 welcome 值匹配
        onView(withId(R.id.activity_main_tv_tip)).check(matches(withText(welcome)));
    }
}
