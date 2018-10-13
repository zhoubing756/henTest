package Entry;

import android.util.SparseArray;

/**
 * @author: 周兵
 * @date: 2018/10/13 14:38
 * @describe 多选题
 **/
public class MultipleChoiceQuestion extends Question {
    private String optionA; //选项A
    private String optionB; //选项B
    private String optionC; //选项C
    private String optionD; //选项D
    private String optionE;  //选项E
    private String optionF;  //选项F
    private String optionG;  //选项G
    private SparseArray<ChoiceItem> answerChoices; // 选项答案

    public MultipleChoiceQuestion(QuestionCategory category,
                                  QuestionType type,
                                  String content,
                                  String answer,
                                  String optionA,
                                  String optionB,
                                  String optionC,
                                  String optionD,
                                  String optionE,
                                  String optionF,
                                  String optionG) {
        super(category, type, content, answer);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.optionE = optionE;
        this.optionF = optionF;
        this.optionG = optionG;
    }

    public SparseArray<ChoiceItem> getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(SparseArray<ChoiceItem> answerChoices) {
        this.answerChoices = answerChoices;
    }

    public String getOptionA() {
        return this.optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOption_B() {
        return optionB;
    }

    public void setOption_B(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return this.optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return this.optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getOptionE() {
        return optionE;
    }

    public void setOptionE(String optionE) {
        this.optionE = optionE;
    }

    public String getOptionF() {
        return optionF;
    }

    public void setOptionF(String optionF) {
        this.optionF = optionF;
    }

    public String getOptionG() {
        return optionG;
    }

    public void setOptionG(String optionG) {
        this.optionG = optionG;
    }


}
