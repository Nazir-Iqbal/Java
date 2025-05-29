// package Advance_Java.QUIZ_CONSOLE_APP;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5]; // created the reference for the 5 questions
    int[] answers = new int[5];

    public QuestionService(){
        questions[0] = new Question(1, "What is the capital city of Canada?", new String[]{"Toronto", "Vancouver", "Ottawa", "Montreal"}, 3);
    
        questions[1] = new Question(2, "Who painted the Mona Lisa?", new String[]{"Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Michelangelo"}, 2);
    
        questions[2] = new Question(3, "What is the chemical symbol for gold?", new String[]{"Ag", "Go", "Au", "Gd"}, 3);
    
        questions[3] = new Question(4, "In computing, what does 'CPU' stand for?", new String[]{"Central Program Unit", "Central Processing Unit", "Computer Processing Unit", "Central Peripheral Unit"}, 2);
    
        questions[4] = new Question(5, "How many continents are there in the world?", new String[]{"5", "6", "7", "8"}, 3);
    }

    public void playQuiz(){
        int ind = 0;
        for(Question q : questions){
            System.out.println("Question No. " + q.getQuestionId());
            System.out.println(q.getQuestion());
            String[] arr = q.getOptions();
            for(int i=0;i<4;i++){
                System.out.println(i+1 + ") " + arr[i]);
            }
            System.out.println("Enter the option : ");
            Scanner in = new Scanner(System.in);
            int input = in.nextInt();
            answers[ind] = input;
            ind++;
        }
    }

    void calculateScore(){
        int score = 0;
        for(int i=0;i<5;i++){
            if(answers[i] == questions[i].getAnswer()) score += 10;
        }
        System.out.println("The Score of the Game is : " + score);
    }

}
