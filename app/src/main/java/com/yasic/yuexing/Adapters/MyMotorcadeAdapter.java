package com.yasic.yuexing.Adapters;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yasic.yuexing.Objects.Motorcade;
import com.yasic.yuexing.R;

import java.util.List;

/**
 * Created by ESIR on 2015/12/8.
 */
public class MyMotorcadeAdapter extends RecyclerView.Adapter<MyMotorcadeAdapter.MyViewHolder> {
    /**
     * adapter上下文
     */
    private Context context;
    /**
     * 车队列表
     */
    private List<Motorcade> motorcadeList;

    public MyMotorcadeAdapter(Context context, List<Motorcade> motorcadeList){
        this.context = context;
        this.motorcadeList = motorcadeList;
    }

    @Override
    public MyMotorcadeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_motorcadelist, parent, false));
    }


    @Override
    public void onBindViewHolder(MyMotorcadeAdapter.MyViewHolder holder, int position) {
        if (motorcadeList.size() != 0) {
            Motorcade motorcade = motorcadeList.get(position);
            GenericDraweeHierarchy hierarchy = holder.ivMotorcadeLogo.getHierarchy();
            hierarchy.setPlaceholderImage(motorcade.getMotorLogo());
            holder.ivMotorcadeLogo.setImageURI(Uri.parse("res://com.yasic.yuexing/"+ motorcade.getMotorLogo()));
            holder.tvMotorcadeName.setText(motorcade.getMotorcadeName());
        }
    }

    @Override
    public int getItemCount() {
        if (motorcadeList.size() == 0 || motorcadeList == null) {
            return 0;
        } else {
            return motorcadeList.size();
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private SimpleDraweeView ivMotorcadeLogo;
        private TextView tvMotorcadeName;
        public MyViewHolder(View itemView) {
            super(itemView);
            ivMotorcadeLogo = (SimpleDraweeView)itemView.findViewById(R.id.iv_motorcadelogo);
            tvMotorcadeName = (TextView)itemView.findViewById(R.id.tv_motorcadename);
        }
    }
}
