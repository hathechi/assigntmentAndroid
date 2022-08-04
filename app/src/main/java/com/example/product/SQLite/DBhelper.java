package com.example.product.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "sqlProduct";
    public static final int DB_VERSION = 1;
    public static final String ID = "id";
    public static final String TEN = "tensp";
    public static final String GIA = "giasp";
    public static final String MOTA = "mota";
    public static final String HINH = "hinhsp";



    public DBhelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = String.format("CREATE TABLE product(%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s REAL, %s TEXT, %s BLOB)", ID, TEN, GIA, MOTA,HINH);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String droptable = "DROP TABLE IF EXISTS product";
        db.execSQL(droptable);
        onCreate(db);

    }
}
