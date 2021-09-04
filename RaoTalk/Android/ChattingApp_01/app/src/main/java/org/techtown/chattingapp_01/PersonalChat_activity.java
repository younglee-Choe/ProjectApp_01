package org.techtown.chattingapp_01;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;
import org.techtown.chattingapp_01.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonalChat_activity extends AppCompatActivity {

    // DrawerLayout
    private DrawerLayout mainPersonalChatLayout;
    private View drawerMenu;

    // Chatting
    private RecyclerView recyclerView_chat;
    private RecyclerView.LayoutManager layoutManager;
    private PersonalChatAdapter mAdapter;
    private String nick = "nick2";
    private EditText editText_input;
    private Button button_send;
    private DatabaseReference dbRef;
    private FirebaseDatabase database;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_personalchat);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        // DrawerLayout

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

        // Chatting

        button_send = findViewById(R.id.button_send);
        editText_input = findViewById(R.id.editText_input);

        button_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = editText_input.getText().toString();

                if (msg != null) {
                    PersonalChatData chat = new PersonalChatData();
                    chat.setTime(new Date().getTime());
                    chat.setNickname(nick);
                    chat.setMsg(msg);
                    dbRef.push().setValue(chat);
                }
            }
        });

        // RecyclerView
        recyclerView_chat = findViewById(R.id.personal_recyclerView_chat);
        recyclerView_chat.setHasFixedSize(true);

        // Linear Layout
        layoutManager = new LinearLayoutManager(this);
        recyclerView_chat.setLayoutManager(layoutManager);

        // Adapter

        final ArrayList<PersonalChatData> personalChatDatas = new ArrayList<>();
        mAdapter = new PersonalChatAdapter(personalChatDatas, PersonalChat_activity.this, nick);
        recyclerView_chat.setAdapter(mAdapter);

        /*database.getReference().child("chats")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                        for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                            PersonalChatData chatData = snapshot1.getValue(PersonalChatData.class);

                            personalChatDatas.add(chatData);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull @NotNull DatabaseError error) {

                    }
                });*/



        database = FirebaseDatabase.getInstance();
        dbRef = database.getReference("message");

        dbRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull @NotNull DataSnapshot snapshot, @Nullable @org.jetbrains.annotations.Nullable String previousChildName) {
                Log.d("ChatData", snapshot.getValue().toString());

                PersonalChatData chatData = snapshot.getValue(PersonalChatData.class);
                ((PersonalChatAdapter) mAdapter).addChat(chatData);
            }

            @Override
            public void onChildChanged(@NonNull @NotNull DataSnapshot snapshot, @Nullable @org.jetbrains.annotations.Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull @NotNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull @NotNull DataSnapshot snapshot, @Nullable @org.jetbrains.annotations.Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

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
