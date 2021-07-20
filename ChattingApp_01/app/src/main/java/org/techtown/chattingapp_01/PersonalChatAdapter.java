package org.techtown.chattingapp_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Text;

import java.util.List;

public class PersonalChatAdapter extends RecyclerView.Adapter<PersonalChatAdapter.ViewHolder> {
    private List<PersonalChatData> localDataSet;
    private String myNickname;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView_msg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView_msg = itemView.findViewById(R.id.text_personalchat_message_me);
        }
    }

    public PersonalChatAdapter(List<PersonalChatData> dataSet, Context context, String myNickname) {
        localDataSet = dataSet;
        this.myNickname = myNickname;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout view = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_main_chat_me, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonalChatAdapter.ViewHolder holder, int position) {
        PersonalChatData personalChat = localDataSet.get(position);
        holder.textView_msg.setText(personalChat.getMsg());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
