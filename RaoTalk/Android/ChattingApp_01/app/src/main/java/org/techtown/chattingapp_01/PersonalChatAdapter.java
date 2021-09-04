package org.techtown.chattingapp_01;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class PersonalChatAdapter extends RecyclerView.Adapter {
    public int SENDER_VIEW_TYPE = 1;
    public int RECEIVER_VIEW_TYPE = 2;
    private ArrayList<PersonalChatData> personalChatDatas;
    private String myNickname;
    private Context context;

    public PersonalChatAdapter(ArrayList<PersonalChatData> personalChatDatas, Context context, String myNickname) {
        this.personalChatDatas = personalChatDatas;
        this.context = context;
        this.myNickname = myNickname;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == SENDER_VIEW_TYPE) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_main_chat_me,
                    parent, false);
            return new SenderViewHolder(view);
        } else {
            View view = LayoutInflater.from(context).inflate(R.layout.item_main_chat_other,
                    parent, false);
            return new ReceiverViewHolder(view);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (personalChatDatas.get(position).getNickname().equals(this.myNickname)) {
            Log.d("Sender", "1");
            return SENDER_VIEW_TYPE;
        } else {
            Log.d("Receiver", "2");
            return RECEIVER_VIEW_TYPE;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PersonalChatData personalChatData = personalChatDatas.get(position);

        if (holder.getClass() == SenderViewHolder.class) {
            ((SenderViewHolder)holder).sender_msg.setText(personalChatData.getMsg());
            ((SenderViewHolder)holder).sender_name.setText(personalChatData.getNickname());

        } else {
            ((ReceiverViewHolder)holder).reciever_msg.setText(personalChatData.getMsg());
            ((ReceiverViewHolder)holder).reciever_name.setText(personalChatData
                    .getNickname());

        }
    }

    @Override
    public int getItemCount() {
        return personalChatDatas.size();
    }

    public static class ReceiverViewHolder extends RecyclerView.ViewHolder {
        private TextView reciever_msg;
        private TextView reciever_name;
        private TextView reciever_time;
        private ImageView reciever_profile;


        public ReceiverViewHolder(@NonNull View itemView) {
            super(itemView);

            reciever_msg = (TextView) itemView.findViewById(R.id.reciever_msg);
            reciever_name = (TextView) itemView.findViewById(R.id.reciever_name);
            reciever_time = itemView.findViewById(R.id.reciever_time);
            //reciever_profile = itemView.findViewById(R.id.reciever_profile);
        }

    }
    public static class SenderViewHolder extends RecyclerView.ViewHolder {

        private TextView sender_msg;
        private TextView sender_name;
        private TextView sender_time;
        private ImageView sender_profile;

        public SenderViewHolder(@NonNull View itemView) {
            super(itemView);

            sender_msg = (TextView) itemView.findViewById(R.id.sender_msg);
            sender_name = (TextView) itemView.findViewById(R.id.sender_name);
            sender_time = itemView.findViewById(R.id.sender_time);
            //sender_profile = itemView.findViewById(R.id.sender_profile);
        }
    }

    public void addChat(PersonalChatData chat) {
        personalChatDatas.add(chat);
        notifyItemInserted(personalChatDatas.size()-1);
    }

}
