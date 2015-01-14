package thatzit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class QuestionCreateController extends HttpServlet {
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
        String questionTitle, questionDescription, questionPassword;
        int questionGenre;

        questionTitle = request.getParameter("questionTitle");
        questionDescription = request.getParameter("questionDescription");
        questionGenre = Integer.parseInt(request.getParameter("questionGenre"));
        questionPassword = request.getParameter("questionPassword");

        Question question = new Question();
        Description description = new Description(questionDescription);

        question.setTitle(questionTitle);
        question.appendDescription(description);
        question.setGenre(questionGenre);
        question.setPassword(questionPassword);

        QuestionList.add(question);

        getServletConfig().getServletContext().
        getRequestDispatcher("/jsp/QuestionView.jsp" );
    }
}
