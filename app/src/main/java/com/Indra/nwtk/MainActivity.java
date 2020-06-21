package com.Indra.nwtk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private frag1 f1;
    private frag2 f2;
    private frag3 f3;
    private frag4 f4;
    private frag5 f5;

    private List<Fragment> fragmentList;

    List<String> title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tabs);
        viewPager=findViewById(R.id.pager);

        f1=new frag1();
        f2=new frag2();
        f3=new frag3();
        f4=new frag4();
        f5=new frag5();
        fragmentList=new ArrayList<>();

        fragmentList.add(f1);
        fragmentList.add(f2);
        fragmentList.add(f3);
        fragmentList.add(f4);
        fragmentList.add(f5);

        title = new ArrayList<>();

        title.add("Feed");
        title.add("Trending");
        title.add("Add");
        title.add("Voted");
        title.add("Profile");


        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter pageradapter = new ViewPagerAdapter(getSupportFragmentManager(),0);

        viewPager.setAdapter(pageradapter);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_chrome_reader_mode_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_whatshot_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_add_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_edit_black_24dp);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_face_black_24dp);


    }

    public class ViewPagerAdapter extends FragmentPagerAdapter {






        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {


            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {

            return title.get(position);
        }


    }



}
