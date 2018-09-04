package studyDOGET;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class New_doGet
 */
@WebServlet("/New_doGet")
public class New_doGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public New_doGet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());

		PrintWriter out = response.getWriter();
		
		out.println(createHTML("GET"));
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println(createHTML("POST"));
		out.close();
		
	}

	private String createHTML(String methodType) {
		// TODO Auto-generated method stub
		StringBuffer sBuffer = new StringBuffer();
		
		sBuffer.append("<html>");
		sBuffer.append("<head>");
		sBuffer.append("<meta charset=\"UTF-8\">");
		sBuffer.append("<title>サンプル</title>");
		sBuffer.append("</head>");
		
		sBuffer.append("<p>");
		sBuffer.append(methodType);
		sBuffer.append("メソッドで呼び出されました</p>");
		sBuffer.append("<p><a href=\" Sample1\">リンク</a></p>");
		sBuffer.append("<form action=\" Sample1\" method=\"get\">");
		sBuffer.append("<input type=\"submit\" value=\"GETで送信\">");
		sBuffer.append("</form>");
		
		sBuffer.append("<form action=\" Sample1\" method=\"post\">");
		sBuffer.append("<input type=\"submit\" value=\"POSTで送信\">");
		sBuffer.append("</form>");
		
		sBuffer.append("</body>");
		sBuffer.append("</html>");
		
		return (new String(sBuffer));
	}

}
