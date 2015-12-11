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
import android.widget.LinearLayout;
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

    /**
     * 点击的监听器的对象
     */
    private OnItemClickListener onItemClickListener;

    public MyMotorcadeAdapter(Context context, List<Motorcade> motorcadeList){
        this.context = context;
        this.motorcadeList = motorcadeList;
    }

    @Override
    public MyMotorcadeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_motorcadelist, parent, false));
    }


    @Override
    public void onBindViewHolder(final MyMotorcadeAdapter.MyViewHolder holder, int position) {
        if (motorcadeList.size() != 0) {
            Motorcade motorcade = motorcadeList.get(position);
            GenericDraweeHierarchy hierarchy = holder.ivMotorcadeLogo.getHierarchy();
            hierarchy.setPlaceholderImage(null);
            holder.ivMotorcadeLogo.setImageURI(Uri.parse("res://com.yasic.yuexing/" + motorcade.getMotorLogo()));
            holder.tvMotorcadeName.setText(motorcade.getMotorcadeName());
            holder.tvMotorcadeType.setText(motorcade.getMotorcadeType());
            holder.tvMotorcadeFoundTime.setText(motorcade.getMotorcadeFoundTime());
            if (onItemClickListener != null) {
                holder.liMotorcadeList.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = holder.getLayoutPosition();
                        onItemClickListener.onItemClick(holder.liMotorcadeList, pos);
                    }
                });

                holder.liMotorcadeList.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        int pos = holder.getLayoutPosition();
                        onItemClickListener.onItemLongCick(holder.liMotorcadeList, pos);
                        return false;
                    }
                });
            }
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
        private LinearLayout liMotorcadeList;
        private SimpleDraweeView ivMotorcadeLogo;
        private TextView tvMotorcadeName;
        private TextView tvMotorcadeType;
        private TextView tvMotorcadeFoundTime;
        public MyViewHolder(View itemView) {
            super(itemView);
            liMotorcadeList = (LinearLayout)itemView.findViewById(R.id.li_MotorcadeList);
            ivMotorcadeLogo = (SimpleDraweeView)itemView.findViewById(R.id.iv_Motorcadelogo);
            tvMotorcadeName = (TextView)itemView.findViewById(R.id.tv_Motorcadename);
            tvMotorcadeType = (TextView)itemView.findViewById(R.id.tv_Motorcader_Type);
            tvMotorcadeFoundTime =(TextView)itemView.findViewById(R.id.tv_MotorcadeFoundTime);
        }
    }

    /**
     * 点击事件的接口
     */
    public interface OnItemClickListener {

        /**
         * 短点击
         *
         * @param v        被点击的对象
         * @param position 被点击的view的位置
         */
        void onItemClick(View v, int position);

        /**
         * 长按
         *
         * @param v        被点击的对象
         * @param position 被点击的view的位置
         */
        void onItemLongCick(View v, int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}
