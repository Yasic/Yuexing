package com.yasic.yuexing.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.yasic.yuexing.Adapters.MotorcadeMemberAdapter;
import com.yasic.yuexing.Objects.Member;
import com.yasic.yuexing.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/10.
 */
public class MotorcadeMemberFragment extends Fragment {
    /**
     * 根视图的对象
     */
    private View rootView = null;

    /**
     * 成员列表
     */
    private List<Member> memberList = new ArrayList<>();

    /**
     * adapter
     */
    private MotorcadeMemberAdapter motorcadeMemberAdapter;

    /**
     * 显示成员的recyclerview
     */
    private RecyclerView rvMotorcadeMember;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_motorcademember, container, false);
            Fresco.initialize(getActivity());
            initView();
        }
        return rootView;
    }

    private void initView(){
        memberList.add(new Member(R.drawable.yasiclogo, "余烜Yaisc", "队长"));
        memberList.add(new Member(R.drawable.headimg1, "王超", "副队长"));
        memberList.add(new Member(R.drawable.headimg2, "沈秋彤", "副队长"));
        memberList.add(new Member(R.drawable.headimg3, "梁昊阳", "队员"));
        memberList.add(new Member(R.drawable.headimg4, "xx", "队员"));
        memberList.add(new Member(R.drawable.headimg5, "马泽宇", "队员"));
        memberList.add(new Member(R.drawable.headimg6, "匡鹏举", "队员"));
        memberList.add(new Member(R.drawable.headimg7, "刚哥", "队员"));
        memberList.add(new Member(R.drawable.headimg8, "武子阳", "队员"));
        rvMotorcadeMember = (RecyclerView)rootView.findViewById(R.id.rv_motorcademember);
        motorcadeMemberAdapter = new MotorcadeMemberAdapter(getActivity(), memberList);
        rvMotorcadeMember.setAdapter(motorcadeMemberAdapter);
        rvMotorcadeMember.setLayoutManager(new GridLayoutManager(getActivity(),4));
        rvMotorcadeMember.setItemAnimator(new DefaultItemAnimator());
    }
}
