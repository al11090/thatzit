package thatzit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class QuestionSearchController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		getServletContext().getRequestDispatcher("/jsp/search.jsp")
		.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		String query = request.getParameter("query");
		List<Question> questions = QuestionList.selectQuestions(query);
		
		request.setAttribute("questions", questions);
		getServletContext().getRequestDispatcher("/jsp/result.jsp")
		.forward(request, response);
    }
}
