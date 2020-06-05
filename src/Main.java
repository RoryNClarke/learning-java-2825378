package src;

import java.util.*; 

public class Main {

    public static void main(String args[]) {
        String question = "Who is the best football player of all time?";
        String choiceOne = "Ronaldo";
        String choiceTwo = "Messi";
        String choiceThree = "Pele";

        String correctAnswer = choiceTwo;
        Scanner sc = new Scanner(System.in);
        boolean rightAnswer = false; 
        while(rightAnswer == false){
            System.out.println(question);
            System.out.println("Please select one of the three following Answers");
            System.out.println(choiceOne + ", " + choiceTwo + ", " + choiceThree);
            String userAnswer = sc.next();

            if(userAnswer.equals(choiceTwo)){
                System.out.println("Congratualions, you have common sense");
                rightAnswer = true; 
            }
            else if(userAnswer.equals(choiceThree) || userAnswer.equals(choiceOne)) { 
                System.out.println("Incorrect, the right answer was: " + choiceTwo);
            }
            else{
                System.out.println("Please select a valid answer");
            }
        }

        
    }

}
