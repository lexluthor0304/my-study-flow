package instance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class InstanceSample
 */
@WebServlet("/InstanceSample")
public class InstanceSample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InstanceSample() {
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
		StringBuffer sBuffer = new StringBuffer();
		
		sBuffer.append("<html>");
		sBuffer.append("<head>");
		sBuffer.append("<meta charset=\"UTF-8\">");
		sBuffer.append("<title>サンプル</title>");
		sBuffer.append("</head>");
		
		sBuffer.append("<body>");
		int count = 0;
		count++;
		sBuffer.append("<p>訪問人数:");
		sBuffer.append(count);
		sBuffer.append("</p>");
		sBuffer.append("</body>");
		sBuffer.append("</html>");
		out.println(new String(sBuffer));
		out.close();
		
	}

}
