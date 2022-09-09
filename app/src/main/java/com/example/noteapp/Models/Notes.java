package com.example.noteapp.Models;

import android.graphics.Bitmap;
import android.net.Uri;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "notes")
public class Notes implements Serializable {
    @PrimaryKey(autoGenerate = true)
    int ID = 0;
    @ColumnInfo(name = "title")
    String title = "";
    @ColumnInfo(name = "notes")
    String notes = "";
    @ColumnInfo(name = "date")
    String date = "";
    @ColumnInfo(name = "dateDB")
    String dateDB = "";
    @ColumnInfo(name = "timeDB")
    String timeDB = "";
    @ColumnInfo(name = "pinned")
    boolean pinned = false;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateDB() {
        return dateDB;
    }


    public void setDateDB(String dateDB) {
        this.dateDB = dateDB;
    }

    public String getTimeDB() {
        return timeDB;
    }

    public void setTimeDB(String timeDB) {
        this.timeDB = timeDB;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }
}
