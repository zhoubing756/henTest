package database;

import android.util.SparseArray;

import Entry.ChoiceItem;
import Entry.MultipleChoiceQuestion;
import Entry.Question;
import Entry.QuestionType;
import Entry.SingleChoiceQuestion;

/**
 * @author: 周兵
 * @date: 2018/10/13 15:57
 * @describe 工具类处理 数据转换等
 **/
public class Utils {

    /**
     * @param question 输入 question 对象
     *                 对question answer  转换 字符串的转换
     * @return question 对象
     */
    public static Question convertOptionAnswer(Question question) {
        if (question.getType().equals(QuestionType.SING_CHOICE_QUESTION)) {
            String answer = question.getAnswer();
            char tmpChar = answer.charAt(0);
            int tmpValue = tmpChar - 'A';
            SingleChoiceQuestion singleChoiceQuestion = (SingleChoiceQuestion) question;
            singleChoiceQuestion.setChoiceAnser(ChoiceItem.values()[tmpValue]);
            return singleChoiceQuestion;
        } else if (question.getType().equals(QuestionType.MULTIPLE_CHOICE_QUESTION)) {
            String answer = question.getAnswer();
            String[] tmpStrings = answer.split("_");
            SparseArray<ChoiceItem> choices = new SparseArray<>();
            for (int i = 0; i < tmpStrings.length; i++) {

                char tmpChar = tmpStrings[i].charAt(0);
                int tmpValue = tmpChar - 'A';
                choices.put(i, ChoiceItem.values()[tmpValue]);
            }
            MultipleChoiceQuestion multipleChoiceQuestion = (MultipleChoiceQuestion) question;
            multipleChoiceQuestion.setAnswerChoices(choices);

        }
        return question;
    }
}
