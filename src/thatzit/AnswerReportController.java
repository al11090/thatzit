package thatzit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnswerReportController extends HttpServlet {
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        Answer answer=new Answer();
        answer.setDescription(answer.getDescription() + "[reported]");
        answer.report();
        getServletConfig().getServletContext().
        getRequestDispatcher("/jsp/AnswerView.jsp" ).
        forward(request, response);
	}
}
