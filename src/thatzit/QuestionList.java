package thatzit;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class QuestionList {
    private static List<Question> list = new ArrayList<Question>();
    static int id = 0;

    public static void add(Question question) {
        if(question != null) {
        	question.setId(id++);
            list.add(question);
        }
    }

    public static Question getQuestionById(int id) {
        for (Question question : list) {
            if (question.getId() == id) return question; 
        }
        return null;
    }

	public static List<Question> selectQuestions(String query) {
		List<Question> result = new LinkedList<Question>();
		if (query == null || query == "*") return list;
		for (Question question : list) {
			if (!question.isDeleted()) {
				if (question.getTitle().contains(query)) {
					result.add(question);
				}
			}
		}
		return result;
	}
}
