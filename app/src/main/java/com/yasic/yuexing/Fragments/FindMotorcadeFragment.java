package com.yasic.yuexing.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yasic.yuexing.Adapters.FindMotorcadeTypeAdapter;
import com.yasic.yuexing.Objects.MotorcadeType;
import com.yasic.yuexing.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/8.
 */
public class FindMotorcadeFragment extends Fragment {
    /**
     * 根视图的对象
     */
    private View rootView = null;

    /**
     * 发现车队的车队分类adapter
     */
    private FindMotorcadeTypeAdapter findMotorcadeTypeAdapter;

    /**
     * 车队分类列表
     */
    private List<MotorcadeType> motorcadeTypeList = new ArrayList<>();

    /**
     * 车队分类recyclerview
     */
    private RecyclerView rvFindMotorcadeType;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_findmotorcade, container, false);
            initView();
        }
        return rootView;
    }

    private void initView(){
        motorcadeTypeList.add(new MotorcadeType("国内旅游", R.drawable.findmotorcade_img1));
        motorcadeTypeList.add(new MotorcadeType("跨境远行", R.drawable.findmotorcade_img2));
        motorcadeTypeList.add(new MotorcadeType("城市飞车", R.drawable.findmotorcade_img6));
        motorcadeTypeList.add(new MotorcadeType("亲友团", R.drawable.findmotorcade_img4));
        motorcadeTypeList.add(new MotorcadeType("兴趣至上", R.drawable.findmotorcade_img5));
        motorcadeTypeList.add(new MotorcadeType("周末党", R.drawable.findmotorcade_img3));
        findMotorcadeTypeAdapter = new FindMotorcadeTypeAdapter(getActivity(), motorcadeTypeList);
        rvFindMotorcadeType = (RecyclerView)rootView.findViewById(R.id.rv_findmotorcade_motorcadetype);
        rvFindMotorcadeType.setAdapter(findMotorcadeTypeAdapter);
        rvFindMotorcadeType.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rvFindMotorcadeType.setItemAnimator(new DefaultItemAnimator());
    }
}
