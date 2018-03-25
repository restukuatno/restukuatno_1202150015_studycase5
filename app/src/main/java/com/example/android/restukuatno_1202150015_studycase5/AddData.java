package com.example.android.restukuatno_1202150015_studycase5;

/**
 * Created by user on 25-Mar-18.
 */

public class AddData {
    //deklarasi variable
    String todo, desccription, priority;

    //konstruktor
    public AddData(String todo, String description, String priority){
        this.todo=todo;
        this.desccription=description;
        this.priority=priority;
    }

    //method setter dan getter untuk to do , description dan priority
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desccription;
    }

    public void setDesc(String desc) {
        this.desccription = desccription;
    }

    public String getPrior() {
        return priority;
    }

    public void setPrior(String prior) {
        this.priority = priority;
    }
}

