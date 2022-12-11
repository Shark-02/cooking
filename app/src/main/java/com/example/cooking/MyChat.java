package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

import io.rong.imkit.activity.RongBaseActivity;
import io.rong.imkit.conversation.ConversationFragment;
import io.rong.imkit.conversation.RongConversationActivity;
import io.rong.imkit.userinfo.RongUserInfoManager;
import io.rong.imlib.RongIMClient;
import io.rong.imlib.model.Conversation;
import io.rong.imlib.model.Group;
import io.rong.imlib.model.UserInfo;

public class MyChat extends FragmentActivity {

    ImageView iv;
    protected String mTargetId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_chat);
        this.mTargetId = this.getIntent().getStringExtra("targetId");
        ConversationFragment conversationFragment = new ConversationFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, conversationFragment);
        transaction.commit();
        iv=findViewById(R.id.backView2);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    void getInfo(){


        RongIMClient.getInstance().getConversationList(new RongIMClient.ResultCallback<List<Conversation>>() {

            @Override

            public void onSuccess(List<Conversation> conversations) {

                String si = conversations.get(0).getTargetId();

                Conversation.ConversationType type = conversations.get(0).getConversationType();

                //从本地缓存中获取（只针对IMKit）

                UserInfo userInfo =  RongUserInfoManager.getInstance().getUserInfo(si);

            }

            @Override

            public void onError(RongIMClient.ErrorCode errorCode) {

            }

        });
    }

}