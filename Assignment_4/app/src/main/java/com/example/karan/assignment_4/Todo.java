package com.example.karan.assignment_4;

import java.util.UUID;

public class Todo {
    private UUID mId;
    private String mTitle;
    private String mDetails;

    public Todo() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDetails() {
        return mDetails;
    }

    public void setDetails(String details) {
        mDetails = details;
    }
}
