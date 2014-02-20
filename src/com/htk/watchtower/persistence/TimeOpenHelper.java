package com.htk.watchtower.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.htk.watchtower.persistence.TimeReader.TimeEntry;

public class TimeOpenHelper extends SQLiteOpenHelper {
	
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "Time.db";
	private static final String TEXT_TYPE = " TEXT";
	private static final String COMMA_SEP = ",";
	private static final String SQL_CREATE_ENTRIES =
	    "CREATE TABLE " + TimeEntry.TABLE_NAME + " (" +
	    TimeEntry.COLUMN_NAME_ENTRY_ID + " INTEGER PRIMARY KEY," +
	    TimeEntry.COLUMN_NAME_1_TIME + TEXT_TYPE + COMMA_SEP +
	    TimeEntry.COLUMN_NAME_2_TIME + TEXT_TYPE + COMMA_SEP +
	    TimeEntry.COLUMN_NAME_3_TIME + TEXT_TYPE + COMMA_SEP +
	    TimeEntry.COLUMN_NAME_4_TIME + TEXT_TYPE + COMMA_SEP +
	    " )";

	private static final String SQL_DELETE_ENTRIES =
	    "DROP TABLE IF EXISTS " + TimeEntry.TABLE_NAME;

	

	public TimeOpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(SQL_CREATE_ENTRIES);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
		
	}
	
	public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

}
