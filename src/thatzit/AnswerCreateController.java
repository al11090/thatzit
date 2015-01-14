package thatzit;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnswerCreateController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		String questionIdParameter = request.getParameter("id");
		String description = request.getParameter("description");
		String password = request.getParameter("password");
		
		Answer answer = new Answer();
		answer.setDescription(description);
		answer.setPassword(password);
		
		Question question = QuestionList.getQuestionById(Integer.parseInt(questionIdParameter));
		question.appendAnswer(answer);
		
		request.setAttribute("question", question);
		request.setAttribute("answer", answer);
		getServletContext().getRequestDispatcher("/jsp/AnswerView.jsp")
		.forward(request, response );
	}
}
