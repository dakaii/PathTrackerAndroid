package com.dakaii.pathtracker;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dnakashi on 12/21/15.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DBNAME ="pathtracker.db";
    private static final int DBVERSION = 1;
    public static final String TABLE_PATHTRACKER = "pathtracker";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_DATE= "date";
    public static final String COLUMN_ELAPSEDTIME = "eltime";
    public static final String COLUMN_DISTANCE = "distance";
    public static final String COLUMN_SPEED = "speed";
    public static final String COLUMN_ADDRESS = "address";
    private static final String CREATE_TABLE_SQL =
            "create table " + TABLE_PATHTRACKER + " "
                    + "(" + COLUMN_ID +" integer primary key autoincrement,"
                    + COLUMN_DATE + " text not null,"
                    + COLUMN_ELAPSEDTIME + " text not null,"
                    + COLUMN_DISTANCE + " real not null,"
                    + COLUMN_SPEED + " real not null,"
                    + COLUMN_ADDRESS + " text not null)";

    public DatabaseHelper(Context context){
        super(context,DBNAME,null,DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_TABLE_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
