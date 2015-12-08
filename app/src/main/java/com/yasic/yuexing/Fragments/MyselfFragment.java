package com.yasic.yuexing.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yasic.yuexing.Adapters.MySelfAdapter;
import com.yasic.yuexing.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/8.
 */
public class MyselfFragment extends Fragment {
    /**
     * 根视图的对象
     */
    private View rootView = null;

    /**
     * ”我“界面菜单的adapter
     */
    private MySelfAdapter mySelfAdapter;

    /**
     * ”我“界面的菜单recyclerview
     */
    private RecyclerView rvMyselfMenu;

    /**
     * 菜单list
     */
    private List<String> menuList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_myself, container, false);
            initView();
        }
        return rootView;
    }

    private void initView(){
        menuList.add("我的车况");
        menuList.add("个人设置");
        menuList.add("通知");
        menuList.add("通知");
        menuList.add("退出应用");
        mySelfAdapter = new MySelfAdapter(getActivity(), menuList);
        rvMyselfMenu = (RecyclerView)rootView.findViewById(R.id.rv_myselfmenu);
        rvMyselfMenu.setAdapter(mySelfAdapter);
        rvMyselfMenu.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvMyselfMenu.setItemAnimator(new DefaultItemAnimator());
    }
}
