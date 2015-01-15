package thatzit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class QuestionSearchController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		RequestDispatcher dispatcher;
		String questionSearch;
		int questionGenre;
		
		questionSearch = request.getParameter("questionSearch");
		questionGenre = Integer.parseInt(request.getParameter("questionGenre"));
		
		String searchQuery;
		List<Question> searchResult;
		//constructs the search query
		searchQuery = "some query";
		searchResult = QuestionList.selectQuestions(searchQuery);
		
		request.setAttribute("searchResult", searchResult);
		dispatcher = request.getRequestDispatcher("/jsp/result.jsp");
		dispatcher.forward(request, response);
    }
}
