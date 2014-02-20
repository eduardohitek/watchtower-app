/**
 * 
 */
package com.htk.watchtower.persistence;

import android.provider.BaseColumns;

/**
 * @author hitek
 *
 */
public final class TimeReader {
	
	public TimeReader() {}
	
	public static abstract class TimeEntry implements BaseColumns{
		public static final String TABLE_NAME = "timesheet";
		public static final String COLUMN_NAME_ENTRY_ID = "timeid";
		public static final String COLUMN_NAME_1_TIME = "time1";
		public static final String COLUMN_NAME_2_TIME = "time2";
		public static final String COLUMN_NAME_3_TIME = "time3";
		public static final String COLUMN_NAME_4_TIME = "time4";
	}

}
