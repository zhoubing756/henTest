package database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import Entry.MultipleChoiceQuestion;
import Entry.Question;
import Entry.QuestionCategory;
import Entry.QuestionType;
import Entry.SingleChoiceQuestion;

/**
 * @author: 周兵
 * @date: 2018/10/12 16:23
 * @describe 读取assert 目录下面的db文件 到 "data/data/" + packName + "/"下
 **/
public class HenDBCopyManager {

    private Context mContext;

    public HenDBCopyManager(Context mContext) {
        this.mContext = mContext;
    }

    public SQLiteDatabase init(String packName) {
        String dbPath = "/data/data/" + packName
                + "/databases/" + HenDBConstans.DATABASE_NAME;
        if (!new File(dbPath).exists()) {
            try {
                FileOutputStream out = new FileOutputStream(dbPath);
                InputStream in = mContext.getAssets().open(HenDBConstans.DATABASE_NAME);
                byte[] buffer = new byte[1024];
                int readBytes = 0;
                while ((readBytes = in.read(buffer)) != -1)
                    out.write(buffer, 0, readBytes);
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return SQLiteDatabase.openOrCreateDatabase(dbPath, null);

    }


    public Question query(SQLiteDatabase sqliteDB, String[] columns, String selection, String[] selectionArgs) {
        Question question = null;
        try {
            String table = HenDBConstans.TABLE_NAME;
            Cursor cursor = sqliteDB.query(table, columns, selection, selectionArgs, null, null, null);
            if (cursor.moveToFirst()) {

                int category = cursor.getInt(cursor.getColumnIndex(HenDBConstans.QUESTION_CATEGORY));
                int type = cursor.getInt(cursor.getColumnIndex(HenDBConstans.QUESTION_TYPE));
                String content = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT));
                String answer = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_ANSWER));
                if (QuestionType.SING_CHOICE_QUESTION.ordinal() == type) {
                    String optionA = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT_OPTION_A));
                    String optionB = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT_OPTION_B));
                    String optionC = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT_OPTION_C));
                    String optionD = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT_OPTION_D));
                    question = new SingleChoiceQuestion(QuestionCategory.values()[category],
                            QuestionType.values()[type], content,
                            answer, optionA, optionB, optionC, optionD);
                    Utils.convertOptionAnswer(question);
                } else if (QuestionType.MULTIPLE_CHOICE_QUESTION.ordinal() == type) {
                    String optionA = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT_OPTION_A));
                    String optionB = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT_OPTION_B));
                    String optionC = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT_OPTION_C));
                    String optionD = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT_OPTION_D));
                    String optionE = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT_OPTION_E));
                    String optionF = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT_OPTION_F));
                    String optionG = cursor.getString(cursor.getColumnIndex(HenDBConstans.QUESTION_CONTENT_OPTION_G));

                    question = new MultipleChoiceQuestion(QuestionCategory.values()[category],
                            QuestionType.values()[type], content,
                            answer, optionA, optionB, optionC, optionD,optionE,optionF,optionG);
                    Utils.convertOptionAnswer(question);
                } else {
                    question = new Question(QuestionCategory.values()[category],
                            QuestionType.values()[type], content, answer);
                    cursor.moveToNext();
                    cursor.close();
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return question;
    }


}
