package database;

/**
 * @author: 周兵
 * @date: 2018/10/12 15:34
 * @describe DB的常用变量
 **/

public final class HenDBConstans {

    public static final  String DATABASE_NAME  = "hen_test_db.db"; //数据库名称
    public static final  int    DATABASE_VERSION = 1;//数据库版本号
    public static final  String TABLE_NAME = "test_questions_table";//题目表单名
    public static final String ID = "id";//表字段
    public static final String QUESTION_CATEGORY= "qusetion_category";// 0 math  1 Chinese 2 science
    public static final String QUESTION_TYPE = "qusetion_type";// 0 单选择  1 多选题 2 填空

    public static final String QUESTION_CONTENT ="quesetion_content";  // 题目内容
    public static final String QUESTION_ANSWER = "question_answer"; // 题目答案

    //选择题
    public static final String QUESTION_CONTENT_OPTION_A = "question_content_option_a"; //选项A
    public static final String QUESTION_CONTENT_OPTION_B = "question_content_option_b"; //选项B
    public static final String QUESTION_CONTENT_OPTION_C = "question_content_option_a"; //选项C
    public static final String QUESTION_CONTENT_OPTION_D = "question_content_option_b"; //选项D
    public static final String QUESTION_CONTENT_OPTION_E = "question_content_option_E"; //选项E
    public static final String QUESTION_CONTENT_OPTION_F = "question_content_option_F"; //选项F
    public static final String QUESTION_CONTENT_OPTION_G = "question_content_option_G"; //选项F




}
