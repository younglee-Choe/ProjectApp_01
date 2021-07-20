package org.techtown.priceofcafe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;

import com.google.android.material.tabs.TabLayout;

import org.techtown.priceofcafe.R;
import org.techtown.priceofcafe.Fragment1;
import org.techtown.priceofcafe.Fragment2;
import org.techtown.priceofcafe.Fragment3;
import org.techtown.priceofcafe.Fragment4;
import org.techtown.priceofcafe.Fragment5;
import org.techtown.priceofcafe.R;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    Fragment4 fragment4;
    Fragment5 fragment5;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        fragment5 = new Fragment5();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("1000원대"));
        tabs.addTab(tabs.newTab().setText("2000원대"));
        tabs.addTab(tabs.newTab().setText("3000원대"));
        tabs.addTab(tabs.newTab().setText("4000원대"));
        tabs.addTab(tabs.newTab().setText("5000원대"));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                int position = tab.getPosition();
                Log.d("MainActivity", "선택된 탭 : " + position);

                Fragment selected = null;
                if (position == 0) {
                    selected = fragment1;
                } else if (position == 1) {
                    selected = fragment2;
                } else if (position == 2) {
                    selected = fragment3;
                } else if (position == 3) {
                    selected = fragment4;
                } else if (position == 4) {
                    selected = fragment5;
                }
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });


        listView = findViewById(R.id.listView);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("이디야");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("스타벅스");
        listAdapter.add("이디야");

        int totalHeight = 0;

        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.setAdapter(listAdapter);
    }
}


