package thatzit;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnswerCreateController extends HttpServlet {
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
        String answerDescription, answerPassword;

        answerDescription = request.getParameter("answerDescription");
        answerPassword = request.getParameter("answerPassword");

        Answer answer = new Answer(new Random().nextInt());

        answer.setDescription(answerDescription);
        answer.setPassword(answerPassword);

        getServletConfig().getServletContext().
        getRequestDispatcher("/jsp/AnswerCreated.jsp" ).
        forward(request, response );
    }
}
