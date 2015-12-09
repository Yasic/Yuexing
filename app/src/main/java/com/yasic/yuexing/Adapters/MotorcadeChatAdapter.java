package com.yasic.yuexing.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.yasic.yuexing.Objects.ChatMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/9.
 */
public class MotorcadeChatAdapter extends RecyclerView.Adapter<MotorcadeChatAdapter.MyViewHolder> {

    /**
     * 上下文
     */
    private Context context;

    /**
     * 聊天信息列表
     */
    private List<ChatMessage> chatMessageList;

    public MotorcadeChatAdapter(Context context, List<ChatMessage> chatMessageList){
        this.context = context;
        this.chatMessageList = chatMessageList;
    }

    @Override
    public MotorcadeChatAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MotorcadeChatAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
