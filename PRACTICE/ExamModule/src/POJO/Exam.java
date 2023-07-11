package POJO;
public class Exam {
    private int examId;
    private String name;
    private String topic;
    private String date;
    private Question[] questions;

    // Constructor
    public Exam(int examId, String name, String topic, String date, Question[] questions) {
        this.examId = examId;
        this.name = name;
        this.topic = topic;
        this.date = date;
        this.questions = questions;
    }

    // Getters and setters

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}
