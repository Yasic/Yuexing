package com.yasic.yuexing.Activitys;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.yasic.yuexing.Adapters.ViewPagerAdapter;
import com.yasic.yuexing.Fragments.FindMotorcadeFragment;
import com.yasic.yuexing.Fragments.MotorcadeChatFragment;
import com.yasic.yuexing.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESIR on 2015/12/9.
 */
public class MyMotorcadeDetailActivity extends AppCompatActivity {

    /**
     * activity中的toolbar
     */
    private Toolbar toolbar;

    /**
     * 主界面的tablayout
     */
    private TabLayout tlMain;

    /**
     * 主界面的viewpager
     */
    public static ViewPager vpMain;

    /**
     * 装viewpager的每一个界面的list
     */
    private List<String> titleList;

    /**
     * 装fragment的每一个对象的list
     */
    private List<Fragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_mymortocadedetail);
        initToolbarAndDrawer();
        init();
    }

    /**
     * 初始化toolbar的方法
     */
    private void initToolbarAndDrawer() {

        toolbar = (Toolbar) findViewById(R.id.tb_main);

        /*DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.OpenNav, R.string.CloseNav);
        drawer.setDrawerListener(toggle);
        toggle.syncState();*/

        /*NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);*/

        /*sdvHeadPortrait = (SimpleDraweeView) findViewById(R.id.nav_sdv_head_portrait);
        GenericDraweeHierarchy hierarchy = sdvHeadPortrait.getHierarchy();
        hierarchy.setPlaceholderImage(R.drawable.yasiclogo);
        sdvHeadPortrait. setImageURI(Uri.parse("res://com.yasic.yuexing/" + R.drawable.yasiclogo));*/

        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);
        //toolbar.setNavigationIcon(R.drawable.ic_menu_white_24dp);
        /*toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.openDrawer(GravityCompat.START);
            }
        });*/
    }

    /**
     * 初始化各个控件
     */
    private void init() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.clearAnimation();
        fab.cancelLongPress();
        fab.setAnimation(null);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                int[] startingLocation = new int[2];
                view.getLocationOnScreen(startingLocation);
                startingLocation[0] += view.getWidth() / 2;
                overridePendingTransition(0, 0);
//                Intent intent = new Intent(MainActivity.this, PostRequestActivity.class);
//                startActivity(intent);
//                NotificationLab.getInstance().addNotification(new Notification());
            }
        });

        initList();

        tlMain = (TabLayout) findViewById(R.id.tl_main);
        vpMain = (ViewPager) findViewById(R.id.vp_main);

        vpMain.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), titleList, fragmentList));
        tlMain.setupWithViewPager(vpMain);
        tlMain.setTabMode(TabLayout.MODE_FIXED);
    }

    /**
     * 初始化两个list的方法
     */
    private void initList() {
        titleList = new ArrayList<>();
        fragmentList = new ArrayList<>();
        titleList.add("队内聊天");
        titleList.add("车队成员");
        titleList.add("车队详情");
        fragmentList.add(new MotorcadeChatFragment());
        fragmentList.add(new FindMotorcadeFragment());
        fragmentList.add(new FindMotorcadeFragment());
    }
}
