package P03.full_credit;

public class Question
{
    private static int nextQuestionNumber = 1;
    private final int questionNumber;
    private String question;
    private String[] answers;
    private int rightAnswer;

    public Question(String question, String[] answers, int rightAnswer)
    {
        if(rightAnswer < 1 || rightAnswer > answers.length)
        {
            throw new IllegalArgumentException("Not a valid number of right answers!");
        }

        this.question = question;
        this.answers = answers;
        this.rightAnswer = rightAnswer;
        this.questionNumber = nextQuestionNumber++;
    }

    public boolean checkAnswer(int answer)
    {
        return answer == rightAnswer;
    }

    @Override
    public String toString()
    {
        StringBuilder fullQuestion = new StringBuilder(questionNumber + ". " + question + "\n");
        for(int i = 0; i < answers.length; ++i)
        {
            fullQuestion.append((i+1) + ") " + answers[i] + "\n");
        }

        return fullQuestion.toString();
    }
}
