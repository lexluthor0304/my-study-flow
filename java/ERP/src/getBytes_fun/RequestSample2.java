package getBytes_fun;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestSample2
 */
// @WebServlet(description = "文字コード操作", urlPatterns = { "/RequestSample2" })
public class RequestSample2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset = UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();

		String tmp;
		String name = "";

		tmp = request.getParameter("name");
		if (tmp == null || tmp.length() == 0) {
			name = "未制定";
		} else {
			name = tmp;
//			name = decodeString(tmp);
		}

		int old;
		tmp = request.getParameter("old");
		if (tmp == null || tmp.length() == 0) {
			old = -1;
		} else {
			try {
				old = Integer.parseInt(tmp);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				old = -1;
			}
		}

		String tmps[] = request.getParameterValues("food");
		String food = "";
		if (tmps != null) {
			for (int i = 0; i < tmps.length; i++) {
				food += tmps[i];
//				food += decodeString(tmps[i]);
				food += "";
			}
		} else {
			food = "ありません";
		}

		StringBuffer sb = new StringBuffer();

		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>サンプル</title>");
		sb.append("</head>");
		sb.append("<body>");

		sb.append("<p>お名前は ");
		sb.append(name);
		sb.append(" です</p>");

		sb.append("<p>年齢は ");
		if (old == -1) {
			sb.append(" 未設定です</p>");
		} else {
			sb.append(old);
			sb.append(" です</p>");
		}

		sb.append("<p>好きな果物は ");
		sb.append(food);
		sb.append(" です</p>");
		sb.append("</body>");
		sb.append("</html>");

		out.println(new String(sb));

		out.close();
	}

//	protected String decodeString(String str) {
//		// TODO Auto-generated method stub
//		try {
//			byte[] byteData = str.getBytes("ISO_8859_1");
//			str = new String(byteData, "UTF-8");
//		} catch (Exception e) {
//			// TODO: handle exception
//			return null;
//		}
//		return str;
//	}

}
