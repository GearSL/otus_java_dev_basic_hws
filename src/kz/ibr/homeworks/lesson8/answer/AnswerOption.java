package kz.ibr.homeworks.lesson8.answer;

public class AnswerOption {
    private final String answer;
    private final boolean isCorrect;
    public AnswerOption(String answer, boolean isCorrect){
        this.answer = answer;
        this.isCorrect = isCorrect;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect(){
        return isCorrect;
    }
}
