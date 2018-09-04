package responseSample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseSample
 */
@WebServlet("/ResponseSample")
public class ResponseSample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String tmp;
		String url = "";
		tmp = request.getParameter("url");
		
		if (tmp == null || tmp.length() == 0) {
			url = "http://www.excite.co.jp/";
		} else {
			url = "http://" + tmp;
		}
		
		response.sendRedirect(url);
	}

}
