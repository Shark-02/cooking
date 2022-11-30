package com.example.cooking;

import android.app.Application;

import com.example.cooking.ui.Message.MessageFragment;

import io.rong.imkit.RongIM;
import io.rong.imkit.utils.RouteUtils;

public class Cooking extends Application {

    public void onCreate() {
        super.onCreate();
        String appKey = "8luwapkv8dvsl";
        RongIM.init(this, appKey);

        RouteUtils.registerActivity(RouteUtils.RongActivityType.ConversationActivity, MyChat.class);
    }
}
