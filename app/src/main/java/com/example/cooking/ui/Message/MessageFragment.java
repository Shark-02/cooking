package com.example.cooking.ui.Message;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;

import com.example.cooking.Adapter.MyMessageAdapter;
import com.example.cooking.MyCollect;
import com.example.cooking.CommentActivity;
import com.example.cooking.Data_view.Chat_member;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.MyFans;
import com.example.cooking.MyChat;
import com.example.cooking.MyFansMessage;
import com.example.cooking.R;
import com.example.cooking.databinding.FragmentMessageBinding;

import java.util.List;
import java.util.Random;


public class MessageFragment extends Fragment {

    private FragmentMessageBinding binding;
    MyMessageAdapter mma;
    List<Chat_member> cm_data;
    RecyclerView rcv;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MessageViewModel dashboardViewModel =
                new ViewModelProvider(this).get(MessageViewModel.class);

        binding = FragmentMessageBinding.inflate(inflater, container, false);
        root = binding.getRoot();
        binding.fansIcon.setOnClickListener(v -> startActivity(new Intent(getActivity(), MyFansMessage.class)));
        binding.collectionIcon.setOnClickListener(v -> startActivity(new Intent(getActivity(), MyCollect.class)));
        binding.commentIcon.setOnClickListener(v -> startActivity(new Intent(getActivity(), CommentActivity.class)));
        SetupView();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    void SetupView() {
        cm_data = DataGenerator.genMessageData();

        int num = new Random().nextInt(20);
        for (int i = 0; i < num; i++) {
            Chat_member cms = new Chat_member();
            cms.headImg_id = R.drawable.xs;
            cms.chatName = "孙瑜";
            //cms.chatContent = "Content of " + cm_data.size();
            cms.chatContent = "今天好无聊 " + cm_data.size();
            cms.chatTime = "11:11";
            cm_data.add(cms);
        }

        mma = new MyMessageAdapter(R.layout.chat_view, cm_data);

        rcv = root.findViewById(R.id.message_rcv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(rcv.getContext());
        rcv.setLayoutManager(layoutManager);
        rcv.setAdapter(mma);
        mma.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                Intent intent = new Intent(getActivity(), MyChat.class);
                startActivity(intent);
            }
        });


    }
}