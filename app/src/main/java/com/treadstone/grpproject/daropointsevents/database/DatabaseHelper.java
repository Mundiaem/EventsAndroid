package com.treadstone.grpproject.daropointsevents.database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    //Database Version
    private static final int DATABASE_VERSION=1;
    //Database Name
    private static final String DATABASE_NAME="daropointsevents.db";
    //User table name
    private static final String TABLE_USER="user";
    //User Table Column names
    private static final String COLUMN_USER_ID="user_id";
    private static final String COLUMN_USER_NAME="user_name";
    private static final String COLUMN_USER_EMAIL="user_email";
    private static final String COLUMN_USER_PASSWORD="user_password";
    private static final String COLUMN_USER__REG_NO="user_reg_no";
    private static final String COLUMN_USER_FIRST_NAME="user_first_name";
    private static final String COLUMN_USER_LAST_NAME="user_last_name";

    //create table sql query
    private String CREATE_USER_TABLE="CREATE TABLE"+TABLE_USER+"("+COLUMN_USER_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"
            +COLUMN_USER_NAME+"TEXT,"+
            COLUMN_USER_EMAIL+"TEXT,"+
            COLUMN_USER_EMAIL+ "TEXT,"+
            COLUMN_USER_NAME+"TEXT,"+
            COLUMN_USER__REG_NO+"TEXT,"+
            COLUMN_USER_FIRST_NAME+"TEXT,"+
            COLUMN_USER_LAST_NAME+"TEXT,"+
            COLUMN_USER_PASSWORD+"TEXT,"+")";
    private String DROP_USER_TABLE="DROP TABLE IF EXISTS"+TABLE_USER;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
