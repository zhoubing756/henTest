package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import Entry.Question;

/**
 * @author: 周兵
 * @date: 2018/10/12 18:02
 * @describe 封装 HenDBCopyMangaer 为单例模式
 **/
public class HenDBCopyManagerWrap {
    private static HenDBCopyManager instance;
    public static HenDBCopyManager getInstance(Context context){
        if(instance == null){
            instance = new HenDBCopyManager(context);
        }
        return instance;
    }
    public static Question query(SQLiteDatabase sqliteDB, String[] columns, String selection, String[] selectionArgs){
        return  instance.query(sqliteDB,columns,selection,selectionArgs);
    }

}
