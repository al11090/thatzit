package thatzit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuestionViewController extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		String idParameter = request.getParameter("id");
		if (idParameter == null || idParameter == "") {
			response.sendRedirect("/thatzit/list");
			return;
		}
		
		Question question = null;
		try {
			question = QuestionList.getQuestionById( Integer.parseInt(idParameter) );
		}
		catch (NumberFormatException e) {
			
		}
		
		if (question == null) {
			response.sendError(404, "There is no question.");
			return;
		}
		
		request.setAttribute("question", question);
		getServletContext().getRequestDispatcher("/jsp/view.jsp")
		.forward(request, response);
	}
}
