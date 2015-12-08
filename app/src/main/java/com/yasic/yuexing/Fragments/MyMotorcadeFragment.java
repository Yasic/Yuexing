package com.yasic.yuexing.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.yasic.yuexing.Adapters.MyMotorcadeAdapter;
import com.yasic.yuexing.Objects.Motorcade;
import com.yasic.yuexing.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/8.
 */
public class MyMotorcadeFragment extends Fragment {

    /**
     * 根视图的对象
     */
    private View rootView = null;

    /**
     * 我的车队列表的adapter
     */
    private MyMotorcadeAdapter myMotorcadeAdapter;

    /**
     * 车队列表
     */
    private List<Motorcade> motorcadeList = new ArrayList<>();

    /**
     * 我的车队recyclerview
     */
    private RecyclerView rvMyMotorcade;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_mymotorcade, container, false);
            Fresco.initialize(getActivity());
            initView();
        }
        return rootView;
    }

    private void initView(){
        motorcadeList.add(new Motorcade("车队1", "yasic", R.drawable.headimg10));
        motorcadeList.add(new Motorcade("车队2", "yasic", R.drawable.headimg10));
        motorcadeList.add(new Motorcade("车队3", "yasic", R.drawable.headimg10));
        motorcadeList.add(new Motorcade("车队4", "yasic", R.drawable.headimg10));
        motorcadeList.add(new Motorcade("车队5", "yasic", R.drawable.headimg10));
        motorcadeList.add(new Motorcade("车队6", "yasic", R.drawable.headimg10));
        myMotorcadeAdapter = new MyMotorcadeAdapter(getActivity(), motorcadeList);
        rvMyMotorcade = (RecyclerView)rootView.findViewById(R.id.rv_mymotorcade);
        rvMyMotorcade.setAdapter(myMotorcadeAdapter);
        rvMyMotorcade.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        //rvMyMotorcade.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvMyMotorcade.setItemAnimator(new DefaultItemAnimator());
    }
}
