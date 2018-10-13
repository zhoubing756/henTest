package Entry;

/**
 * @author: 周兵
 * @date: 2018/10/12 15:34
 * @describe 考试的实体的基本类
 **/
public  class Question {
    private QuestionCategory category ; //  题目种类 0 math  1 Chinese 3 English 2 science
    private QuestionType type; // 0 单选题  1 多选题  2 填空题
    private String content; // 题目内容
    private String answer;  // 题目答案

    public Question(){



    }

    public Question(QuestionCategory category,QuestionType type,String content,String answer){
        this.category = category;
        this.type = type;
        this.content = content;
        this.answer = answer;
    }


    /**
     * @return
     */
    public QuestionType getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(QuestionType type) {
        this.type = type;
    }


    /**
     * @return
     */
    public QuestionCategory getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(QuestionCategory category) {
        this.category = category;
    }

    /**
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }


}
