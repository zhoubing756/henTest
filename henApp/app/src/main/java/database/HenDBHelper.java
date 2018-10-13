package database;
/**
 * @author: 周兵
 * @date: 2018/10/12 15:34
 * @describe DB  helper类实现数据库的逻辑
 **/
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import application.HenAppication;

public final class HenDBHelper extends SQLiteOpenHelper {

    public HenDBHelper(Context context){
        super(HenAppication.getIntance().getApplicationContext(),
                HenDBConstans.DATABASE_NAME,
                null,
                HenDBConstans.DATABASE_VERSION);
    }

    /**
     * @param db
     * @decribe 数据库初始化调用，只执行一次
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // 创建表结构
        String sql = "create table " + HenDBConstans.TABLE_NAME +"("+
                HenDBConstans.ID+" integer primary key autoincrement,"+
                HenDBConstans.QUESTION_CATEGORY+" integer,"+
                HenDBConstans.QUESTION_TYPE+" integer,"+
                //HenDBConstans.QUESTION_TITLE+" text,"+
                HenDBConstans.QUESTION_CONTENT+" text,"+

                HenDBConstans.QUESTION_ANSWER+" text)";
        db.execSQL(sql);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
