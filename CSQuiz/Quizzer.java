package P03.full_credit;

public class Quizzer
{
    public static void main(String args[])
    {
        try
        {
            Quiz quiz = new Quiz();
            // quiz.takeQuiz();
            System.out.println("\nYour grade is: " + 100 * quiz.takeQuiz() + "\n");
        
        }
            catch(IllegalArgumentException badArg)
            {
                System.err.println(badArg.getMessage() + "Class dismissed, quiz postponed!");
                System.exit(-1);
            }

        System.out.println("Thanks for taking the quiz");
    }
}
