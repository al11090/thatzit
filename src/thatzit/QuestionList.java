package thatzit;

import java.util.List;
import java.util.ArrayList;

public class QuestionList {
    private static List<Question> list = new ArrayList<Question>();

    public static void add(Question question) {
        if(question != null) {
            list.add(question);
        }
    }

    public static Question getQuestionById(int id) {
        return list.get(id);
    }

    public static List<Question> selectQuestions(String query) {
        List<Question> queryResultList = new ArrayList<Question>();
        if(query != null) {
            // execute the query
        }

        return queryResultList;
    }
}
