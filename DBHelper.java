package com.example.crud_example;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "workshop";
    public DBHelper(Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table student (id text primary key, name text, mobile text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists student");
        onCreate(db);
    }

    public void insertDetails(String id1, String name1, String mobile1) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("id", id1);
        cv.put("name", name1);
        cv.put("mobile", mobile1);
        db.insert("student", null, cv);
        db.close();
    }

    public ArrayList<String> getDetails() {
        ArrayList<String> alist = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from student", null);
        if (cursor.moveToFirst()) {
            do {
                String val = cursor.getString(0) + " " + cursor.getString(1) + " " + cursor.getString(2);
                alist.add(val);
            } while (cursor.moveToNext());
        }
        return alist;
    }

    public Cursor getDetail(String id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from student where id =" + id + "", null);
        return cursor;
    }

    public void updateDetails(String id1, String name1, String mobile1) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name", name1);
        cv.put("mobile", mobile1);
        db.update("student", cv, "id = ?", new String[] {id1});
        db.close();
    }

    public void deleteDetails(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("student", "id = ?", new String[]{id});
        db.close();
    }
}
