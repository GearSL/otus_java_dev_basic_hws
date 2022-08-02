package kz.ibr.homeworks.lesson8.question;

import kz.ibr.homeworks.lesson8.answer.AnswerOption;

public class Question {
    private final String questionText;
    //Делаю через обычный массив, чтобы реализовать его пересоздание при добавлении новых вопросов
    // т.к. в lesson6 использовал ArrayList а нужно было как раз попрактиковаться с этим
    private AnswerOption[] answerOptions;

    public Question(String questionText){
        this.questionText = questionText;
    }

    public void setAnswerOption(String answer, boolean isCorrect){
        if (answerOptions == null){
            this.answerOptions = new AnswerOption[1];
        }else{
            AnswerOption[] newAnswerOptions = new AnswerOption[answerOptions.length + 1];
            System.arraycopy(answerOptions, 0, newAnswerOptions, 0, answerOptions.length);
            answerOptions = newAnswerOptions;
        }
        this.answerOptions[answerOptions.length-1] = new AnswerOption(answer, isCorrect);
    }

    public String getQuestionText() {
        return questionText;
    }

    public AnswerOption[] getAnswerOptions(){
        return answerOptions;
    }

    public boolean checkAnswer (int answer){
        //Тут нужна проверка, что пользователь ввел значение в необходимом диапазоне ответов
        //иначе кидать исключение, но мы их еще с ними не знакомы, наверное пока оставляем в виде позитивной разработки
        return answerOptions[answer-1].isCorrect();
    }
}
