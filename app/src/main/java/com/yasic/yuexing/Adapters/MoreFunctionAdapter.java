package com.yasic.yuexing.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yasic.yuexing.Objects.MoreFunction;
import com.yasic.yuexing.Objects.MotorcadeType;
import com.yasic.yuexing.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/8.
 */
public class MoreFunctionAdapter extends RecyclerView.Adapter<MoreFunctionAdapter.MyViewHolder>{

    /**
     * 上下文
     */
    private Context context;

    /**
     * 更多功能分类列表
     */
    private List<MoreFunction> moreFunctionList = new ArrayList<>();

    public MoreFunctionAdapter(Context context, List<MoreFunction> moreFunctionList){
        this.context = context;
        this.moreFunctionList = moreFunctionList;
    }

    @Override
    public MoreFunctionAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_morefunction, parent, false));
    }

    @Override
    public void onBindViewHolder(MoreFunctionAdapter.MyViewHolder holder, int position) {
        if (moreFunctionList.size() != 0){
            MoreFunction moreFunction = moreFunctionList.get(position);
            holder.tvMoreFunction.setText(moreFunction.getMoreFunctionname());
        }
    }

    @Override
    public int getItemCount() {
        return moreFunctionList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tvMoreFunction;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvMoreFunction = (TextView)itemView.findViewById(R.id.tv_morefunctionname);
        }
    }
}
