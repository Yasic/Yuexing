package com.yasic.yuexing.Fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yasic.yuexing.Activitys.MyMotorcadeDetailActivity;
import com.yasic.yuexing.R;

/**
 * Created by ESIR on 2015/12/11.
 */
public class MotorcadeDetailFragment extends Fragment{
    /**
     * 根视图的对象
     */
    private View rootView = null;

    /**
     * 车队logo显示区域
     */
    private SimpleDraweeView motorcadeLogo;

    /**
     * 车队姓名显示TextView
     */
    private TextView motorcadeName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_motorcadedetail, container, false);
            Fresco.initialize(getActivity());
            initView();
        }
        return rootView;
    }

    private void initView(){
        motorcadeLogo = (SimpleDraweeView)rootView.findViewById(R.id.sdv_motorcadetype_logo);
        motorcadeName = (TextView)rootView.findViewById(R.id.tv_motorcadename);
        motorcadeName.setText("熊猫游学者");
        GenericDraweeHierarchy hierarchy = motorcadeLogo.getHierarchy();
        hierarchy.setPlaceholderImage(null);
        motorcadeLogo.setImageURI(Uri.parse("res://com.yasic.yuexing/" + R.drawable.headimg10));
    }
}
