package com.yasic.yuexing.Adapters;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yasic.yuexing.Objects.ChatMessage;
import com.yasic.yuexing.R;

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
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_motorcadechat_other, parent, false));
    }

    @Override
    public void onBindViewHolder(MotorcadeChatAdapter.MyViewHolder holder, int position) {
        if (chatMessageList.size() != 0){
            ChatMessage chatMessage = chatMessageList.get(position);
            GenericDraweeHierarchy hierarchy = holder.sdvHeadPortrait.getHierarchy();
            hierarchy.setPlaceholderImage(null);
            holder.sdvHeadPortrait.setImageURI(Uri.parse("res://com.yasic.yuexing/" + chatMessage.getChaterHeadPortrait()));
            holder.tvChaterName.setText(chatMessage.getChaterName());
            holder.tvChaterMessageTime.setText(chatMessage.getChaterMessageTime());
            holder.tvChatMessage.setText(chatMessage.getChateMessage());
        }
    }

    @Override
    public int getItemCount() {
        return chatMessageList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        /**
         * 显示聊天者头像
         */
        private SimpleDraweeView sdvHeadPortrait;

        /**
         * 显示聊天者姓名的textview
         */
        private TextView tvChaterName;

        /**
         * 显示聊天消息发送时间的textview
         */
        private TextView tvChaterMessageTime;

        /**
         * 显示聊天信息的textview
         */
        private TextView tvChatMessage;

        public MyViewHolder(View itemView) {
            super(itemView);
            sdvHeadPortrait = (SimpleDraweeView)itemView.findViewById(R.id.sdv_head_portrait);
            tvChaterName = (TextView)itemView.findViewById(R.id.tv_chatername);
            tvChaterMessageTime = (TextView)itemView.findViewById(R.id.tv_chatermessagetime);
            tvChatMessage = (TextView)itemView.findViewById(R.id.tv_chatmessage);
        }
    }
}
