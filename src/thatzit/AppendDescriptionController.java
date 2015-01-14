package thatzit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppendDescriptionController extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException,
                                                            ServletException {
        RequestDispatcher dispatcher;
        int questionId;
        String questionPassword, questionDescription;

        questionId = Integer.parseInt(request.getParameter("questionId"));
        questionPassword = request.getParameter("questionPassword");
        questionDescription = request.getParameter("questionDescription");

        Description description = new Description(questionDescription);

        //if password matches this question password
        QuestionList.getQuestionById(questionId).appendDescription(description);

        dispatcher = request.getRequestDispatcher("/jsp/view.jsp");
        dispatcher.forward(request, response);
    }
}
