package thatzit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuestionCloseController extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException,
                                                            ServletException {
		RequestDispatcher dispatcher;
		String resultText;

		int qid = Integer.parseInt( request.getParameter("questionId") );
		Question qs = QuestionList.getQuestionById( qid );

		String inputPassword = request.getParameter("questionPassword");

		if ( inputPassword == qs.getPassword() ) {
			qs.delete();
			resultText = "This question was closed.";
		} else {
			resultText = "password is incorrect.";
		}

		request.setAttribute("resultText", resultText);
		dispatcher = request.getRequestDispatcher("/jsp/QuestionClosedView.jsp");
		dispatcher.forward(request, response);
	}
}
