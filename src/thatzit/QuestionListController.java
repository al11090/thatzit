package thatzit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuestionListController extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		List<Question> baseQuestions = QuestionList.selectQuestions("");
		List<Question> questions = new ArrayList<Question>(baseQuestions.size());
		for (Question question : baseQuestions) {
			questions.add(question);
		}
		
		Collections.sort(questions, new Comparator<Question>(){
			@Override
			public int compare(Question q1, Question q2) { return q1.getId() - q2.getId(); }
		});
		
		request.setAttribute("questions", questions);
		getServletContext().getRequestDispatcher("/jsp/list.jsp").forward(request, response);
	}
}
