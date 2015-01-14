package thatzit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuestionLikeController extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException,
                                                            ServletException {
        RequestDispatcher dispatcher;
        int questionId;

        questionId = Integer.parseInt(request.getParameter("questionId"));

        QuestionList.getQuestionById(questionId).like();

        dispatcher = request.getRequestDispatcher("/jsp/view.jsp");
        dispatcher.forward(request, response);
    }
}
