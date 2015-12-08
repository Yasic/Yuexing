package com.yasic.yuexing.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yasic.yuexing.Objects.Motorcade;
import com.yasic.yuexing.Objects.MotorcadeType;
import com.yasic.yuexing.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/8.
 */
public class FindMotorcadeTypeAdapter extends RecyclerView.Adapter<FindMotorcadeTypeAdapter.MyViewHolder> {

    /**
     * 上下文
     */
    private Context context;

    /**
     * 车队分类名称列表
     */
    private List<MotorcadeType> motorcadeTypeList = new ArrayList<>();

    public FindMotorcadeTypeAdapter(Context context, List<MotorcadeType> motorcadeTypeList){
        this.context = context;
        this.motorcadeTypeList = motorcadeTypeList;
    }

    @Override
    public FindMotorcadeTypeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_findmotorcade_motorcadetype, parent, false));
    }

    @Override
    public void onBindViewHolder(FindMotorcadeTypeAdapter.MyViewHolder holder, int position) {
        if (motorcadeTypeList.size() != 0){
            MotorcadeType motorcadeType = motorcadeTypeList.get(position);
            holder.tvMotorcadeTypeName.setText(motorcadeType.getMotorcadeTypeName());
        }
    }

    @Override
    public int getItemCount() {
        return motorcadeTypeList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvMotorcadeTypeName;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvMotorcadeTypeName = (TextView)itemView.findViewById(R.id.tv_motorcadetypename);
        }
    }
}
