package Service;

import java.util.Scanner;

import POJO.Exam;
import POJO.Question;

public class ExamService {
    private Exam javaExam;
    private Exam htmlExam;

    // Constructor
    public ExamService() {
        initializeExams();
    }

    private void initializeExams() {
        // Java Exam
        Question[] javaQuestions = new Question[5];
        javaQuestions[0] = new Question(1, "What is Java?", "A", "B", "C", "D", "A", 1);
        javaQuestions[1] = new Question(2, "What is a class?", "A", "B", "C", "D", "B", 1);
        javaQuestions[2] = new Question(3, "What is inheritance?", "A", "B", "C", "D", "C", 1);
        javaQuestions[3] = new Question(4, "What is a constructor?", "A", "B", "C", "D", "D", 1);
        javaQuestions[4] = new Question(5, "What is an interface?", "A", "B", "C", "D", "A", 1);
        javaExam = new Exam(1, "Java Test", "Java", "2023-07-11", javaQuestions);

        // HTML Exam
        Question[] htmlQuestions = new Question[5];
        htmlQuestions[0] = new Question(1, "What is HTML?", "A", "B", "C", "D", "A", 1);
        htmlQuestions[1] = new Question(2, "What is a tag?", "A", "B", "C", "D", "B", 1);
        htmlQuestions[2] = new Question(3, "What is CSS?", "A", "B", "C", "D", "C", 1);
        htmlQuestions[3] = new Question(4, "What is a div?", "A", "B", "C", "D", "D", 1);
        htmlQuestions[4] = new Question(5, "What is a hyperlink?", "A", "B", "C", "D", "A", 1);
        htmlExam = new Exam(2, "HTML Test", "HTML", "2023-07-11", htmlQuestions);
    }

    public void conductTest(int examChoice) {
        Exam selectedExam = (examChoice == 1) ? javaExam : htmlExam;

        int totalMarks = 0;
        Scanner scanner = new Scanner(System.in);

        for (Question question : selectedExam.getQuestions()) {
            System.out.println("Q" + question.getqNo() + ". " + question.getQuestion());
            System.out.println("A. " + question.getOpt1());
            System.out.println("B. " + question.getOpt2());
            System.out.println("C. " + question.getOpt3());
            System.out.println("D. " + question.getOpt4());
            System.out.print("Your answer: ");

            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(question.getAns())) {
                totalMarks += question.getMarks();
            }
        }

        System.out.println("Total Marks: " + totalMarks);

        if (totalMarks >= 3) {
            System.out.println("Congratulations! You completed the test.");
        } else {
            System.out.println("Better luck next time.");
        }
    }
}
