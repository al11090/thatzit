package thatzit;

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
    	for(int i=0;i<list.size();i++){
    		Question que=new Question();
    		que=list.get(i);
    		if(id==que.getId()){
    			return que;
    		}
    	}
    		return null;
    }

    public static List<Question> selectQuestions(String query) {
        List<Question> queryResultList = new ArrayList<Question>();
        if(query != null) {
            // execute the query
        }
        
        return queryResultList;
    }
}
