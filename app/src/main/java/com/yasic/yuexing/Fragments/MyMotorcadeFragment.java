package com.yasic.yuexing.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.yasic.yuexing.Activitys.MyMotorcadeDetailActivity;
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
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        Bundle bundle1 = getArguments();
        Log.i("test",bundle1.getString("test")+" "+getArguments().containsKey("test"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_mymotorcade, container, false);
            Fresco.initialize(getActivity());
            initView();
        }
        return rootView;
    }

    @Override
    public void onDestroy(){
        motorcadeList.clear();
        rootView = null;
        super.onDestroy();
    }

    private void initView(){
        motorcadeList.add(new Motorcade("熊猫游学者", "余烜Yasic", R.drawable.headimg10, "队长", "2015-11-24"));
        motorcadeList.add(new Motorcade("假期出游小队", "王超", R.drawable.headimg9, "队员", "2015-11-26"));
        motorcadeList.add(new Motorcade("不安定人群集中营", "沈秋彤", R.drawable.headimg8, "队员", "2015-11-24"));
        myMotorcadeAdapter = new MyMotorcadeAdapter(getActivity(), motorcadeList);
        myMotorcadeAdapter.setOnItemClickListener(new MyMotorcadeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Intent intent = new Intent(getActivity(), MyMotorcadeDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("MOTORCADE_NAME",motorcadeList.get(position).getMotorcadeName());
                bundle.putString("MOTORCADE_MONITOR",motorcadeList.get(position).getMotocadeMonitor());
                intent.putExtras(bundle);
                startActivity(intent);
            }

            @Override
            public void onItemLongCick(View v, int position) {

            }
        });

        rvMyMotorcade = (RecyclerView)rootView.findViewById(R.id.rv_mymotorcade);
        rvMyMotorcade.setAdapter(myMotorcadeAdapter);
        /*rvMyMotorcade.setLayoutManager(new GridLayoutManager(getActivity(), 3));*/
        rvMyMotorcade.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvMyMotorcade.setItemAnimator(new DefaultItemAnimator());
    }

    public void testDataPost(){
        Toast.makeText(getActivity(),"test",Toast.LENGTH_LONG).show();
    }
}
