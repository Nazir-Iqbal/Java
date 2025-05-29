// package Advance_Java.QUIZ_CONSOLE_APP;

import java.util.Arrays;

public class Question
{
    private int questionId;
    private String Question;
    private String[] options = new String[4];
    private int answer;

    public Question(int questionId, String question, String[] options, int answer) {
        this.questionId = questionId;
        Question = question;
        this.options = options;
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question [questionId=" + questionId + ", Question=" + Question + ", options=" + Arrays.toString(options)
                + "]";
    }

}