package thatzit;

public class Test {
    public static void main(String[] args) {
        Question q1 = new Question();
        q1.setTitle("test");
        Question q2 = new Question();
        q2.setTitle("another one");

        QuestionList.add(q1);
        QuestionList.add(q2);

        System.out.println(QuestionList.getQuestionById(1).getTitle());
        System.out.println(QuestionList.getQuestionById(0).getTitle());
    }
}
