package thatzit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuestionReportController extends HttpServlet {
    public void doPost(	HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        String id=request.getParameter("id");
            
        int i=Integer.parseInt(id);
        Question qu = QuestionList.getQuestionById(i);
        String ans=qu.getTitle();
        String rep="[reported]";
        String s=ans+rep;
        qu.setTitle(s);
        qu.report();
        getServletConfig().getServletContext().
        getRequestDispatcher("/jsp/questionView.jsp" ).
        forward(request, response);
    }
}
