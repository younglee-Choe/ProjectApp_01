package org.techtown.chattingapp_01;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class GroupChat_activity extends AppCompatActivity {

    private DrawerLayout mainPersonalChatLayout;
    private View drawerMenu;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_personalchat);

        mainPersonalChatLayout = findViewById(R.id.mainPersonalChat_layout);
        drawerMenu = findViewById(R.id.drawer_menu);

        ImageButton imgButton_menu = findViewById(R.id.imgButton_menu);
        imgButton_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPersonalChatLayout.openDrawer(drawerMenu);
            }
        });

        mainPersonalChatLayout.setDrawerListener(drawerListener);
        drawerMenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });


    }

    DrawerLayout.DrawerListener drawerListener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };
}
