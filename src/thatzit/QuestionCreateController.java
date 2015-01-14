package thatzit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class QuestionCreateController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		getServletConfig().getServletContext()
		.getRequestDispatcher("/jsp/ask.jsp")
		.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		// check submit flag.
		// if flag does'nt exists, go to creating ask form.
		String flag = request.getParameter("ask");
		if (flag == null || Integer.parseInt(flag) != 1) {
			getServletConfig().getServletContext().getRequestDispatcher("/jsp/ask.jsp");
			return;
		}
		
		String questionTitle = request.getParameter("questionTitle");
		String questionDescription = request.getParameter("questionDescription");
		String questionPassword = request.getParameter("questionPassword");
		QuestionGenre questionGenre = QuestionGenre.getById( Integer.parseInt(request.getParameter("questionGenre")) );
		
		Question question = new Question();
		question.setTitle(questionTitle);
		question.setGenre(questionGenre);
		question.setPassword(questionPassword);
		
		Description description = new Description(questionDescription);
		question.appendDescription(description);
		
		QuestionList.add(question);
		
		request.setAttribute("question", question);
		
		getServletConfig().getServletContext()
		.getRequestDispatcher("/jsp/view.jsp")
		.forward(request, response);
    }
}
