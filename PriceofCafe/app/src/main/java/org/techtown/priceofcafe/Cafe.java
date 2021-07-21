package org.techtown.priceofcafe;

public class Cafe {
    String Name;
    String Notification;

    public Cafe(String name, String notification) {
        Name = name;
        Notification = notification;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNotification() {
        return Notification;
    }

    public void setNotification(String notification) {
        Notification = notification;
    }
}