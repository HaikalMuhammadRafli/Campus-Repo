package org.example.core;

import java.util.Date;

public class Task {

    private String title;
    private boolean isDone;
    private Date created_at;
    private Date deadline;
    private Date done_at;
    private String priority;

    public Task(String title, Date deadline, String priority) {
        this.title = title;
        this.isDone = false;
        this.created_at = new Date();
        this.deadline = deadline;
        this.done_at = new Date();
        this.priority = priority;
    }

    @Override
    public String toString() {
        String strTitle = "";

        if (this.isDone) {
            strTitle = "[Selesai]";
        }

        strTitle += this.title;

        return strTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getDone_at() {
        return done_at;
    }

    public void setDone_at(Date done_at) {
        this.done_at = done_at;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
