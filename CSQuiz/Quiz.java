package P03.full_credit;
import java.util.Scanner;
import java.util.ArrayList;

public class Quiz
{
    private ArrayList<Question> questions = new ArrayList<>();

    public Quiz()
    {
        loadQuiz();
    }

    public double takeQuiz()
    {
        try (Scanner scanName = new Scanner(System.in)) {
            double rightAnswer = 0;
            for(Question writesQuestion : questions)
            {
                System.out.printf("\n" + writesQuestion + "\n");
                System.out.println("What is the answer?");
                if(writesQuestion.checkAnswer(scanName.nextInt()))
                {
                    ++rightAnswer;
                }
            }

            return rightAnswer/questions.size();
        }
        
    }
    
    private void loadQuiz()
    {
        questions.add(
            new Question
            (
                "What does UML stand for?", 

                new String[]
                {
                    "United Modeling Language", "Ulysses Mozart Lewis", "Unified Modeling Linguistics", 
                    "Unified Modeling Language"
                },
                
                4
            )
        );

        questions.add(
            new Question
            (
                "Which is considered a primitive?", 

                new String[]
                {
                    "constructor", "hellcat", "int", "String"
                },
                
                3
            )
        );

        questions.add(
            new Question
            (
                "What is inheritance?", 

                new String[]
                {
                    "how well you remember details", "reuse and extension of fields and method implementations from another class", 
                    "the ability for the human body to hold certain foods", "money from deceased relatives"
                },
                
                2
            )
        );

        questions.add(
            new Question
            (
                "What is encapsulation??", 

                new String[]
                {
                    "bundling of data with the mechanisms or methods that operate on the data", "hellcat", 
                    "how well something is covered", "the defense mechanism of armadillos"
                },
                
                1
            )
        );

        questions.add(
            new Question
            (
                "Why is data validation important?", 

                new String[]
                {
                    "it isn't", "provides accuracy and completeness by eliminating errors from any project to ensure that the data is not corrupted.",
                    "to satisfy your professor", "so the irs does not come for you"
                },
                
                2
            )
        );
    }

}
