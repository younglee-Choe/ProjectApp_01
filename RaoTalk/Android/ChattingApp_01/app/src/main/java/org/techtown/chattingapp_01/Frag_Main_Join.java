package org.techtown.chattingapp_01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

public class Frag_Main_Join extends Fragment {

    private FirebaseAuth auth;
    private FirebaseDatabase database;
    private EditText joinEmail;
    private EditText joinPW;
    private EditText joinName;
    private Button btnJoin;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_main_join, container, false);

        joinEmail = view.findViewById(R.id.join_email);
        joinPW = view.findViewById(R.id.join_pwd);
        joinName = view.findViewById(R.id.join_name);
        btnJoin = view.findViewById(R.id.btn_join);

        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.createUserWithEmailAndPassword(joinEmail.getText().toString(),
                        joinPW.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(view.getContext(),
                                    "회원가입이 되었습니다.", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(view.getContext(),
                                    task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });


            }
        });


        return super.onCreateView(inflater, container, savedInstanceState);
    }
}


