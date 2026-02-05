package com.grandfinale.quiz;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "question","question","question","question", "question", "answer");
        questions[1] = new Question(2, "question","question","question","question", "question", "answer");
        questions[2] = new Question(3, "question","question","question","question", "question", "answer");
        questions[3] = new Question(4, "question","question","question","question", "question", "answer");
        questions[4] = new Question(5, "question","question","question","question", "question", "answer");

    }

    public void playQuiz(){

        int i = 0;
        for (Question q : questions){
            System.out.println("Question no. " + q.getId() );
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for(String s :  selection){
            System.out.println(s);
        }
    }

    public void showScore(){
        int score = 0;

        for(int i = 0; i < questions.length; i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];

            if(answer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score: " + score);
    }

}
