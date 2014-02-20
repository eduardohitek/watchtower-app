/**
 * 
 */
package logic;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.htk.watchtower.persistence.TimeOpenHelper;
import com.htk.watchtower.persistence.TimeReader.TimeEntry;

/**
 * @author hitek
 *
 */
public class TimeLogic {
	
	private Context context;
	private SQLiteDatabase db;
	
	public TimeLogic(Context context){
		this.context = context;
	}
	
	public void insertTime(){
		TimeOpenHelper tHelper = new TimeOpenHelper(context);
		db = tHelper.getReadableDatabase();
		
		
		ContentValues values = new ContentValues();
		values.put(TimeEntry.COLUMN_NAME_ENTRY_ID, 1);
		values.put(TimeEntry.COLUMN_NAME_1_TIME,"08:00");
		values.put(TimeEntry.COLUMN_NAME_2_TIME,"12:00");
		values.put(TimeEntry.COLUMN_NAME_3_TIME,"13:00");
		values.put(TimeEntry.COLUMN_NAME_4_TIME,"17:00");
		
		long newRowId;
		newRowId = db.insert(
				TimeEntry.TABLE_NAME,
				"null",
		         values);
		System.out.println(newRowId);
		
		
	}

}
