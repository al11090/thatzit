package thatzit;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnswerDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String pass = request.getParameter("password");
		
		Answer ans = new Answer(id);
		String res;
		if(pass == ans.getPassword()){
			ans.delete();
			res = "Delete Success";
		}else{
			res = "Delete Failed";
		}
		request.setAttribute("result", res);
		
		ServletContext sc = getServletContext();
		sc.getRequestDispatcher("/AnswerDelete.jsp").forward(request, response);
		
	}

}
