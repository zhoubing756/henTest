package Entry;

/**
 * @author: 周兵
 * @date: 2018/10/13 10:55
 * @describe 单选题的试题类
 **/
public class SingleChoiceQuestion extends Question {
    private String optionA; //选项A
    private String optionB; //选项B
    private String optionC; //选项C
    private String optionD; //选项D
    private ChoiceItem choiceAnser;
    public SingleChoiceQuestion(QuestionCategory category,
                                QuestionType type,
                                String content,
                                String answer,
                                String optionA,
                                String optionB,
                                String optionC,
                                String optionD) {
        super( category, type, content, answer);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
    }
    public ChoiceItem getChoiceAnser() {
        return choiceAnser;
    }

    public void setChoiceAnser(ChoiceItem choiceAnser) {
        this.choiceAnser = choiceAnser;
    }
    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

}
