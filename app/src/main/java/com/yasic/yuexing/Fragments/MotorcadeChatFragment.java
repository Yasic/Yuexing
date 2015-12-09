package com.yasic.yuexing.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.yasic.yuexing.R;

/**
 * Created by ESIR on 2015/12/9.
 */
public class MotorcadeChatFragment extends Fragment {
    /**
     * 根视图的对象
     */
    private View rootView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_motorcadechat, container, false);
            Fresco.initialize(getActivity());
            initView();
        }
        return rootView;
    }

    private void initView(){

    }
}
