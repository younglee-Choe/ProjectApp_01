package org.techtown.chattingapp_01;

import android.net.Uri;

public class PersonalChatData {
    private String nickname;
    private String msg;
    // private String profile;
    private long time;

    public PersonalChatData(String nickname, String msg, String profile, long time) {
        this.nickname = nickname;
        this.msg = msg;
        // this.profile = profile;
        this.time = time;
    }

    public PersonalChatData(String nickname, String msg) {
        this.nickname = nickname;
        this.msg = msg;
    }

    public PersonalChatData() {

    }


    /*public String getProfile() {
        return profile;
    }*/

    /*public void setProfile(String profile) {
        this.profile = profile;
    }*/

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
