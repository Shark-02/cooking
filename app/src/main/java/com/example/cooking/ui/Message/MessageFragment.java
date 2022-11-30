package com.example.cooking.ui.Message;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;

import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Adapter.MyMessageAdapter;
import com.example.cooking.Data_view.Chat_member;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.recipe;
import com.example.cooking.MatchActivity;
import com.example.cooking.Menu;
import com.example.cooking.MyChat;
import com.example.cooking.R;
import com.example.cooking.databinding.FragmentMessageBinding;

import java.util.List;
import java.util.Random;

import io.rong.common.RLog;
import io.rong.imkit.IMCenter;
import io.rong.imkit.conversation.ConversationFragment;
import io.rong.imkit.conversationlist.ConversationListAdapter;
import io.rong.imkit.conversationlist.ConversationListFragment;
import io.rong.imkit.conversationlist.viewmodel.ConversationListViewModel;
import io.rong.imkit.widget.refresh.SmartRefreshLayout;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.rong.common.RLog;
import io.rong.imkit.IMCenter;
import io.rong.imkit.R.id;
import io.rong.imkit.R.layout;
import io.rong.imkit.R.string;
import io.rong.imkit.config.ConversationListBehaviorListener;
import io.rong.imkit.config.RongConfigCenter;
import io.rong.imkit.conversationlist.model.BaseUiConversation;
import io.rong.imkit.conversationlist.model.GatheredConversation;
import io.rong.imkit.conversationlist.viewmodel.ConversationListViewModel;
import io.rong.imkit.event.Event.RefreshEvent;
import io.rong.imkit.model.NoticeContent;
import io.rong.imkit.utils.RouteUtils;
import io.rong.imkit.widget.adapter.ViewHolder;
import io.rong.imkit.widget.dialog.OptionsPopupDialog;
import io.rong.imkit.widget.dialog.OptionsPopupDialog.OnOptionsItemClickedListener;
import io.rong.imkit.widget.refresh.SmartRefreshLayout;
import io.rong.imkit.widget.refresh.api.RefreshLayout;
import io.rong.imkit.widget.refresh.constant.RefreshState;
import io.rong.imkit.widget.refresh.listener.OnLoadMoreListener;
import io.rong.imkit.widget.refresh.listener.OnRefreshListener;
import io.rong.imkit.widget.refresh.wrapper.RongRefreshHeader;
import io.rong.imlib.RongIMClient.ErrorCode;
import io.rong.imlib.RongIMClient.ResultCallback;
import java.util.ArrayList;
import java.util.List;


public class MessageFragment extends ConversationListFragment {

    private FragmentMessageBinding binding;
    MyMessageAdapter mma;
    List<Chat_member> cm_data;
    //RecyclerView rcv;
    View root;

    protected final long NOTICE_SHOW_DELAY_MILLIS = 4000L;
    private final String TAG = ConversationListFragment.class.getSimpleName();
    //protected ConversationListAdapter mAdapter = this.onResolveAdapter();
    protected RecyclerView rcv;
    protected View mNoticeContainerView;
    protected TextView mNoticeContentTv;
    protected ImageView mNoticeIconIv;
    protected ConversationListViewModel mConversationListViewModel;
    protected SmartRefreshLayout mRefreshLayout;
    protected Handler mHandler = new Handler(Looper.getMainLooper());

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MessageViewModel dashboardViewModel =
                new ViewModelProvider(this).get(MessageViewModel.class);

        root = inflater.inflate(R.layout.fragment_message, container, false);

        //SetupView();

        return root;
    }



    /*void SetupView(){
        cm_data= DataGenerator.genMessageData();

        int num= new Random().nextInt(20);
        for (int i=0;i<num;i++){
            Chat_member cms = new Chat_member();
            cms.headImg_id = R.drawable.xs;
            cms.chatName = "孙瑜";
            //cms.chatContent = "Content of " + cm_data.size();
            cms.chatContent = "今天好无聊 " + cm_data.size();
            cms.chatTime="11:11";
            cm_data.add(cms);
        }

        mma=new MyMessageAdapter(R.layout.chat_view,cm_data);

        rcv=root.findViewById(R.id.message_rcv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(rcv.getContext());
        rcv.setLayoutManager(layoutManager);
        rcv.setAdapter(mma);
        mma.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                Intent intent = new Intent(getContext(), MyChat.class);
                startActivity(intent);
            }
        });


    }*/

    //@Override
    /*public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (!IMCenter.getInstance().isInitialized()) {
            RLog.e(this.TAG, "Please init SDK first!");
        } else {
            this.rcv = (RecyclerView)view.findViewById(R.id.message_rcv);
            this.mRefreshLayout = (SmartRefreshLayout)view.findViewById(id.rc_refresh);
            mma=new MyMessageAdapter(R.layout.chat_view,cm_data);

            rcv=root.findViewById(R.id.message_rcv);
            LinearLayoutManager layoutManager = new LinearLayoutManager(rcv.getContext());
            this.rcv.setLayoutManager(layoutManager);
            rcv.setLayoutManager(layoutManager);
            rcv.setAdapter(mma);
            mma.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                    Intent intent = new Intent(getContext(), MyChat.class);
                    startActivity(intent);
                }
            });

            this.mNoticeContainerView = view.findViewById(id.rc_conversationlist_notice_container);
            this.mNoticeContentTv = (TextView)view.findViewById(id.rc_conversationlist_notice_tv);
            this.mNoticeIconIv = (ImageView)view.findViewById(id.rc_conversationlist_notice_icon_iv);
            this.initRefreshView();
            this.subscribeUi();
        }
    }*/



}