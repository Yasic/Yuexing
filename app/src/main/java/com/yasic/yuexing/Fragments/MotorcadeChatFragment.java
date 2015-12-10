package com.yasic.yuexing.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.yasic.yuexing.Adapters.MotorcadeChatAdapter;
import com.yasic.yuexing.Objects.ChatMessage;
import com.yasic.yuexing.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/9.
 */
public class MotorcadeChatFragment extends Fragment {
    /**
     * 根视图的对象
     */
    private View rootView = null;

    /**
     * 聊天信息列表
     */
    private List<ChatMessage> chatMessageList = new ArrayList<>();

    /**
     * 聊天信息adapter
     */
    private MotorcadeChatAdapter motorcadeChatAdapter;

    /**
     * 显示聊天信息的recyclerview
     */
    private RecyclerView rvMotorcadeChat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_motorcadechat, container, false);
            Fresco.initialize(getActivity());
            initView();
        }
        return rootView;
    }



    private void initView(){
        rvMotorcadeChat = (RecyclerView)rootView.findViewById(R.id.rv_motorcadechat);
        chatMessageList.add(new ChatMessage("王超", R.drawable.headimg1, "10:50", "我们的目标是---"));
        chatMessageList.add(new ChatMessage("沈秋彤", R.drawable.headimg2, "10:51", "没有蛀牙！"));
        chatMessageList.add(new ChatMessage("梁昊阳", R.drawable.headimg3, "10:52", "没有蛀牙！"));
        chatMessageList.add(new ChatMessage("xx", R.drawable.headimg4, "10:52", "没有蛀牙！"));
        /*chatMessageList.add(new ChatMessage("王超", R.drawable.headimg1, "10:50", "报数！"));
        chatMessageList.add(new ChatMessage("沈秋彤", R.drawable.headimg2, "10:51", "1！"));
        chatMessageList.add(new ChatMessage("梁昊阳", R.drawable.headimg3, "10:52", "2！"));
        chatMessageList.add(new ChatMessage("xx", R.drawable.headimg4, "10:52", "3！"));*/
        motorcadeChatAdapter = new MotorcadeChatAdapter(getActivity(), chatMessageList);
        rvMotorcadeChat.setAdapter(motorcadeChatAdapter);
        rvMotorcadeChat.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvMotorcadeChat.setItemAnimator(new DefaultItemAnimator());
    }
}
