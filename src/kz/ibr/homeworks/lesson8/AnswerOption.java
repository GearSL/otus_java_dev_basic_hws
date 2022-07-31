package kz.ibr.homeworks.lesson8;

public class AnswerOption {
    private final String answer;
    private final boolean isCorrect;
    AnswerOption(String answer, boolean isCorrect){
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
