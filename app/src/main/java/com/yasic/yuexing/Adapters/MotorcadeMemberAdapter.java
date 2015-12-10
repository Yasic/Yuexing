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
import com.yasic.yuexing.Objects.Member;
import com.yasic.yuexing.Objects.Motorcade;
import com.yasic.yuexing.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/10.
 */
public class MotorcadeMemberAdapter extends RecyclerView.Adapter<MotorcadeMemberAdapter.MyViewHolder>{
    /**
     * 上下文
     */
    private Context context;

    private List<Member> memberList = new ArrayList<>();

    public MotorcadeMemberAdapter(Context context, List<Member> memberList){
        this.context = context;
        this.memberList = memberList;
    }

    @Override
    public MotorcadeMemberAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_motorcademember, parent, false));
    }

    @Override
    public void onBindViewHolder(MotorcadeMemberAdapter.MyViewHolder holder, int position) {
        if (memberList.size() != 0){
            Member member = memberList.get(position);
            GenericDraweeHierarchy hierarchy = holder.sdvHeadPortrait.getHierarchy();
            hierarchy.setPlaceholderImage(null);
            holder.sdvHeadPortrait.setImageURI(Uri.parse("res://com.yasic.yuexing/" + member.getMemberHeadPortrait()));
            holder.tvMemberName.setText(member.getMemberName());
            holder.tvMemberType.setText(member.getMemberType());
        }
    }

    @Override
    public int getItemCount() {
        return memberList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        /**
         * 头像
         */
        private SimpleDraweeView sdvHeadPortrait;

        /**
         * 姓名
         */
        private TextView tvMemberName;

        /**
         * 类型
         */
        private TextView tvMemberType;

        public MyViewHolder(View itemView) {
            super(itemView);
            sdvHeadPortrait = (SimpleDraweeView)itemView.findViewById(R.id.sdv_head_portrait);
            tvMemberName = (TextView)itemView.findViewById(R.id.tv_membername);
            tvMemberType = (TextView)itemView.findViewById(R.id.tv_membertype);
        }
    }

}
