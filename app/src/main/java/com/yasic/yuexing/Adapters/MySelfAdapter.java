package com.yasic.yuexing.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yasic.yuexing.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/8.
 */
public class MySelfAdapter extends RecyclerView.Adapter<MySelfAdapter.MyViewHolder>{

    private Context context;

    private List<String> menuList = new ArrayList<>();

    public MySelfAdapter(Context context, List<String> menuList){
        this.context = context;
        this.menuList = menuList;
    }

    @Override
    public MySelfAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_myself,
                parent,
                false));
    }

    @Override
    public void onBindViewHolder(MySelfAdapter.MyViewHolder holder, int position) {
        if (menuList.size() != 0){
            menuList.get(position);
            holder.tvMenu.setText(menuList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvMenu;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvMenu = (TextView)itemView.findViewById(R.id.tv_menu);
        }
    }
}
