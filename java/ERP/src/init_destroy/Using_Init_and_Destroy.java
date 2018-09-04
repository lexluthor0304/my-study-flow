package init_destroy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Using_Init_and_Destroy
 */
@WebServlet("/Using_Init_and_Destroy")
public class Using_Init_and_Destroy extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	int count;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Using_Init_and_Destroy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		count = 100;
		log("カウント開始！");
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		log("カウントの最終値は" + count + "だった。");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=Utf-8");
		PrintWriter out = response.getWriter();
		StringBuffer sb = new StringBuffer();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>サンプル</title>");
		sb.append("</head>");
		sb.append("<body>");
		
		count++;
		sb.append("<p>訪問人数:");
		sb.append(count);
		sb.append("</p>");

		sb.append("</body>");
		sb.append("</html>");

		out.println(new String(sb));
		out.close();
	}

}
