package parameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestSample
 */
//@WebServlet(description = "how to use parameter", urlPatterns = { "/RequestSample" })
public class RequestSample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name = request.getParameter("name");
		
		int old = 0;
		String tmp = request.getParameter("old");
		if (tmp == null || tmp.length() == 0) {
			old = -1;
		} else {
			try {
				old = Integer.parseInt(tmp);
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}
		String food[] = request.getParameterValues("food");
		StringBuffer sBuffer = new StringBuffer();
		
		sBuffer.append("<html>");
		sBuffer.append("<head>");
		sBuffer.append("<title>サンプル</title>");
		sBuffer.append("</head>");
		sBuffer.append("<body>");
		sBuffer.append("<p>お名前は ");
		sBuffer.append(name);
		sBuffer.append(" です</p>");
		sBuffer.append("<p>年齢は ");
		
		if (old == -1) {
			sBuffer.append("未設定です</>");
		} else {
			sBuffer.append(old);
			sBuffer.append(" です</p>");
		}
		sBuffer.append("<p>好きな果物は ");
		if (food != null) {
			for (int i = 0; i < food.length; i++) {
				sBuffer.append(food[i]);
				sBuffer.append(" ");
			}
			sBuffer.append(" です</p>");
		} else {
			sBuffer.append("選択されていません</p>");
		}
		sBuffer.append("</body>");
		sBuffer.append("<html>");
		out.println(new String(sBuffer));
		out.close();
	}

}
