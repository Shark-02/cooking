package com.example.cooking.ui.Message;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cooking.Adapter.MyAdapter;
import com.example.cooking.Adapter.MyMessageAdapter;
import com.example.cooking.Data_view.Chat_member;
import com.example.cooking.Data_view.DataGenerator;
import com.example.cooking.Data_view.recipe;
import com.example.cooking.R;
import com.example.cooking.databinding.FragmentMessageBinding;

import java.util.List;


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
        SetupView();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    void SetupView(){
        cm_data= DataGenerator.genMessageData();

        mma=new MyMessageAdapter(R.layout.chat_view,cm_data);
        rcv=root.findViewById(R.id.message_rcv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(rcv.getContext());

        rcv.setLayoutManager(layoutManager);
        rcv.setAdapter(mma);

    }
}