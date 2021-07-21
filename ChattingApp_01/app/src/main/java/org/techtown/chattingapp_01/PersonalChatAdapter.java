package org.techtown.chattingapp_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Text;

import java.util.List;

public class PersonalChatAdapter extends RecyclerView.Adapter<PersonalChatAdapter.ViewHolder> {
    public static final int VIEW_TYPE_LEFT = 0;
    public static final int VIEW_TYPE_RIGHT = 1;
    private List<PersonalChatData> localDataSet;
    private String myNickname;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView_msg;
        private TextView textView_nickname;
        private TextView textView_time;
        private ImageView imageViewCompat_profile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView_msg = itemView.findViewById(R.id.chat_msg);
            textView_nickname = itemView.findViewById(R.id.chat_nickname);
            textView_time = itemView.findViewById(R.id.chat_time);
            imageViewCompat_profile = itemView.findViewById(R.id.chat_profile);
        }
    }

    public PersonalChatAdapter(List<PersonalChatData> dataSet, Context context, String myNickname) {
        localDataSet = dataSet;
        this.myNickname = myNickname;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        if (viewType == VIEW_TYPE_LEFT) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_chat_other,
                    parent, false);
            return new ViewHolder(view);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_chat_me,
                    parent, false);
            return new ViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull PersonalChatAdapter.ViewHolder holder, int position) {
        PersonalChatData personalChat = localDataSet.get(position);
        if (personalChat.getNickname().equals(this.myNickname)) {
            holder.textView_nickname.setText(personalChat.getNickname());
            holder.textView_msg.setText(personalChat.getMsg());
        } else {
            holder.textView_nickname.setText(personalChat.getNickname());
            holder.textView_msg.setText(personalChat.getMsg());
        }
    }

    @Override
    public int getItemCount() {
        return localDataSet == null ? 0 : localDataSet.size();
    }

    public void addChat(PersonalChatData chatData) {
        localDataSet.add(chatData);
        notifyItemInserted(localDataSet.size()-1);
    }
}
