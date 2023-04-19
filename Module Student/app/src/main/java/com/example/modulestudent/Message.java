package com.example.modulestudent;

public class Message {
    private String id;
    private String date;
    private String msg;
    private String name;

    public Message(String id, String date, String msg, String name) {
        this.id = id;
        this.date = date;
        this.msg = msg;
        this.name = name;
    }

    public Message() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
