package com.yasic.yuexing.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yasic.yuexing.Adapters.MoreFunctionAdapter;
import com.yasic.yuexing.Objects.MoreFunction;
import com.yasic.yuexing.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/8.
 */
public class MoreFunctionFragment extends Fragment {
    /**
     * 根视图的对象
     */
    private View rootView = null;

    /**
     * 更多功能列表adapter
     */
    private MoreFunctionAdapter moreFunctionAdapter;

    /**
     * 更多功能recyclerview
     */
    private RecyclerView rvMoreFunction;

    private List<MoreFunction> moreFunctionList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_morefunction, container, false);
            initView();
        }
        return rootView;
    }

    private void initView(){
        moreFunctionList.add(new MoreFunction("保养小贴士"));
        moreFunctionList.add(new MoreFunction("汽车保养手册"));
        moreFunctionList.add(new MoreFunction("维修站点"));
        moreFunctionList.add(new MoreFunction("跳蚤市场"));
        moreFunctionAdapter = new MoreFunctionAdapter(getActivity(), moreFunctionList);
        rvMoreFunction = (RecyclerView)rootView.findViewById(R.id.rv_morefunction);
        rvMoreFunction.setAdapter(moreFunctionAdapter);
        rvMoreFunction.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvMoreFunction.setItemAnimator(new DefaultItemAnimator());
    }
}
