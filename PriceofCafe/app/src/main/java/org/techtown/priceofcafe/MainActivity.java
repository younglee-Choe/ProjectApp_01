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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import org.techtown.priceofcafe.R;
import org.techtown.priceofcafe.Fragment1;
import org.techtown.priceofcafe.Fragment2;
import org.techtown.priceofcafe.Fragment3;
import org.techtown.priceofcafe.Fragment4;
import org.techtown.priceofcafe.Fragment5;
import org.techtown.priceofcafe.R;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
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

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        final CafeAdapter adapter = new CafeAdapter();

        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("없디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("없디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("이디야",  "경북 경주시 어쩌구"));
        adapter.addItem(new Cafe("살려줘..",  "경북 경주시 어쩌구"));

        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new OnCafeItemClickListener() {
            @Override
            public void onItemClick(CafeAdapter.ViewHolder holder, View view, int position) {
                Cafe item = adapter.getItem(position);
                Toast.makeText(getApplicationContext(), "이름 : " + item.getName(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
