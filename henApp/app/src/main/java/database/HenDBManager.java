package database;
/**
 * @author: 周兵
 * @date: 2018/10/12 15:34
 * @describe 封装HenDBHelper 实现单例
 **/
import android.content.Context;

public class HenDBManager {
    private static HenDBHelper instance;
    public static HenDBHelper getInstance(Context context){
        if(instance == null){
            instance = new HenDBHelper(context);
        }
        return instance;
    }
}
