package thatzit;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnswerLikeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Answer ans = new Answer();
		ans.like();
		
		String des = ans.getDescription();
		int like = ans.getLike();
		request.setAttribute("description", des);
		request.setAttribute("like", like);
		ServletContext sc = getServletContext();
		sc.getRequestDispatcher("/AnswerView.jsp").forward(request, response);
		
	}

}
